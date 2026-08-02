package ru.ozon.app.android.bank.widgets.bankAccountStatus.core;

import DA.a;
import android.view.View;
import java.util.List;
import k20.C7473e;
import k20.C7475g;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.di.ActionComponentApi;
import ru.ozon.app.android.bank.R$layout;
import ru.ozon.app.android.bank.widgets.bankAccountStatus.data.BankAccountStatusDTO;
import ru.ozon.app.android.bank.widgets.bankAccountStatus.presentation.BankAccountStatusVO;
import ru.ozon.app.android.bank.widgets.bankAccountStatus.presentation.BankAccountStatusWidgetVH;
import ru.ozon.app.android.bank.widgets.di.BankAccountStatusWidgetComponent;
import ru.ozon.app.android.bank.widgets.di.DaggerBankAccountStatusWidgetComponent;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.composer.widgets.v2.WidgetViewMapper2;

@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B\t\b\u0007¢\u0006\u0004\b\u0005\u0010\u0006J+\u0010\f\u001a\u0012\u0012\u0004\u0012\u00020\u00020\nj\b\u0012\u0004\u0012\u00020\u0002`\u000b2\n\u0010\t\u001a\u00060\u0007j\u0002`\bH\u0016¢\u0006\u0004\b\f\u0010\rR6\u0010\u0012\u001a\u001e\u0012\u0004\u0012\u00020\u0003\u0012\b\u0012\u00060\u000fj\u0002`\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00110\u000e8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0017\u001a\u00020\u00168\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR,\u0010\u001e\u001a\u0014\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u001d0\u000e8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u0013\u001a\u0004\b\u001f\u0010\u0015¨\u0006 "}, d2 = {"Lru/ozon/app/android/bank/widgets/bankAccountStatus/core/BankAccountStatusViewMapper;", "Lru/ozon/app/android/composer/widgets/v2/WidgetViewMapper2;", "Lru/ozon/app/android/bank/widgets/di/BankAccountStatusWidgetComponent;", "Lru/ozon/app/android/bank/widgets/bankAccountStatus/data/BankAccountStatusDTO;", "Lru/ozon/app/android/bank/widgets/bankAccountStatus/presentation/BankAccountStatusVO;", "<init>", "()V", "Lk20/g;", "Lru/ozon/app/android/composer/widgets/v2/di/ComposerWidgetComponentStorage;", "storage", "Lk20/e;", "Lru/ozon/app/android/composer/widgets/v2/di/WidgetComponent;", "widgetComponent", "(Lk20/g;)Lk20/e;", "Lkotlin/Function2;", "Ll20/d;", "Lru/ozon/app/android/composer/view/WidgetInfo;", "", "mapper", "Lkotlin/jvm/functions/Function2;", "getMapper", "()Lkotlin/jvm/functions/Function2;", "", "layout", "I", "getLayout", "()Ljava/lang/Integer;", "Landroid/view/View;", "Lru/ozon/app/android/composer/ComposerReferences;", "Lru/ozon/app/android/bank/widgets/bankAccountStatus/presentation/BankAccountStatusWidgetVH;", "holderProducer", "getHolderProducer", "ozonbank_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class BankAccountStatusViewMapper extends WidgetViewMapper2<BankAccountStatusWidgetComponent, BankAccountStatusDTO, BankAccountStatusVO> {

    @NotNull
    private final Function2<BankAccountStatusDTO, d, List<BankAccountStatusVO>> mapper = new BankAccountStatusMapper();
    private final int layout = R$layout.widget_bank_account_status;

    @NotNull
    private final Function2<View, ComposerReferences, BankAccountStatusWidgetVH> holderProducer = new BankAccountStatusViewMapper$holderProducer$1(this);

    /* JADX INFO: Access modifiers changed from: private */
    public static final BankAccountStatusWidgetComponent widgetComponent$lambda$0(C7475g c7475g) {
        return DaggerBankAccountStatusWidgetComponent.factory().create((ActionComponentApi) c7475g.getComponent(ActionComponentApi.class));
    }

    @Override // ru.ozon.app.android.composer.widgets.base.WidgetViewMapper
    @NotNull
    /* renamed from: getHolderProducer */
    public Function2<View, ComposerReferences, BankAccountStatusWidgetVH> mo614getHolderProducer() {
        return this.holderProducer;
    }

    @Override // ru.ozon.composer.ui.widget.g
    @NotNull
    public Integer getLayout() {
        return Integer.valueOf(this.layout);
    }

    @Override // ru.ozon.app.android.composer.widgets.base.WidgetViewMapper
    @NotNull
    public Function2<BankAccountStatusDTO, d, List<BankAccountStatusVO>> getMapper() {
        return this.mapper;
    }

    @Override // ru.ozon.app.android.composer.widgets.v2.ViewMapper2
    @NotNull
    public C7473e<BankAccountStatusWidgetComponent> widgetComponent(@NotNull C7475g storage) {
        Intrinsics.checkNotNullParameter(storage, "storage");
        return new C7473e<>(N.b(BankAccountStatusWidgetComponent.class), new a(storage, 16));
    }
}
