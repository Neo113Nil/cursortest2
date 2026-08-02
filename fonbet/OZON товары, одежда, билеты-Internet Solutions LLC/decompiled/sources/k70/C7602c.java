package k70;

import kotlin.jvm.functions.Function1;
import ru.ozon.fintech.ui.textatomV2.TextAtomV2WrapperView;

/* renamed from: k70.c, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final /* synthetic */ class C7602c implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f71049a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f71050b;

    public /* synthetic */ C7602c(Object obj, int i11) {
        this.f71049a = i11;
        this.f71050b = obj;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        String spanClickListener$lambda$1;
        switch (this.f71049a) {
            case 0:
                return ru.ozon.fintech.features.offline.presentation.select.a.e0((ru.ozon.fintech.features.offline.presentation.select.a) this.f71050b, (e40.b) obj);
            default:
                spanClickListener$lambda$1 = TextAtomV2WrapperView.spanClickListener$lambda$1((TextAtomV2WrapperView) this.f71050b, (String) obj);
                return spanClickListener$lambda$1;
        }
    }
}
