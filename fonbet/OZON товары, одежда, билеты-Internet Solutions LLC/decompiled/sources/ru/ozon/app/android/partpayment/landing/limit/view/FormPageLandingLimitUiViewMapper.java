package ru.ozon.app.android.partpayment.landing.limit.view;

import A00.a;
import B0.A0;
import Pc.a;
import android.view.View;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.composer.widgets.base.WidgetViewMapper;
import ru.ozon.app.android.partpayment.R$layout;
import ru.ozon.app.android.partpayment.landing.limit.data.FormPageLandingLimitDTO;
import ru.ozon.composer.ui.widget.k;

@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001%B\u0017\b\u0007\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\tR6\u0010\u000e\u001a\u001e\u0012\u0004\u0012\u00020\u0002\u0012\b\u0012\u00060\u000bj\u0002`\f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\r0\n8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R(\u0010\u0019\u001a\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00180\u00170\r8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR.\u0010\u001d\u001a\u0016\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00030\n8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u000f\u001a\u0004\b\u001e\u0010\u0011R<\u0010#\u001a$\u0012\u0004\u0012\u00020\u001f\u0012\u0004\u0012\u00020 \u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u00030!j\b\u0012\u0004\u0012\u00020\u0003`\"0\n8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b#\u0010\u000f\u001a\u0004\b$\u0010\u0011¨\u0006&"}, d2 = {"Lru/ozon/app/android/partpayment/landing/limit/view/FormPageLandingLimitUiViewMapper;", "Lru/ozon/app/android/composer/widgets/base/WidgetViewMapper;", "Lru/ozon/app/android/partpayment/landing/limit/data/FormPageLandingLimitDTO;", "Lru/ozon/app/android/partpayment/landing/limit/view/FormPageLandingLimitVO;", "LPc/a;", "Lru/ozon/app/android/partpayment/landing/limit/view/LandingLimitViewModelImpl;", "pViewModel", "<init>", "(LPc/a;)V", "LPc/a;", "Lkotlin/Function2;", "Ll20/d;", "Lru/ozon/app/android/composer/view/WidgetInfo;", "", "mapper", "Lkotlin/jvm/functions/Function2;", "getMapper", "()Lkotlin/jvm/functions/Function2;", "", "layout", "Ljava/lang/Integer;", "getLayout", "()Ljava/lang/Integer;", "Ljava/lang/Class;", "LA00/a$J$a;", "supportedUpdates", "Ljava/util/List;", "getSupportedUpdates", "()Ljava/util/List;", "updateConsumer", "getUpdateConsumer", "Landroid/view/View;", "Lru/ozon/app/android/composer/ComposerReferences;", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/composer/widgets/base/WidgetViewHolder;", "holderProducer", "getHolderProducer", "FormPageLandingLimitUpdate", "homecredit_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class FormPageLandingLimitUiViewMapper extends WidgetViewMapper<FormPageLandingLimitDTO, FormPageLandingLimitVO> {

    @NotNull
    private final Function2<View, ComposerReferences, k<FormPageLandingLimitVO>> holderProducer;
    private final Integer layout;

    @NotNull
    private final Function2<FormPageLandingLimitDTO, d, List<FormPageLandingLimitVO>> mapper;

    @NotNull
    private final a<LandingLimitViewModelImpl> pViewModel;

    @NotNull
    private final List<Class<? extends a.J.InterfaceC0007a>> supportedUpdates;

    @NotNull
    private final Function2<a.J.InterfaceC0007a, FormPageLandingLimitVO, FormPageLandingLimitVO> updateConsumer;

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0010\u001a\u0004\b\u0011\u0010\u0007¨\u0006\u0012"}, d2 = {"Lru/ozon/app/android/partpayment/landing/limit/view/FormPageLandingLimitUiViewMapper$FormPageLandingLimitUpdate;", "LA00/a$J$a;", "", "limitText", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getLimitText", "homecredit_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class FormPageLandingLimitUpdate implements a.J.InterfaceC0007a {

        @NotNull
        private final String limitText;

        public FormPageLandingLimitUpdate(@NotNull String limitText) {
            Intrinsics.checkNotNullParameter(limitText, "limitText");
            this.limitText = limitText;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof FormPageLandingLimitUpdate) && Intrinsics.d(this.limitText, ((FormPageLandingLimitUpdate) other).limitText);
        }

        @NotNull
        public final String getLimitText() {
            return this.limitText;
        }

        public int hashCode() {
            return this.limitText.hashCode();
        }

        @NotNull
        public String toString() {
            return A0.b("FormPageLandingLimitUpdate(limitText=", this.limitText, ")");
        }
    }

    public FormPageLandingLimitUiViewMapper(@NotNull Pc.a<LandingLimitViewModelImpl> pViewModel) {
        Intrinsics.checkNotNullParameter(pViewModel, "pViewModel");
        this.pViewModel = pViewModel;
        this.mapper = FormPageLandingLimitUiViewMapper$mapper$1.INSTANCE;
        this.layout = Integer.valueOf(R$layout.widget_form_page_landing_limit);
        this.supportedUpdates = C7714v.a0(FormPageLandingLimitUpdate.class);
        this.updateConsumer = FormPageLandingLimitUiViewMapper$updateConsumer$1.INSTANCE;
        this.holderProducer = new FormPageLandingLimitUiViewMapper$holderProducer$1(this);
    }

    @Override // ru.ozon.app.android.composer.widgets.base.WidgetViewMapper
    @NotNull
    /* renamed from: getHolderProducer */
    public Function2<View, ComposerReferences, k<FormPageLandingLimitVO>> mo614getHolderProducer() {
        return this.holderProducer;
    }

    @Override // ru.ozon.composer.ui.widget.g
    public Integer getLayout() {
        return this.layout;
    }

    @Override // ru.ozon.app.android.composer.widgets.base.WidgetViewMapper
    @NotNull
    public Function2<FormPageLandingLimitDTO, d, List<FormPageLandingLimitVO>> getMapper() {
        return this.mapper;
    }

    @Override // ru.ozon.composer.ui.widget.g, I00.d
    @NotNull
    public List<Class<? extends a.J.InterfaceC0007a>> getSupportedUpdates() {
        return this.supportedUpdates;
    }

    @Override // ru.ozon.app.android.composer.widgets.base.WidgetViewMapper
    @NotNull
    public Function2<a.J.InterfaceC0007a, FormPageLandingLimitVO, FormPageLandingLimitVO> getUpdateConsumer() {
        return this.updateConsumer;
    }
}
