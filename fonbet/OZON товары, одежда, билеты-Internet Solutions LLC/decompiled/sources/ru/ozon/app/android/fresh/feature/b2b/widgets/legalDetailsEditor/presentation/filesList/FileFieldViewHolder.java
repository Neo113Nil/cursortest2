package ru.ozon.app.android.fresh.feature.b2b.widgets.legalDetailsEditor.presentation.filesList;

import B0.C2454a;
import K00.b;
import N3.C3660k;
import Sc.InterfaceC4008j;
import Sc.o;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.helper.widget.Layer;
import androidx.core.content.a;
import androidx.fragment.app.ComponentCallbacksC5392m;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.fresh.feature.b2b.databinding.WidgetLegalDetailsEditorFileFieldBinding;
import ru.ozon.app.android.fresh.feature.b2b.utils.UtilsKt;
import ru.ozon.app.android.fresh.feature.b2b.widgets.legalDetailsEditor.data.LegalDetailsEditorDTO;
import ru.ozon.app.android.fresh.feature.b2b.widgets.legalDetailsEditor.presentation.LegalDetailsEditorVO;
import ru.ozon.app.android.ugc.core.widgets.selectionItemDescription.data.SelectionItemDescriptionDTO;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.app.android.utils.LazyUtilsKt;
import ru.ozon.uni.android.atom.loader.ui.LoaderView;
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.android.controls.button.IconButtonView;
import ru.ozon.uni.android.uikit.common.StyleParser;
import ru.ozon.uni.android.uikit.extensions.view.ViewExtKt;
import ru.ozon.uni.android.uikitsdk.Color;
import ru.ozon.uni.atoms.data.controls.button.IconButtonDTO;
import ru.ozon.uni.atoms.v3.holders.controls.button.IconButtonHolderKt;
import ru.ozon.uni.atoms.v3.holders.text.TextHolderKt;
import ru.ozon.uni.core.R$color;

@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\b\u0001\u0018\u0000 22\u00020\u0001:\u000223B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J!\u0010\u0017\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u0015\u0010\u001b\u001a\u00020\u000e2\u0006\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b\u001b\u0010\u001cJ1\u0010#\u001a\u00020\u000e2\u0006\u0010\u001e\u001a\u00020\u001d2\u0012\u0010 \u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00130\u001f2\u0006\u0010\"\u001a\u00020!¢\u0006\u0004\b#\u0010$R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010%R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010&R\u001b\u0010+\u001a\u00020\u00158BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*R\u001b\u0010.\u001a\u00020\u00158BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b,\u0010(\u001a\u0004\b-\u0010*R\u001b\u00101\u001a\u00020\u00158BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b/\u0010(\u001a\u0004\b0\u0010*¨\u00064"}, d2 = {"Lru/ozon/app/android/fresh/feature/b2b/widgets/legalDetailsEditor/presentation/filesList/FileFieldViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$C;", "Lru/ozon/app/android/fresh/feature/b2b/databinding/WidgetLegalDetailsEditorFileFieldBinding;", "binding", "Lru/ozon/app/android/composer/ComposerReferences;", "references", "<init>", "(Lru/ozon/app/android/fresh/feature/b2b/databinding/WidgetLegalDetailsEditorFileFieldBinding;Lru/ozon/app/android/composer/ComposerReferences;)V", "Lru/ozon/uni/android/controls/button/IconButtonView;", "iconButton", "Lru/ozon/uni/android/atom/loader/ui/LoaderView;", "loaderView", "Lru/ozon/app/android/fresh/feature/b2b/widgets/legalDetailsEditor/presentation/filesList/FileFieldViewHolder$FileFieldStatus$ButtonStateWrapper;", "buttonState", "", "configureLoadingState", "(Lru/ozon/uni/android/controls/button/IconButtonView;Lru/ozon/uni/android/atom/loader/ui/LoaderView;Lru/ozon/app/android/fresh/feature/b2b/widgets/legalDetailsEditor/presentation/filesList/FileFieldViewHolder$FileFieldStatus$ButtonStateWrapper;)V", "openFile", "()V", "", "colorToken", "", "defaultColor", "getColorByDsToken", "(Ljava/lang/String;I)I", "Lru/ozon/app/android/fresh/feature/b2b/widgets/legalDetailsEditor/presentation/LegalDetailsEditorVO$FileFieldVO;", "item", "bind", "(Lru/ozon/app/android/fresh/feature/b2b/widgets/legalDetailsEditor/presentation/LegalDetailsEditorVO$FileFieldVO;)V", "Lru/ozon/app/android/fresh/feature/b2b/widgets/legalDetailsEditor/presentation/LegalDetailsEditorVO$Status;", "status", "", "lexemes", "Lru/ozon/app/android/fresh/feature/b2b/widgets/legalDetailsEditor/data/LegalDetailsEditorDTO$ButtonStates;", "buttonStates", "bindFileField", "(Lru/ozon/app/android/fresh/feature/b2b/widgets/legalDetailsEditor/presentation/LegalDetailsEditorVO$Status;Ljava/util/Map;Lru/ozon/app/android/fresh/feature/b2b/widgets/legalDetailsEditor/data/LegalDetailsEditorDTO$ButtonStates;)V", "Lru/ozon/app/android/fresh/feature/b2b/databinding/WidgetLegalDetailsEditorFileFieldBinding;", "Lru/ozon/app/android/composer/ComposerReferences;", "titleTextColor$delegate", "LSc/j;", "getTitleTextColor", "()I", "titleTextColor", "descriptionTextColor$delegate", "getDescriptionTextColor", "descriptionTextColor", "errorTextColor$delegate", "getErrorTextColor", "errorTextColor", "Companion", "FileFieldStatus", "b2b_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class FileFieldViewHolder extends RecyclerView.C {

    @NotNull
    private final WidgetLegalDetailsEditorFileFieldBinding binding;

    /* renamed from: descriptionTextColor$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j descriptionTextColor;

    /* renamed from: errorTextColor$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j errorTextColor;

    @NotNull
    private final ComposerReferences references;

    /* renamed from: titleTextColor$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j titleTextColor;

    @NotNull
    private static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: ru.ozon.app.android.fresh.feature.b2b.widgets.legalDetailsEditor.presentation.filesList.FileFieldViewHolder$1, reason: invalid class name */
    static final class AnonymousClass1 extends AbstractC7737t implements Function1<View, Unit> {

        @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
        /* renamed from: ru.ozon.app.android.fresh.feature.b2b.widgets.legalDetailsEditor.presentation.filesList.FileFieldViewHolder$1$1, reason: invalid class name and collision with other inner class name */
        static final class C17761 extends AbstractC7737t implements Function0<Unit> {
            final /* synthetic */ FileFieldViewHolder this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C17761(FileFieldViewHolder fileFieldViewHolder) {
                super(0);
                this.this$0 = fileFieldViewHolder;
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
                FileFieldViewHolder.this.openFile();
                return;
            }
            ComponentCallbacksC5392m c11 = FileFieldViewHolder.this.references.getContainer().c();
            if (c11 != null) {
                UtilsKt.checkPermissions$default(c11, FileFieldViewHolder.this.references.getContainer().g(), false, new C17761(FileFieldViewHolder.this), 2, null);
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\n\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lru/ozon/app/android/fresh/feature/b2b/widgets/legalDetailsEditor/presentation/filesList/FileFieldViewHolder$Companion;", "", "<init>", "()V", SelectionItemDescriptionDTO.TITLE, "", "SUBTITLE", "ERROR_REQUIRED_TEXT", "UPLOAD_ERROR", "UNKNOWN_ERROR", "UPLOAD_ERROR_FILE_SIZE", "UPLOAD_ERROR_FILE_TYPE", "LOADED", "LOADING", "CONTENT_TYPE", "b2b_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\r\b\u0081\b\u0018\u00002\u00020\u0001:\u0001\u001dB3\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\rR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0014\u001a\u0004\b\u0016\u0010\rR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\u001a\u001a\u0004\b\u001b\u0010\u000fR\u0017\u0010\t\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\t\u0010\u001a\u001a\u0004\b\u001c\u0010\u000f¨\u0006\u001e"}, d2 = {"Lru/ozon/app/android/fresh/feature/b2b/widgets/legalDetailsEditor/presentation/filesList/FileFieldViewHolder$FileFieldStatus;", "", "", "itemTitle", "itemDescription", "Lru/ozon/app/android/fresh/feature/b2b/widgets/legalDetailsEditor/presentation/filesList/FileFieldViewHolder$FileFieldStatus$ButtonStateWrapper;", "buttonState", "", "itemTitleColor", "itemDescriptionColor", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lru/ozon/app/android/fresh/feature/b2b/widgets/legalDetailsEditor/presentation/filesList/FileFieldViewHolder$FileFieldStatus$ButtonStateWrapper;II)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getItemTitle", "getItemDescription", "Lru/ozon/app/android/fresh/feature/b2b/widgets/legalDetailsEditor/presentation/filesList/FileFieldViewHolder$FileFieldStatus$ButtonStateWrapper;", "getButtonState", "()Lru/ozon/app/android/fresh/feature/b2b/widgets/legalDetailsEditor/presentation/filesList/FileFieldViewHolder$FileFieldStatus$ButtonStateWrapper;", "I", "getItemTitleColor", "getItemDescriptionColor", "ButtonStateWrapper", "b2b_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class FileFieldStatus {
        public static final int $stable = IconButtonDTO.$stable;

        @NotNull
        private final ButtonStateWrapper buttonState;
        private final String itemDescription;
        private final int itemDescriptionColor;
        private final String itemTitle;
        private final int itemTitleColor;

        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u000b\u0010\nJ\u0010\u0010\f\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\f\u0010\nJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, d2 = {"Lru/ozon/app/android/fresh/feature/b2b/widgets/legalDetailsEditor/presentation/filesList/FileFieldViewHolder$FileFieldStatus$ButtonStateWrapper;", "", "Lru/ozon/uni/atoms/data/controls/button/IconButtonDTO;", "iconButtonDTO", "Lru/ozon/app/android/fresh/feature/b2b/widgets/legalDetailsEditor/data/LegalDetailsEditorDTO$ButtonStates$LoadingButtonStateDTO;", "loadingButtonDTO", "<init>", "(Lru/ozon/uni/atoms/data/controls/button/IconButtonDTO;Lru/ozon/app/android/fresh/feature/b2b/widgets/legalDetailsEditor/data/LegalDetailsEditorDTO$ButtonStates$LoadingButtonStateDTO;)V", "", "getBackgroundLoadingColor", "()Ljava/lang/String;", "getLoaderColor", "toString", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/uni/atoms/data/controls/button/IconButtonDTO;", "getIconButtonDTO", "()Lru/ozon/uni/atoms/data/controls/button/IconButtonDTO;", "Lru/ozon/app/android/fresh/feature/b2b/widgets/legalDetailsEditor/data/LegalDetailsEditorDTO$ButtonStates$LoadingButtonStateDTO;", "getLoadingButtonDTO", "()Lru/ozon/app/android/fresh/feature/b2b/widgets/legalDetailsEditor/data/LegalDetailsEditorDTO$ButtonStates$LoadingButtonStateDTO;", "b2b_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class ButtonStateWrapper {
            public static final int $stable = IconButtonDTO.$stable;
            private final IconButtonDTO iconButtonDTO;
            private final LegalDetailsEditorDTO.ButtonStates.LoadingButtonStateDTO loadingButtonDTO;

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
                LegalDetailsEditorDTO.ButtonStates.LoadingButtonStateDTO loadingButtonStateDTO = this.loadingButtonDTO;
                if (loadingButtonStateDTO != null) {
                    return loadingButtonStateDTO.getBackgroundColor();
                }
                return null;
            }

            public final IconButtonDTO getIconButtonDTO() {
                return this.iconButtonDTO;
            }

            public final String getLoaderColor() {
                LegalDetailsEditorDTO.ButtonStates.LoadingButtonStateDTO loadingButtonStateDTO = this.loadingButtonDTO;
                if (loadingButtonStateDTO != null) {
                    return loadingButtonStateDTO.getLoaderColor();
                }
                return null;
            }

            public final LegalDetailsEditorDTO.ButtonStates.LoadingButtonStateDTO getLoadingButtonDTO() {
                return this.loadingButtonDTO;
            }

            public int hashCode() {
                IconButtonDTO iconButtonDTO = this.iconButtonDTO;
                int hashCode = (iconButtonDTO == null ? 0 : iconButtonDTO.hashCode()) * 31;
                LegalDetailsEditorDTO.ButtonStates.LoadingButtonStateDTO loadingButtonStateDTO = this.loadingButtonDTO;
                return hashCode + (loadingButtonStateDTO != null ? loadingButtonStateDTO.hashCode() : 0);
            }

            @NotNull
            public String toString() {
                return "ButtonStateWrapper(iconButtonDTO=" + this.iconButtonDTO + ", loadingButtonDTO=" + this.loadingButtonDTO + ")";
            }

            public ButtonStateWrapper(IconButtonDTO iconButtonDTO, LegalDetailsEditorDTO.ButtonStates.LoadingButtonStateDTO loadingButtonStateDTO) {
                this.iconButtonDTO = iconButtonDTO;
                this.loadingButtonDTO = loadingButtonStateDTO;
            }

            public /* synthetic */ ButtonStateWrapper(IconButtonDTO iconButtonDTO, LegalDetailsEditorDTO.ButtonStates.LoadingButtonStateDTO loadingButtonStateDTO, int i11, DefaultConstructorMarker defaultConstructorMarker) {
                this((i11 & 1) != 0 ? null : iconButtonDTO, (i11 & 2) != 0 ? null : loadingButtonStateDTO);
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FileFieldViewHolder(@NotNull WidgetLegalDetailsEditorFileFieldBinding binding, @NotNull ComposerReferences references) {
        super(binding.getConstraintLayout());
        Intrinsics.checkNotNullParameter(binding, "binding");
        Intrinsics.checkNotNullParameter(references, "references");
        this.binding = binding;
        this.references = references;
        this.titleTextColor = LazyUtilsKt.unsafeLazy(new FileFieldViewHolder$titleTextColor$2(this));
        this.descriptionTextColor = LazyUtilsKt.unsafeLazy(new FileFieldViewHolder$descriptionTextColor$2(this));
        this.errorTextColor = LazyUtilsKt.unsafeLazy(new FileFieldViewHolder$errorTextColor$2(this));
        Layer clickableAreaF = binding.clickableAreaF;
        Intrinsics.checkNotNullExpressionValue(clickableAreaF, "clickableAreaF");
        ViewExtKt.setOnClickListenerThrottle$default(clickableAreaF, 0L, new AnonymousClass1(), 1, null);
    }

    private final void configureLoadingState(IconButtonView iconButton, LoaderView loaderView, FileFieldStatus.ButtonStateWrapper buttonState) {
        boolean z11 = buttonState.getLoadingButtonDTO() != null;
        if (z11) {
            ViewExtKt.invisible(iconButton.getMainView());
            String loaderColor = buttonState.getLoaderColor();
            if (loaderColor != null) {
                loaderView.setColor(getColorByDsToken(loaderColor, R$color.bg_action_primary));
            }
        } else {
            ViewExtKt.show(iconButton.getMainView());
        }
        String backgroundLoadingColor = buttonState.getBackgroundLoadingColor();
        if (backgroundLoadingColor != null) {
            iconButton.setCurrentBackgroundColor(new Color.Solid(getColorByDsToken(backgroundLoadingColor, R$color.bg_action_secondary)));
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
            c11.startActivityForResult(intent, getAdapterPosition());
        }
    }

    public final void bind(@NotNull LegalDetailsEditorVO.FileFieldVO item) {
        Intrinsics.checkNotNullParameter(item, "item");
        TextAtomV2View label = this.binding.label;
        Intrinsics.checkNotNullExpressionValue(label, "label");
        TextHolderKt.bindOrGone$default(label, item.getLabel(), null, 2, null);
        bindFileField(item.getStatus(), item.getLexemes(), item.getButtonStates());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void bindFileField(@NotNull LegalDetailsEditorVO.Status status, @NotNull Map<String, String> lexemes, @NotNull LegalDetailsEditorDTO.ButtonStates buttonStates) {
        FileFieldStatus fileFieldStatus;
        Intrinsics.checkNotNullParameter(status, "status");
        Intrinsics.checkNotNullParameter(lexemes, "lexemes");
        Intrinsics.checkNotNullParameter(buttonStates, "buttonStates");
        WidgetLegalDetailsEditorFileFieldBinding widgetLegalDetailsEditorFileFieldBinding = this.binding;
        int i11 = 2;
        LegalDetailsEditorDTO.ButtonStates.LoadingButtonStateDTO loadingButtonStateDTO = null;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        Object[] objArr3 = 0;
        Object[] objArr4 = 0;
        Object[] objArr5 = 0;
        Object[] objArr6 = 0;
        Object[] objArr7 = 0;
        Object[] objArr8 = 0;
        Object[] objArr9 = 0;
        Object[] objArr10 = 0;
        Object[] objArr11 = 0;
        if (Intrinsics.d(status, LegalDetailsEditorVO.Status.Default.INSTANCE)) {
            fileFieldStatus = new FileFieldStatus(lexemes.get(SelectionItemFormDTO.TITLE_FIELD_NAME), lexemes.get("subtitle"), new FileFieldStatus.ButtonStateWrapper(buttonStates.getDefaultState(), loadingButtonStateDTO, i11, objArr11 == true ? 1 : 0), getTitleTextColor(), getDescriptionTextColor());
        } else if (Intrinsics.d(status, LegalDetailsEditorVO.Status.ErrorRequired.INSTANCE)) {
            fileFieldStatus = new FileFieldStatus(lexemes.get("errorRequiredText"), lexemes.get("subtitle"), new FileFieldStatus.ButtonStateWrapper(buttonStates.getErrorState(), objArr10 == true ? 1 : 0, i11, objArr9 == true ? 1 : 0), getErrorTextColor(), getDescriptionTextColor());
        } else if (status instanceof LegalDetailsEditorVO.Status.Success) {
            fileFieldStatus = new FileFieldStatus(((LegalDetailsEditorVO.Status.Success) status).getFullFileName(), lexemes.get("loaded"), new FileFieldStatus.ButtonStateWrapper(buttonStates.getSuccessState(), objArr8 == true ? 1 : 0, i11, objArr7 == true ? 1 : 0), getTitleTextColor(), getDescriptionTextColor());
        } else if (Intrinsics.d(status, LegalDetailsEditorVO.Status.UploadFileSizeError.INSTANCE)) {
            fileFieldStatus = new FileFieldStatus(lexemes.get("uploadError"), lexemes.get("uploadErrorFileSize"), new FileFieldStatus.ButtonStateWrapper(buttonStates.getErrorState(), objArr6 == true ? 1 : 0, i11, objArr5 == true ? 1 : 0), getTitleTextColor(), getErrorTextColor());
        } else if (Intrinsics.d(status, LegalDetailsEditorVO.Status.UploadErrorFileType.INSTANCE)) {
            fileFieldStatus = new FileFieldStatus(lexemes.get("uploadError"), lexemes.get("uploadErrorFileType"), new FileFieldStatus.ButtonStateWrapper(buttonStates.getErrorState(), objArr4 == true ? 1 : 0, i11, objArr3 == true ? 1 : 0), getTitleTextColor(), getErrorTextColor());
        } else if (status instanceof LegalDetailsEditorVO.Status.UnknownError) {
            String str = lexemes.get("uploadError");
            LegalDetailsEditorVO.Status.UnknownError unknownError = (LegalDetailsEditorVO.Status.UnknownError) status;
            String errorMessage = unknownError.getErrorMessage();
            fileFieldStatus = new FileFieldStatus(str, (errorMessage == null || errorMessage.length() == 0) ? lexemes.get("unknownError") : unknownError.getErrorMessage(), new FileFieldStatus.ButtonStateWrapper(buttonStates.getErrorState(), objArr2 == true ? 1 : 0, i11, objArr == true ? 1 : 0), getTitleTextColor(), getErrorTextColor());
        } else {
            if (!(status instanceof LegalDetailsEditorVO.Status.Loading)) {
                throw new o();
            }
            fileFieldStatus = new FileFieldStatus(((LegalDetailsEditorVO.Status.Loading) status).getFullFileName(), lexemes.get("loading"), new FileFieldStatus.ButtonStateWrapper(buttonStates.getDefaultState(), buttonStates.getLoadingState()), getTitleTextColor(), getDescriptionTextColor());
        }
        TextAtomV2View textAtomV2View = widgetLegalDetailsEditorFileFieldBinding.title;
        textAtomV2View.setText(fileFieldStatus.getItemTitle());
        textAtomV2View.setTextColor(fileFieldStatus.getItemTitleColor());
        TextView textView = widgetLegalDetailsEditorFileFieldBinding.description;
        textView.setText(fileFieldStatus.getItemDescription());
        textView.setTextColor(fileFieldStatus.getItemDescriptionColor());
        IconButtonView iconButton = widgetLegalDetailsEditorFileFieldBinding.iconButton;
        Intrinsics.checkNotNullExpressionValue(iconButton, "iconButton");
        IconButtonHolderKt.bindOrGone$default(iconButton, fileFieldStatus.getButtonState().getIconButtonDTO(), null, 2, null);
        IconButtonView iconButton2 = widgetLegalDetailsEditorFileFieldBinding.iconButton;
        Intrinsics.checkNotNullExpressionValue(iconButton2, "iconButton");
        LoaderView loaderView = widgetLegalDetailsEditorFileFieldBinding.loaderView;
        Intrinsics.checkNotNullExpressionValue(loaderView, "loaderView");
        configureLoadingState(iconButton2, loaderView, fileFieldStatus.getButtonState());
    }
}
