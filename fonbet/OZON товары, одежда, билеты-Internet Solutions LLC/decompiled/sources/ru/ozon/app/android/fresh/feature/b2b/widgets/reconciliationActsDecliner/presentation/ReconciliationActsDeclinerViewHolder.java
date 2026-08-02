package ru.ozon.app.android.fresh.feature.b2b.widgets.reconciliationActsDecliner.presentation;

import Ae.C2399j;
import Ae.C2408n0;
import B0.C2454a;
import K00.b;
import N3.C3660k;
import Sc.InterfaceC4008j;
import Sc.o;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.a;
import androidx.fragment.app.ComponentCallbacksC5392m;
import androidx.lifecycle.J;
import androidx.lifecycle.K;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.composerCommonViewKit.parsing.JsonParser;
import ru.ozon.app.android.action.ActionHandler;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.fresh.feature.b2b.databinding.WidgetReconciliationActsDeclinerBinding;
import ru.ozon.app.android.fresh.feature.b2b.utils.UtilsKt;
import ru.ozon.app.android.fresh.feature.b2b.widgets.reconciliationActsDecliner.data.ReconciliationActsDeclinerDTO;
import ru.ozon.app.android.fresh.feature.b2b.widgets.reconciliationActsDecliner.presentation.ReconciliationActsDeclinerVO;
import ru.ozon.app.android.ugc.core.widgets.selectionItemDescription.data.SelectionItemDescriptionDTO;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.app.android.utils.LazyUtilsKt;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.uni.android.atom.loader.ui.LoaderView;
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.android.controls.buttonV3.ButtonV3View;
import ru.ozon.uni.android.controls.buttonV3.IconButtonV3View;
import ru.ozon.uni.android.flashbar.factory.FlashbarFactory;
import ru.ozon.uni.android.uikit.common.StyleParser;
import ru.ozon.uni.android.uikit.extensions.view.ContextExtKt;
import ru.ozon.uni.android.uikit.extensions.view.ViewExtKt;
import ru.ozon.uni.android.uikitsdk.Color;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO;
import ru.ozon.uni.atoms.data.controls.button.IconButtonV3DTO;
import ru.ozon.uni.atoms.data.text.TextDTO;
import ru.ozon.uni.atoms.utils.OzonSpannableStringKt;
import ru.ozon.uni.atoms.v3.holders.controls.buttonV3.ButtonV3HolderKt;
import ru.ozon.uni.atoms.v3.holders.controls.buttonV3.IconButtonV3HolderKt;
import ru.ozon.uni.atoms.v3.holders.text.TextHolderKt;
import ru.ozon.uni.core.R$color;
import ru.ozon.uni.core.R$drawable;
import ru.ozon.uni.core.UniColors;

@Metadata(d1 = {"\u0000\u008e\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0001\u0018\u0000 M2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002MNB+\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\n\u0010\t\u001a\u00060\u0007j\u0002`\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0015\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0019\u001a\u00020\u00102\u0006\u0010\u0018\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ'\u0010#\u001a\u00020\u00102\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010\"\u001a\u00020!H\u0002¢\u0006\u0004\b#\u0010$J!\u0010)\u001a\u00020'2\b\u0010&\u001a\u0004\u0018\u00010%2\u0006\u0010(\u001a\u00020'H\u0002¢\u0006\u0004\b)\u0010*J\u0017\u0010,\u001a\u00020\u00102\u0006\u0010+\u001a\u00020%H\u0002¢\u0006\u0004\b,\u0010-J\u0017\u00100\u001a\u00020\u00102\u0006\u0010/\u001a\u00020.H\u0014¢\u0006\u0004\b0\u00101J\u001f\u00105\u001a\u00020\u00102\u0006\u00102\u001a\u00020\u00022\u0006\u00104\u001a\u000203H\u0014¢\u0006\u0004\b5\u00106R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u00107R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u00108R\u0018\u0010\t\u001a\u00060\u0007j\u0002`\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u00109R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010:R \u0010=\u001a\u000e\u0012\u0004\u0012\u00020<\u0012\u0004\u0012\u00020\u00100;8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b=\u0010>R\u0014\u0010@\u001a\u00020?8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b@\u0010AR\u001b\u0010F\u001a\u00020'8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bB\u0010C\u001a\u0004\bD\u0010ER\u001b\u0010I\u001a\u00020'8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bG\u0010C\u001a\u0004\bH\u0010ER\u001b\u0010L\u001a\u00020'8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bJ\u0010C\u001a\u0004\bK\u0010E¨\u0006O"}, d2 = {"Lru/ozon/app/android/fresh/feature/b2b/widgets/reconciliationActsDecliner/presentation/ReconciliationActsDeclinerViewHolder;", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/fresh/feature/b2b/widgets/reconciliationActsDecliner/presentation/ReconciliationActsDeclinerVO;", "Lru/ozon/app/android/fresh/feature/b2b/databinding/WidgetReconciliationActsDeclinerBinding;", "binding", "Lru/ozon/app/android/composer/ComposerReferences;", "references", "Lru/ozon/android/composerCommonViewKit/parsing/JsonParser;", "Lru/ozon/app/android/network/serialize/JsonDeserializer;", "jsonDeserializer", "Lru/ozon/app/android/fresh/feature/b2b/widgets/reconciliationActsDecliner/presentation/ReconciliationActsDeclinerViewModel;", "viewModel", "<init>", "(Lru/ozon/app/android/fresh/feature/b2b/databinding/WidgetReconciliationActsDeclinerBinding;Lru/ozon/app/android/composer/ComposerReferences;Lru/ozon/android/composerCommonViewKit/parsing/JsonParser;Lru/ozon/app/android/fresh/feature/b2b/widgets/reconciliationActsDecliner/presentation/ReconciliationActsDeclinerViewModel;)V", "Lru/ozon/app/android/fresh/feature/b2b/widgets/reconciliationActsDecliner/presentation/ReconciliationActsDeclinerVO$AttachField;", "attachField", "", "bindAttachField", "(Lru/ozon/app/android/fresh/feature/b2b/widgets/reconciliationActsDecliner/presentation/ReconciliationActsDeclinerVO$AttachField;)V", "Lru/ozon/uni/atoms/data/text/TextDTO;", "policyField", "bindPolicy", "(Lru/ozon/uni/atoms/data/text/TextDTO;)V", "Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "button", "bindSubmitButton", "(Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;)V", "openFile", "()V", "Lru/ozon/uni/android/controls/buttonV3/IconButtonV3View;", "iconButton", "Lru/ozon/uni/android/atom/loader/ui/LoaderView;", "loaderView", "Lru/ozon/app/android/fresh/feature/b2b/widgets/reconciliationActsDecliner/presentation/ReconciliationActsDeclinerViewHolder$FileFieldStatus$ButtonStateWrapper;", "buttonState", "configureLoadingState", "(Lru/ozon/uni/android/controls/buttonV3/IconButtonV3View;Lru/ozon/uni/android/atom/loader/ui/LoaderView;Lru/ozon/app/android/fresh/feature/b2b/widgets/reconciliationActsDecliner/presentation/ReconciliationActsDeclinerViewHolder$FileFieldStatus$ButtonStateWrapper;)V", "", "colorToken", "", "defaultColor", "getColorByDsToken", "(Ljava/lang/String;I)I", "message", "showErrorMessage", "(Ljava/lang/String;)V", "Landroidx/lifecycle/J;", "lifecycle", "onAttachViewModel", "(Landroidx/lifecycle/J;)V", "item", "Ll20/d;", "info", "bind", "(Lru/ozon/app/android/fresh/feature/b2b/widgets/reconciliationActsDecliner/presentation/ReconciliationActsDeclinerVO;Ll20/d;)V", "Lru/ozon/app/android/fresh/feature/b2b/databinding/WidgetReconciliationActsDeclinerBinding;", "Lru/ozon/app/android/composer/ComposerReferences;", "Lru/ozon/android/composerCommonViewKit/parsing/JsonParser;", "Lru/ozon/app/android/fresh/feature/b2b/widgets/reconciliationActsDecliner/presentation/ReconciliationActsDeclinerViewModel;", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "submitActionHandler", "Lkotlin/jvm/functions/Function1;", "Lru/ozon/app/android/fresh/feature/b2b/widgets/reconciliationActsDecliner/presentation/TextFieldsAdapter;", "textFieldsAdapter", "Lru/ozon/app/android/fresh/feature/b2b/widgets/reconciliationActsDecliner/presentation/TextFieldsAdapter;", "titleTextColor$delegate", "LSc/j;", "getTitleTextColor", "()I", "titleTextColor", "descriptionTextColor$delegate", "getDescriptionTextColor", "descriptionTextColor", "errorTextColor$delegate", "getErrorTextColor", "errorTextColor", "Companion", "FileFieldStatus", "b2b_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class ReconciliationActsDeclinerViewHolder extends k<ReconciliationActsDeclinerVO> {

    @NotNull
    private final WidgetReconciliationActsDeclinerBinding binding;

    /* renamed from: descriptionTextColor$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j descriptionTextColor;

    /* renamed from: errorTextColor$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j errorTextColor;

    @NotNull
    private final JsonParser jsonDeserializer;

    @NotNull
    private final ComposerReferences references;

    @NotNull
    private final Function1<AtomAction, Unit> submitActionHandler;

    @NotNull
    private final TextFieldsAdapter textFieldsAdapter;

    /* renamed from: titleTextColor$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j titleTextColor;

    @NotNull
    private final ReconciliationActsDeclinerViewModel viewModel;

    @NotNull
    private static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: ru.ozon.app.android.fresh.feature.b2b.widgets.reconciliationActsDecliner.presentation.ReconciliationActsDeclinerViewHolder$1, reason: invalid class name */
    static final class AnonymousClass1 extends AbstractC7737t implements Function1<View, Unit> {

        @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
        /* renamed from: ru.ozon.app.android.fresh.feature.b2b.widgets.reconciliationActsDecliner.presentation.ReconciliationActsDeclinerViewHolder$1$1, reason: invalid class name and collision with other inner class name */
        static final class C17781 extends AbstractC7737t implements Function0<Unit> {
            final /* synthetic */ ReconciliationActsDeclinerViewHolder this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C17781(ReconciliationActsDeclinerViewHolder reconciliationActsDeclinerViewHolder) {
                super(0);
                this.this$0 = reconciliationActsDeclinerViewHolder;
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.f71690a;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                this.this$0.openFile();
            }
        }

        AnonymousClass1() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(View view) {
            invoke2(view);
            return Unit.f71690a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(View it) {
            Intrinsics.checkNotNullParameter(it, "it");
            if (Build.VERSION.SDK_INT >= 33) {
                ReconciliationActsDeclinerViewHolder.this.openFile();
                return;
            }
            ComponentCallbacksC5392m c11 = ReconciliationActsDeclinerViewHolder.this.references.getContainer().c();
            if (c11 != null) {
                UtilsKt.checkPermissions$default(c11, ReconciliationActsDeclinerViewHolder.this.references.getContainer().g(), false, new C17781(ReconciliationActsDeclinerViewHolder.this), 2, null);
            }
        }
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lru/ozon/app/android/fresh/feature/b2b/widgets/reconciliationActsDecliner/presentation/ReconciliationActsDeclinerViewHolder$Companion;", "", "<init>", "()V", "POLICY_MAX_LINES", "", SelectionItemDescriptionDTO.TITLE, "", "SUBTITLE", "UPLOAD_ERROR", "UNKNOWN_ERROR", "UPLOAD_ERROR_FILE_SIZE", "UPLOAD_ERROR_FILE_TYPE", "LOADED", "LOADING", "CONTENT_TYPE", "ACTION_ID", "POST_DATA_KEY", "b2b_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\r\b\u0082\b\u0018\u00002\u00020\u0001:\u0001\u001dB3\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\rR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0014\u001a\u0004\b\u0016\u0010\rR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\u001a\u001a\u0004\b\u001b\u0010\u000fR\u0017\u0010\t\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\t\u0010\u001a\u001a\u0004\b\u001c\u0010\u000f¨\u0006\u001e"}, d2 = {"Lru/ozon/app/android/fresh/feature/b2b/widgets/reconciliationActsDecliner/presentation/ReconciliationActsDeclinerViewHolder$FileFieldStatus;", "", "", "itemTitle", "itemDescription", "Lru/ozon/app/android/fresh/feature/b2b/widgets/reconciliationActsDecliner/presentation/ReconciliationActsDeclinerViewHolder$FileFieldStatus$ButtonStateWrapper;", "buttonState", "", "itemTitleColor", "itemDescriptionColor", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lru/ozon/app/android/fresh/feature/b2b/widgets/reconciliationActsDecliner/presentation/ReconciliationActsDeclinerViewHolder$FileFieldStatus$ButtonStateWrapper;II)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getItemTitle", "getItemDescription", "Lru/ozon/app/android/fresh/feature/b2b/widgets/reconciliationActsDecliner/presentation/ReconciliationActsDeclinerViewHolder$FileFieldStatus$ButtonStateWrapper;", "getButtonState", "()Lru/ozon/app/android/fresh/feature/b2b/widgets/reconciliationActsDecliner/presentation/ReconciliationActsDeclinerViewHolder$FileFieldStatus$ButtonStateWrapper;", "I", "getItemTitleColor", "getItemDescriptionColor", "ButtonStateWrapper", "b2b_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final /* data */ class FileFieldStatus {

        @NotNull
        private final ButtonStateWrapper buttonState;
        private final String itemDescription;
        private final int itemDescriptionColor;
        private final String itemTitle;
        private final int itemTitleColor;

        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u000b\u0010\nJ\u0010\u0010\f\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\f\u0010\nJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, d2 = {"Lru/ozon/app/android/fresh/feature/b2b/widgets/reconciliationActsDecliner/presentation/ReconciliationActsDeclinerViewHolder$FileFieldStatus$ButtonStateWrapper;", "", "Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;", "iconButtonDTO", "Lru/ozon/app/android/fresh/feature/b2b/widgets/reconciliationActsDecliner/data/ReconciliationActsDeclinerDTO$ColoredButton;", "loadingButtonDTO", "<init>", "(Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;Lru/ozon/app/android/fresh/feature/b2b/widgets/reconciliationActsDecliner/data/ReconciliationActsDeclinerDTO$ColoredButton;)V", "", "getBackgroundLoadingColor", "()Ljava/lang/String;", "getLoaderColor", "toString", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;", "getIconButtonDTO", "()Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;", "Lru/ozon/app/android/fresh/feature/b2b/widgets/reconciliationActsDecliner/data/ReconciliationActsDeclinerDTO$ColoredButton;", "getLoadingButtonDTO", "()Lru/ozon/app/android/fresh/feature/b2b/widgets/reconciliationActsDecliner/data/ReconciliationActsDeclinerDTO$ColoredButton;", "b2b_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class ButtonStateWrapper {
            public static final int $stable = IconButtonV3DTO.$stable;
            private final IconButtonV3DTO iconButtonDTO;
            private final ReconciliationActsDeclinerDTO.ColoredButton loadingButtonDTO;

            /* JADX WARN: Multi-variable type inference failed */
            public ButtonStateWrapper() {
                this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof ButtonStateWrapper)) {
                    return false;
                }
                ButtonStateWrapper buttonStateWrapper = (ButtonStateWrapper) other;
                return Intrinsics.d(this.iconButtonDTO, buttonStateWrapper.iconButtonDTO) && Intrinsics.d(this.loadingButtonDTO, buttonStateWrapper.loadingButtonDTO);
            }

            public final String getBackgroundLoadingColor() {
                ReconciliationActsDeclinerDTO.ColoredButton coloredButton = this.loadingButtonDTO;
                if (coloredButton != null) {
                    return coloredButton.getBackgroundColor();
                }
                return null;
            }

            public final IconButtonV3DTO getIconButtonDTO() {
                return this.iconButtonDTO;
            }

            public final String getLoaderColor() {
                ReconciliationActsDeclinerDTO.ColoredButton coloredButton = this.loadingButtonDTO;
                if (coloredButton != null) {
                    return coloredButton.getLoaderColor();
                }
                return null;
            }

            public final ReconciliationActsDeclinerDTO.ColoredButton getLoadingButtonDTO() {
                return this.loadingButtonDTO;
            }

            public int hashCode() {
                IconButtonV3DTO iconButtonV3DTO = this.iconButtonDTO;
                int hashCode = (iconButtonV3DTO == null ? 0 : iconButtonV3DTO.hashCode()) * 31;
                ReconciliationActsDeclinerDTO.ColoredButton coloredButton = this.loadingButtonDTO;
                return hashCode + (coloredButton != null ? coloredButton.hashCode() : 0);
            }

            @NotNull
            public String toString() {
                return "ButtonStateWrapper(iconButtonDTO=" + this.iconButtonDTO + ", loadingButtonDTO=" + this.loadingButtonDTO + ")";
            }

            public ButtonStateWrapper(IconButtonV3DTO iconButtonV3DTO, ReconciliationActsDeclinerDTO.ColoredButton coloredButton) {
                this.iconButtonDTO = iconButtonV3DTO;
                this.loadingButtonDTO = coloredButton;
            }

            public /* synthetic */ ButtonStateWrapper(IconButtonV3DTO iconButtonV3DTO, ReconciliationActsDeclinerDTO.ColoredButton coloredButton, int i11, DefaultConstructorMarker defaultConstructorMarker) {
                this((i11 & 1) != 0 ? null : iconButtonV3DTO, (i11 & 2) != 0 ? null : coloredButton);
            }
        }

        public FileFieldStatus(String str, String str2, @NotNull ButtonStateWrapper buttonState, int i11, int i12) {
            Intrinsics.checkNotNullParameter(buttonState, "buttonState");
            this.itemTitle = str;
            this.itemDescription = str2;
            this.buttonState = buttonState;
            this.itemTitleColor = i11;
            this.itemDescriptionColor = i12;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof FileFieldStatus)) {
                return false;
            }
            FileFieldStatus fileFieldStatus = (FileFieldStatus) other;
            return Intrinsics.d(this.itemTitle, fileFieldStatus.itemTitle) && Intrinsics.d(this.itemDescription, fileFieldStatus.itemDescription) && Intrinsics.d(this.buttonState, fileFieldStatus.buttonState) && this.itemTitleColor == fileFieldStatus.itemTitleColor && this.itemDescriptionColor == fileFieldStatus.itemDescriptionColor;
        }

        @NotNull
        public final ButtonStateWrapper getButtonState() {
            return this.buttonState;
        }

        public final String getItemDescription() {
            return this.itemDescription;
        }

        public final int getItemDescriptionColor() {
            return this.itemDescriptionColor;
        }

        public final String getItemTitle() {
            return this.itemTitle;
        }

        public final int getItemTitleColor() {
            return this.itemTitleColor;
        }

        public int hashCode() {
            String str = this.itemTitle;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.itemDescription;
            return Integer.hashCode(this.itemDescriptionColor) + C2454a.a(this.itemTitleColor, (this.buttonState.hashCode() + ((hashCode + (str2 != null ? str2.hashCode() : 0)) * 31)) * 31, 31);
        }

        @NotNull
        public String toString() {
            String str = this.itemTitle;
            String str2 = this.itemDescription;
            ButtonStateWrapper buttonStateWrapper = this.buttonState;
            int i11 = this.itemTitleColor;
            int i12 = this.itemDescriptionColor;
            StringBuilder d11 = C3660k.d("FileFieldStatus(itemTitle=", str, ", itemDescription=", str2, ", buttonState=");
            d11.append(buttonStateWrapper);
            d11.append(", itemTitleColor=");
            d11.append(i11);
            d11.append(", itemDescriptionColor=");
            return b.e(i12, ")", d11);
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public ReconciliationActsDeclinerViewHolder(@NotNull WidgetReconciliationActsDeclinerBinding binding, @NotNull ComposerReferences references, @NotNull JsonParser jsonDeserializer, @NotNull ReconciliationActsDeclinerViewModel viewModel) {
        super(r0);
        Intrinsics.checkNotNullParameter(binding, "binding");
        Intrinsics.checkNotNullParameter(references, "references");
        Intrinsics.checkNotNullParameter(jsonDeserializer, "jsonDeserializer");
        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        LinearLayout constraintLayout = binding.getConstraintLayout();
        Intrinsics.checkNotNullExpressionValue(constraintLayout, "getRoot(...)");
        this.binding = binding;
        this.references = references;
        this.jsonDeserializer = jsonDeserializer;
        this.viewModel = viewModel;
        this.submitActionHandler = new ActionHandler.Builder(references, this).customAnalyticHandler(ReconciliationActsDeclinerViewHolder$submitActionHandler$1.INSTANCE).onClick(new ReconciliationActsDeclinerViewHolder$submitActionHandler$2(this)).buildHandler();
        TextFieldsAdapter textFieldsAdapter = new TextFieldsAdapter(new ReconciliationActsDeclinerViewHolder$textFieldsAdapter$1(this));
        this.textFieldsAdapter = textFieldsAdapter;
        this.titleTextColor = LazyUtilsKt.unsafeLazy(new ReconciliationActsDeclinerViewHolder$titleTextColor$2(this));
        this.descriptionTextColor = LazyUtilsKt.unsafeLazy(new ReconciliationActsDeclinerViewHolder$descriptionTextColor$2(this));
        this.errorTextColor = LazyUtilsKt.unsafeLazy(new ReconciliationActsDeclinerViewHolder$errorTextColor$2(this));
        binding.textFieldsRV.setAdapter(textFieldsAdapter);
        ConstraintLayout clickableAreaAttachFile = binding.clickableAreaAttachFile.clickableAreaAttachFile;
        Intrinsics.checkNotNullExpressionValue(clickableAreaAttachFile, "clickableAreaAttachFile");
        ViewExtKt.setOnClickListenerThrottle$default(clickableAreaAttachFile, 0L, new AnonymousClass1(), 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final void bindAttachField(ReconciliationActsDeclinerVO.AttachField attachField) {
        FileFieldStatus fileFieldStatus;
        FileFieldStatus fileFieldStatus2;
        WidgetReconciliationActsDeclinerBinding widgetReconciliationActsDeclinerBinding = this.binding;
        TextAtomV2View label = widgetReconciliationActsDeclinerBinding.label;
        Intrinsics.checkNotNullExpressionValue(label, "label");
        ReconciliationActsDeclinerDTO.ColoredButton coloredButton = null;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        Object[] objArr3 = 0;
        Object[] objArr4 = 0;
        Object[] objArr5 = 0;
        Object[] objArr6 = 0;
        Object[] objArr7 = 0;
        Object[] objArr8 = 0;
        Object[] objArr9 = 0;
        int i11 = 2;
        TextHolderKt.bindOrGone$default(label, attachField.getLabel(), null, 2, null);
        ReconciliationActsDeclinerVO.Status status = attachField.getStatus();
        if (Intrinsics.d(status, ReconciliationActsDeclinerVO.Status.Default.INSTANCE)) {
            fileFieldStatus2 = new FileFieldStatus(attachField.getLexemes().get(SelectionItemFormDTO.TITLE_FIELD_NAME), attachField.getLexemes().get("subtitle"), new FileFieldStatus.ButtonStateWrapper(attachField.getButtonsStates().getDefaultState(), coloredButton, i11, objArr9 == true ? 1 : 0), getTitleTextColor(), getDescriptionTextColor());
        } else if (status instanceof ReconciliationActsDeclinerVO.Status.Loading) {
            fileFieldStatus2 = new FileFieldStatus(((ReconciliationActsDeclinerVO.Status.Loading) attachField.getStatus()).getFullFileName(), attachField.getLexemes().get("loading"), new FileFieldStatus.ButtonStateWrapper(attachField.getButtonsStates().getDefaultState(), attachField.getButtonsStates().getLoadingState()), getTitleTextColor(), getDescriptionTextColor());
        } else if (status instanceof ReconciliationActsDeclinerVO.Status.Success) {
            fileFieldStatus2 = new FileFieldStatus(((ReconciliationActsDeclinerVO.Status.Success) attachField.getStatus()).getFullFileName(), attachField.getLexemes().get("loaded"), new FileFieldStatus.ButtonStateWrapper(attachField.getButtonsStates().getSuccessState(), objArr8 == true ? 1 : 0, i11, objArr7 == true ? 1 : 0), getTitleTextColor(), getDescriptionTextColor());
        } else {
            if (status instanceof ReconciliationActsDeclinerVO.Status.UnknownError) {
                String str = attachField.getLexemes().get("uploadError");
                String errorMessage = ((ReconciliationActsDeclinerVO.Status.UnknownError) attachField.getStatus()).getErrorMessage();
                fileFieldStatus = new FileFieldStatus(str, (errorMessage == null || errorMessage.length() == 0) ? attachField.getLexemes().get("unknownError") : ((ReconciliationActsDeclinerVO.Status.UnknownError) attachField.getStatus()).getErrorMessage(), new FileFieldStatus.ButtonStateWrapper(attachField.getButtonsStates().getErrorState(), objArr6 == true ? 1 : 0, i11, objArr5 == true ? 1 : 0), getTitleTextColor(), getErrorTextColor());
            } else if (Intrinsics.d(status, ReconciliationActsDeclinerVO.Status.UploadErrorFileType.INSTANCE)) {
                fileFieldStatus = new FileFieldStatus(attachField.getLexemes().get("uploadError"), attachField.getLexemes().get("uploadErrorFileType"), new FileFieldStatus.ButtonStateWrapper(attachField.getButtonsStates().getErrorState(), objArr4 == true ? 1 : 0, i11, objArr3 == true ? 1 : 0), getTitleTextColor(), getErrorTextColor());
            } else {
                if (!Intrinsics.d(status, ReconciliationActsDeclinerVO.Status.UploadFileSizeError.INSTANCE)) {
                    throw new o();
                }
                fileFieldStatus = new FileFieldStatus(attachField.getLexemes().get("uploadError"), attachField.getLexemes().get("uploadErrorFileSize"), new FileFieldStatus.ButtonStateWrapper(attachField.getButtonsStates().getErrorState(), objArr2 == true ? 1 : 0, i11, objArr == true ? 1 : 0), getTitleTextColor(), getDescriptionTextColor());
            }
            fileFieldStatus2 = fileFieldStatus;
        }
        TextView textView = widgetReconciliationActsDeclinerBinding.clickableAreaAttachFile.title;
        textView.setText(fileFieldStatus2.getItemTitle());
        textView.setTextColor(fileFieldStatus2.getItemTitleColor());
        TextView textView2 = widgetReconciliationActsDeclinerBinding.clickableAreaAttachFile.subtitle;
        textView2.setText(fileFieldStatus2.getItemDescription());
        textView2.setTextColor(fileFieldStatus2.getItemDescriptionColor());
        IconButtonV3View attachFileButton = widgetReconciliationActsDeclinerBinding.clickableAreaAttachFile.attachFileButton;
        Intrinsics.checkNotNullExpressionValue(attachFileButton, "attachFileButton");
        IconButtonV3HolderKt.bindOrGone$default(attachFileButton, fileFieldStatus2.getButtonState().getIconButtonDTO(), null, 2, null);
        IconButtonV3View attachFileButton2 = widgetReconciliationActsDeclinerBinding.clickableAreaAttachFile.attachFileButton;
        Intrinsics.checkNotNullExpressionValue(attachFileButton2, "attachFileButton");
        LoaderView loaderView = widgetReconciliationActsDeclinerBinding.clickableAreaAttachFile.loaderView;
        Intrinsics.checkNotNullExpressionValue(loaderView, "loaderView");
        configureLoadingState(attachFileButton2, loaderView, fileFieldStatus2.getButtonState());
    }

    private final void bindPolicy(TextDTO policyField) {
        WidgetReconciliationActsDeclinerBinding widgetReconciliationActsDeclinerBinding = this.binding;
        TextAtomV2View policy = widgetReconciliationActsDeclinerBinding.policy;
        Intrinsics.checkNotNullExpressionValue(policy, "policy");
        TextHolderKt.bindOrGone$default(policy, policyField, null, 2, null);
        widgetReconciliationActsDeclinerBinding.policy.setMaxLines(3);
    }

    private final void bindSubmitButton(ButtonV3DTO button) {
        ButtonV3View submitButton = this.binding.submitButton;
        Intrinsics.checkNotNullExpressionValue(submitButton, "submitButton");
        ButtonV3HolderKt.bindOrGone(submitButton, button, this.submitActionHandler);
    }

    private final void configureLoadingState(IconButtonV3View iconButton, LoaderView loaderView, FileFieldStatus.ButtonStateWrapper buttonState) {
        String loaderColor;
        boolean z11 = buttonState.getLoadingButtonDTO() != null;
        ViewExtKt.showOrInvisible(iconButton, !z11);
        if (z11 && (loaderColor = buttonState.getLoaderColor()) != null) {
            loaderView.setColor(getColorByDsToken(loaderColor, R$color.bg_action_primary));
        }
        String backgroundLoadingColor = buttonState.getBackgroundLoadingColor();
        if (backgroundLoadingColor != null) {
            iconButton.setBackColor(new Color.Solid(getColorByDsToken(backgroundLoadingColor, R$color.bg_action_secondary)));
        }
        ViewExtKt.showOrGone(loaderView, Boolean.valueOf(z11));
    }

    private final int getColorByDsToken(String colorToken, int defaultColor) {
        StyleParser styleParser = StyleParser.INSTANCE;
        Context context = this.itemView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        Integer mapColor = styleParser.mapColor(context, colorToken);
        Context context2 = this.itemView.getContext();
        if (mapColor != null) {
            defaultColor = mapColor.intValue();
        }
        return a.getColor(context2, defaultColor);
    }

    private final int getDescriptionTextColor() {
        return ((Number) this.descriptionTextColor.getValue()).intValue();
    }

    private final int getErrorTextColor() {
        return ((Number) this.errorTextColor.getValue()).intValue();
    }

    private final int getTitleTextColor() {
        return ((Number) this.titleTextColor.getValue()).intValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void openFile() {
        Intent intent = new Intent("android.intent.action.GET_CONTENT");
        intent.setType("*/*");
        ComponentCallbacksC5392m c11 = this.references.getContainer().c();
        if (c11 != null) {
            c11.startActivityForResult(intent, 3457);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void showErrorMessage(String message) {
        ViewGroup rootView;
        if (message.length() == 0 || (rootView = ContextExtKt.getRootView(this.references.getContainer().j())) == null) {
            return;
        }
        FlashbarFactory.create$default(FlashbarFactory.INSTANCE, rootView, null, OzonSpannableStringKt.toOzonSpannableString(message), null, null, Integer.valueOf(R$drawable.ic_m_exclamation_filled), null, UniColors.GRAPHIC_WARNING_PRIMARY.getToken(), null, null, null, null, null, 3000L, null, null, this.references.getContainer().g(), 56666, null).show();
    }

    @Override // ru.ozon.composer.ui.widget.k
    protected void onAttachViewModel(@NotNull J lifecycle) {
        Intrinsics.checkNotNullParameter(lifecycle, "lifecycle");
        C2399j.C(new C2408n0(this.viewModel.getInputFields(), new ReconciliationActsDeclinerViewHolder$onAttachViewModel$1(this, null)), K.a(lifecycle));
        C2399j.C(new C2408n0(this.viewModel.getFileField(), new ReconciliationActsDeclinerViewHolder$onAttachViewModel$2(this, null)), K.a(lifecycle));
        C2399j.C(new C2408n0(this.viewModel.getFlashbarErrorMessage(), new ReconciliationActsDeclinerViewHolder$onAttachViewModel$3(this, null)), K.a(lifecycle));
        C2399j.C(new C2408n0(this.viewModel.getShowGeneralLoader(), new ReconciliationActsDeclinerViewHolder$onAttachViewModel$4(this, null)), K.a(lifecycle));
        C2399j.C(new C2408n0(this.viewModel.getDeepLinkAction(), new ReconciliationActsDeclinerViewHolder$onAttachViewModel$5(this, null)), K.a(lifecycle));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.composer.ui.widget.k
    public void bind(@NotNull ReconciliationActsDeclinerVO item, @NotNull d info) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(info, "info");
        this.viewModel.initAttachField(item.getAttachField());
        this.viewModel.initDefaultFields(item.getTextFields());
        bindAttachField(item.getAttachField());
        bindPolicy(item.getPolicyField());
        bindSubmitButton(item.getSubmitButton());
        this.textFieldsAdapter.submitList(item.getTextFields());
    }
}
