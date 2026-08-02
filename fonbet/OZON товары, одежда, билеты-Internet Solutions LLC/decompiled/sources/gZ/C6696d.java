package gZ;

import Sc.r;
import Sc.s;
import android.content.Context;
import bZ.C5613g;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.q;
import com.squareup.moshi.x;
import hZ.C6894a;
import java.io.File;
import java.io.FileWriter;
import java.util.Locale;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import mZ.C8116a;
import mZ.C8117b;
import org.jetbrains.annotations.NotNull;
import ru.ozon.cdn.chooser.internal.data.dto.CdnConfigResponse;
import ru.ozon.cdn.chooser.internal.data.dto.CdnConfigResponseJsonAdapter;
import sf.C9681g;
import xe.B0;
import xe.C10727i;
import xe.H0;
import xe.M;

/* renamed from: gZ.d, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C6696d {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final Moshi f64175a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final Context f64176b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final XY.d f64177c;

    /* renamed from: d, reason: collision with root package name */
    private B0 f64178d;

    @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.cdn.chooser.internal.domain.CdnChooserCachedConfigInteractor$cacheCdnChooserConfig$1", f = "CdnChooserCachedConfigInteractor.kt", l = {}, m = "invokeSuspend")
    /* renamed from: gZ.d$a */
    static final class a extends kotlin.coroutines.jvm.internal.j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ CdnConfigResponse f64180e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(CdnConfigResponse cdnConfigResponse, kotlin.coroutines.d<? super a> dVar) {
            super(2, dVar);
            this.f64180e = cdnConfigResponse;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return C6696d.this.new a(this.f64180e, dVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
            return ((a) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            C6696d c6696d = C6696d.this;
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            s.b(obj);
            try {
                C9681g sink = new C9681g();
                Intrinsics.checkNotNullParameter(sink, "sink");
                new CdnConfigResponseJsonAdapter(c6696d.f64175a).mo44toJson((x) new q(sink), this.f64180e);
                String G02 = sink.G0();
                File f7 = c6696d.f(c6696d.f64177c.a());
                if (!f7.exists()) {
                    f7.createNewFile();
                }
                FileWriter fileWriter = new FileWriter(f7);
                try {
                    fileWriter.write(G02);
                    Unit unit = Unit.f71690a;
                    fileWriter.close();
                } finally {
                }
            } catch (Exception e11) {
                C8116a.f74679a.c("Error CDN config caching", e11);
            }
            return Unit.f71690a;
        }
    }

    public C6696d(@NotNull Moshi moshi, @NotNull Context context, @NotNull XY.d config) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(config, "config");
        this.f64175a = moshi;
        this.f64176b = context;
        this.f64177c = config;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final File f(Fb0.e eVar) {
        File cacheDir = this.f64176b.getCacheDir();
        String lowerCase = eVar.name().toLowerCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        return new File(cacheDir, "cdn_chooser_config_" + lowerCase + ".json");
    }

    public final void d(@NotNull CdnConfigResponse cdnConfigResponse) {
        Intrinsics.checkNotNullParameter(cdnConfigResponse, "cdnConfigResponse");
        B0 b02 = this.f64178d;
        if (b02 != null) {
            ((H0) b02).j(null);
        }
        this.f64178d = C10727i.c(C8117b.a(), null, null, new a(cdnConfigResponse, null), 3);
    }

    public final C6894a e() {
        Object a11;
        File f7 = f(this.f64177c.a());
        if (!f7.exists()) {
            C8116a.f74679a.b();
            return null;
        }
        try {
            r.Companion companion = r.INSTANCE;
            CdnConfigResponse fromJson = new CdnConfigResponseJsonAdapter(this.f64175a).fromJson(bd.h.l(f7));
            a11 = fromJson != null ? C5613g.a(fromJson) : null;
        } catch (Throwable th2) {
            r.Companion companion2 = r.INSTANCE;
            a11 = s.a(th2);
        }
        return (C6894a) (a11 instanceof r.b ? null : a11);
    }
}
