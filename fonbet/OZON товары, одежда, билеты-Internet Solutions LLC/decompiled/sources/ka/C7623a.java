package ka;

import S0.InterfaceC3967k;
import com.vk.id.group.subscription.common.style.GroupSubscriptionStyle;
import com.vk.id.group.subscription.compose.util.SecondaryButtonKt;
import com.vk.id.onetap.common.auth.style.InternalVKIDButtonStyle;
import com.vk.id.onetap.compose.button.auth.VKIDButtonSmallKt;
import com.vk.id.onetap.compose.button.auth.VKIDSmallButtonState;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import m0.C7980b;

/* renamed from: ka.a, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final /* synthetic */ class C7623a implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f71174a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f71175b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f71176c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f71177d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f71178e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f71179f;

    public /* synthetic */ C7623a(Object obj, Object obj2, Object obj3, Object obj4, int i11, int i12) {
        this.f71174a = i12;
        this.f71176c = obj;
        this.f71177d = obj2;
        this.f71178e = obj3;
        this.f71179f = obj4;
        this.f71175b = i11;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Unit SecondaryButton$lambda$0;
        Unit SmallButtonContent$lambda$23;
        switch (this.f71174a) {
            case 0:
                int intValue = ((Integer) obj2).intValue();
                Function0 function0 = (Function0) this.f71179f;
                int i11 = this.f71175b;
                SecondaryButton$lambda$0 = SecondaryButtonKt.SecondaryButton$lambda$0((GroupSubscriptionStyle) this.f71176c, (String) this.f71177d, (String) this.f71178e, function0, i11, (InterfaceC3967k) obj, intValue);
                return SecondaryButton$lambda$0;
            default:
                int intValue2 = ((Integer) obj2).intValue();
                C7980b c7980b = (C7980b) this.f71179f;
                int i12 = this.f71175b;
                SmallButtonContent$lambda$23 = VKIDButtonSmallKt.SmallButtonContent$lambda$23((VKIDSmallButtonState) this.f71176c, (InternalVKIDButtonStyle) this.f71177d, (C7980b) this.f71178e, c7980b, i12, (InterfaceC3967k) obj, intValue2);
                return SmallButtonContent$lambda$23;
        }
    }
}
