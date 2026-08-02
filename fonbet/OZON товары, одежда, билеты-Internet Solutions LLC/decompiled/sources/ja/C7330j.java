package ja;

import B1.m0;
import P0.EnumC3790y1;
import S0.InterfaceC3978p0;
import androidx.collection.C5132a;
import com.vk.id.group.subscription.compose.ui.GroupSubscriptionSheetKt;
import com.vk.id.group.subscription.compose.util.TightWrapTextKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* renamed from: ja.j, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final /* synthetic */ class C7330j implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f69586a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f69587b;

    public /* synthetic */ C7330j(Object obj, int i11) {
        this.f69586a = i11;
        this.f69587b = obj;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        boolean rememberGroupSubscriptionSheetStateInternal$lambda$76$lambda$75;
        Unit TightWrapText_pNBRTJQ$lambda$7$lambda$6$lambda$3;
        switch (this.f69586a) {
            case 0:
                rememberGroupSubscriptionSheetStateInternal$lambda$76$lambda$75 = GroupSubscriptionSheetKt.rememberGroupSubscriptionSheetStateInternal$lambda$76$lambda$75((InterfaceC3978p0) this.f69587b, (EnumC3790y1) obj);
                return Boolean.valueOf(rememberGroupSubscriptionSheetStateInternal$lambda$76$lambda$75);
            case 1:
                TightWrapText_pNBRTJQ$lambda$7$lambda$6$lambda$3 = TightWrapTextKt.TightWrapText_pNBRTJQ$lambda$7$lambda$6$lambda$3((m0) this.f69587b, (m0.a) obj);
                return TightWrapText_pNBRTJQ$lambda$7$lambda$6$lambda$3;
            default:
                return ru.ozon.android.messenger.framework.data.local.database.draft.i.o((ru.ozon.android.messenger.framework.data.local.database.draft.i) this.f69587b, (C5132a) obj);
        }
    }
}
