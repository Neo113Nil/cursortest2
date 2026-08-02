package i70;

import fd.InterfaceC6511n;
import kotlin.Unit;
import ru.ozon.fintech.ui.textfieldV20.TextFieldV20WrapperView;
import ru.ozon.uni.android.wrappers.mainaddon.data.AddonSide;

/* loaded from: classes3.dex */
public final /* synthetic */ class h implements InterfaceC6511n {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f65979a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f65980b;

    public /* synthetic */ h(Object obj, int i11) {
        this.f65979a = i11;
        this.f65980b = obj;
    }

    @Override // fd.InterfaceC6511n
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        Unit bindState$lambda$15$lambda$14;
        String str = (String) obj;
        switch (this.f65979a) {
            case 0:
                return l.e0((l) this.f65980b, str, (String) obj2, (String) obj3);
            default:
                bindState$lambda$15$lambda$14 = TextFieldV20WrapperView.bindState$lambda$15$lambda$14((TextFieldV20WrapperView) this.f65980b, str, (AddonSide) obj2, (String) obj3);
                return bindState$lambda$15$lambda$14;
        }
    }
}
