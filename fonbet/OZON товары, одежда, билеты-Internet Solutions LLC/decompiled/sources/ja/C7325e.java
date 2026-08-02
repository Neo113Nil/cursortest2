package ja;

import S0.InterfaceC3967k;
import Sc.InterfaceC4003e;
import com.vk.id.group.subscription.common.style.GroupSubscriptionStyle;
import com.vk.id.group.subscription.compose.ui.GroupSubscriptionSheetKt;
import com.vk.id.group.subscription.compose.ui.GroupSubscriptionSheetState;
import com.vk.id.group.subscription.compose.util.PrimaryButtonKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* renamed from: ja.e, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final /* synthetic */ class C7325e implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f69568a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ GroupSubscriptionStyle f69569b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Function0 f69570c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f69571d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f69572e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ InterfaceC4003e f69573f;

    public /* synthetic */ C7325e(GroupSubscriptionStyle groupSubscriptionStyle, GroupSubscriptionSheetState groupSubscriptionSheetState, Function1 function1, Function0 function0, int i11) {
        this.f69569b = groupSubscriptionStyle;
        this.f69572e = groupSubscriptionSheetState;
        this.f69573f = function1;
        this.f69570c = function0;
        this.f69571d = i11;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Unit ResubscribingState$lambda$44;
        Unit PrimaryButton$lambda$0;
        switch (this.f69568a) {
            case 0:
                int intValue = ((Integer) obj2).intValue();
                Function0 function0 = this.f69570c;
                int i11 = this.f69571d;
                ResubscribingState$lambda$44 = GroupSubscriptionSheetKt.ResubscribingState$lambda$44(this.f69569b, (GroupSubscriptionSheetState) this.f69572e, (Function1) this.f69573f, function0, i11, (InterfaceC3967k) obj, intValue);
                return ResubscribingState$lambda$44;
            default:
                int intValue2 = ((Integer) obj2).intValue();
                Function2 function2 = (Function2) this.f69573f;
                int i12 = this.f69571d;
                PrimaryButton$lambda$0 = PrimaryButtonKt.PrimaryButton$lambda$0(this.f69569b, (String) this.f69572e, this.f69570c, function2, i12, (InterfaceC3967k) obj, intValue2);
                return PrimaryButton$lambda$0;
        }
    }

    public /* synthetic */ C7325e(GroupSubscriptionStyle groupSubscriptionStyle, String str, Function0 function0, Function2 function2, int i11) {
        this.f69569b = groupSubscriptionStyle;
        this.f69572e = str;
        this.f69570c = function0;
        this.f69573f = function2;
        this.f69571d = i11;
    }
}
