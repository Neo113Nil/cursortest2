package d90;

import android.content.Context;
import android.content.SharedPreferences;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.fintech.network.domain.ExternalNetworkSettings;

/* renamed from: d90.e, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C6117e implements Jb.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f61379a = 0;

    /* renamed from: b, reason: collision with root package name */
    private final Pc.a f61380b;

    /* renamed from: c, reason: collision with root package name */
    private final Jb.e f61381c;

    public C6117e(Jb.f fVar, Pc.a aVar) {
        this.f61380b = aVar;
        this.f61381c = fVar;
    }

    @Override // Pc.a
    public final Object get() {
        switch (this.f61379a) {
            case 0:
                return new C6116d((SharedPreferences) this.f61380b.get(), (ExternalNetworkSettings) ((Jb.f) this.f61381c).get());
            default:
                ru.ozon.android.messenger.framework.composer.emptyscreen.widgetfactory.b fastAnswersTemplateCustomWidgetFactory = (ru.ozon.android.messenger.framework.composer.emptyscreen.widgetfactory.b) ((P30.g) this.f61381c).get();
                Context context = (Context) this.f61380b.get();
                Intrinsics.checkNotNullParameter(fastAnswersTemplateCustomWidgetFactory, "fastAnswersTemplateCustomWidgetFactory");
                Intrinsics.checkNotNullParameter(context, "context");
                return new ru.ozon.android.messenger.framework.composer.emptyscreen.c(fastAnswersTemplateCustomWidgetFactory, context);
        }
    }

    public C6117e(P30.g gVar, Pc.a aVar) {
        this.f61381c = gVar;
        this.f61380b = aVar;
    }
}
