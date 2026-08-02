package p5;

import android.webkit.MimeTypeMap;
import java.io.File;
import n5.EnumC8444d;
import org.jetbrains.annotations.NotNull;
import p5.h;
import sf.AbstractC9688n;
import sf.D;
import v5.C10239m;

/* loaded from: classes8.dex */
public final class i implements h {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final File f80225a;

    public static final class a implements h.a<File> {
        @Override // p5.h.a
        public final h a(Object obj, C10239m c10239m) {
            return new i((File) obj);
        }
    }

    public i(@NotNull File file) {
        this.f80225a = file;
    }

    @Override // p5.h
    public final Object a(@NotNull kotlin.coroutines.d<? super g> dVar) {
        String str = D.f98654b;
        File file = this.f80225a;
        return new m(new n5.m(D.a.b(file), AbstractC9688n.f98744a, null, null), MimeTypeMap.getSingleton().getMimeTypeFromExtension(bd.h.i(file)), EnumC8444d.DISK);
    }
}
