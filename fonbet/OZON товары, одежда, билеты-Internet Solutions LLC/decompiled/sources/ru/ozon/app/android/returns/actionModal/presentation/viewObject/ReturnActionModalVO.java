package ru.ozon.app.android.returns.actionModal.presentation.viewObject;

import Ak.C2436a;
import Co.a;
import De.C2859b;
import G.g;
import Kk.C3532b;
import Ns.b;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.atoms.data.disclaimer.DisclaimerAtom;
import ru.ozon.app.android.atoms.data.gallery.Gallery;
import ru.ozon.app.android.checkoutcomposer.common.splitDynamicElements.data.DynamicElementDTO;
import ru.ozon.app.android.returns.ui.data.components.Component;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO;
import ru.ozon.uni.atoms.data.tabs.TabsDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b!\b\u0081\b\u0018\u00002\u00020\u0001:\u0001CB\u0089\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\u000e\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0010\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0013\u0012\u0014\u0010\u0017\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0016¢\u0006\u0004\b\u0018\u0010\u0019Jª\u0001\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u0010\b\u0002\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u00102\b\b\u0002\u0010\u0014\u001a\u00020\u00132\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00132\u0016\b\u0002\u0010\u0017\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0016HÆ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001f\u001a\u00020\u001eHÖ\u0001¢\u0006\u0004\b\u001f\u0010 J\u001a\u0010$\u001a\u00020#2\b\u0010\"\u001a\u0004\u0018\u00010!HÖ\u0003¢\u0006\u0004\b$\u0010%R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010&\u001a\u0004\b'\u0010(R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010)\u001a\u0004\b*\u0010\u001dR\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010)\u001a\u0004\b+\u0010\u001dR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010,\u001a\u0004\b-\u0010.R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\t\u0010,\u001a\u0004\b/\u0010.R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\u000b\u00100\u001a\u0004\b1\u00102R\u0019\u0010\r\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b\r\u00103\u001a\u0004\b4\u00105R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u00106\u001a\u0004\b7\u00108R\u001f\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u00108\u0006¢\u0006\f\n\u0004\b\u0012\u00109\u001a\u0004\b:\u0010;R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010<\u001a\u0004\b=\u0010>R\u0019\u0010\u0015\u001a\u0004\u0018\u00010\u00138\u0006¢\u0006\f\n\u0004\b\u0015\u0010<\u001a\u0004\b?\u0010>R%\u0010\u0017\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00168\u0006¢\u0006\f\n\u0004\b\u0017\u0010@\u001a\u0004\bA\u0010B¨\u0006D"}, d2 = {"Lru/ozon/app/android/returns/actionModal/presentation/viewObject/ReturnActionModalVO;", "Ll20/c;", "", "id", "", "returnNumber", "action", "Lru/ozon/uni/atoms/data/text/TextDTO;", SelectionItemFormDTO.TITLE_FIELD_NAME, "subtitle", "Lru/ozon/uni/atoms/data/tabs/TabsDTO;", DynamicElementDTO.TABS, "Lru/ozon/app/android/atoms/data/disclaimer/DisclaimerAtom;", "hint", "Lru/ozon/app/android/atoms/data/gallery/Gallery;", "photos", "", "Lru/ozon/app/android/returns/actionModal/presentation/viewObject/ReturnActionModalVO$ActionComponent;", "components", "Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "submitButton", "cancelButton", "", "extraValues", "<init>", "(JLjava/lang/String;Ljava/lang/String;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/tabs/TabsDTO;Lru/ozon/app/android/atoms/data/disclaimer/DisclaimerAtom;Lru/ozon/app/android/atoms/data/gallery/Gallery;Ljava/util/List;Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;Ljava/util/Map;)V", "copy", "(JLjava/lang/String;Ljava/lang/String;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/tabs/TabsDTO;Lru/ozon/app/android/atoms/data/disclaimer/DisclaimerAtom;Lru/ozon/app/android/atoms/data/gallery/Gallery;Ljava/util/List;Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;Ljava/util/Map;)Lru/ozon/app/android/returns/actionModal/presentation/viewObject/ReturnActionModalVO;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Ljava/lang/String;", "getReturnNumber", "getAction", "Lru/ozon/uni/atoms/data/text/TextDTO;", "getTitle", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "getSubtitle", "Lru/ozon/uni/atoms/data/tabs/TabsDTO;", "getTabs", "()Lru/ozon/uni/atoms/data/tabs/TabsDTO;", "Lru/ozon/app/android/atoms/data/disclaimer/DisclaimerAtom;", "getHint", "()Lru/ozon/app/android/atoms/data/disclaimer/DisclaimerAtom;", "Lru/ozon/app/android/atoms/data/gallery/Gallery;", "getPhotos", "()Lru/ozon/app/android/atoms/data/gallery/Gallery;", "Ljava/util/List;", "getComponents", "()Ljava/util/List;", "Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "getSubmitButton", "()Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "getCancelButton", "Ljava/util/Map;", "getExtraValues", "()Ljava/util/Map;", "ActionComponent", "details_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class ReturnActionModalVO implements c {

    @NotNull
    private final String action;
    private final ButtonV3DTO cancelButton;
    private final List<ActionComponent> components;
    private final Map<String, String> extraValues;
    private final DisclaimerAtom hint;
    private final long id;
    private final Gallery photos;

    @NotNull
    private final String returnNumber;

    @NotNull
    private final ButtonV3DTO submitButton;
    private final TextDTO subtitle;
    private final TabsDTO tabs;
    private final TextDTO title;

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0013\b\u0087\b\u0018\u00002\u00020\u0001B9\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0004\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJN\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00042\b\b\u0002\u0010\u000b\u001a\u00020\nHÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0016\u001a\u00020\u00072\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0018\u001a\u0004\b\u0019\u0010\u0011R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001a\u001a\u0004\b\u001d\u0010\u001cR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0017\u0010\t\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\t\u0010\u001a\u001a\u0004\b!\u0010\u001cR\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\"\u001a\u0004\b#\u0010$¨\u0006%"}, d2 = {"Lru/ozon/app/android/returns/actionModal/presentation/viewObject/ReturnActionModalVO$ActionComponent;", "", "", "key", "Lru/ozon/uni/atoms/data/text/TextDTO;", SelectionItemFormDTO.TITLE_FIELD_NAME, "subtitle", "", "showRequireError", "requireErrorText", "Lru/ozon/app/android/returns/ui/data/components/Component;", "component", "<init>", "(Ljava/lang/String;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/text/TextDTO;ZLru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/app/android/returns/ui/data/components/Component;)V", "copy", "(Ljava/lang/String;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/text/TextDTO;ZLru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/app/android/returns/ui/data/components/Component;)Lru/ozon/app/android/returns/actionModal/presentation/viewObject/ReturnActionModalVO$ActionComponent;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getKey", "Lru/ozon/uni/atoms/data/text/TextDTO;", "getTitle", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "getSubtitle", "Z", "getShowRequireError", "()Z", "getRequireErrorText", "Lru/ozon/app/android/returns/ui/data/components/Component;", "getComponent", "()Lru/ozon/app/android/returns/ui/data/components/Component;", "details_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class ActionComponent {

        @NotNull
        private final Component component;

        @NotNull
        private final String key;

        @NotNull
        private final TextDTO requireErrorText;
        private final boolean showRequireError;
        private final TextDTO subtitle;

        @NotNull
        private final TextDTO title;

        public ActionComponent(@NotNull String key, @NotNull TextDTO title, TextDTO textDTO, boolean z11, @NotNull TextDTO requireErrorText, @NotNull Component component) {
            Intrinsics.checkNotNullParameter(key, "key");
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(requireErrorText, "requireErrorText");
            Intrinsics.checkNotNullParameter(component, "component");
            this.key = key;
            this.title = title;
            this.subtitle = textDTO;
            this.showRequireError = z11;
            this.requireErrorText = requireErrorText;
            this.component = component;
        }

        public static /* synthetic */ ActionComponent copy$default(ActionComponent actionComponent, String str, TextDTO textDTO, TextDTO textDTO2, boolean z11, TextDTO textDTO3, Component component, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = actionComponent.key;
            }
            if ((i11 & 2) != 0) {
                textDTO = actionComponent.title;
            }
            if ((i11 & 4) != 0) {
                textDTO2 = actionComponent.subtitle;
            }
            if ((i11 & 8) != 0) {
                z11 = actionComponent.showRequireError;
            }
            if ((i11 & 16) != 0) {
                textDTO3 = actionComponent.requireErrorText;
            }
            if ((i11 & 32) != 0) {
                component = actionComponent.component;
            }
            TextDTO textDTO4 = textDTO3;
            Component component2 = component;
            return actionComponent.copy(str, textDTO, textDTO2, z11, textDTO4, component2);
        }

        @NotNull
        public final ActionComponent copy(@NotNull String key, @NotNull TextDTO title, TextDTO subtitle, boolean showRequireError, @NotNull TextDTO requireErrorText, @NotNull Component component) {
            Intrinsics.checkNotNullParameter(key, "key");
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(requireErrorText, "requireErrorText");
            Intrinsics.checkNotNullParameter(component, "component");
            return new ActionComponent(key, title, subtitle, showRequireError, requireErrorText, component);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ActionComponent)) {
                return false;
            }
            ActionComponent actionComponent = (ActionComponent) other;
            return Intrinsics.d(this.key, actionComponent.key) && Intrinsics.d(this.title, actionComponent.title) && Intrinsics.d(this.subtitle, actionComponent.subtitle) && this.showRequireError == actionComponent.showRequireError && Intrinsics.d(this.requireErrorText, actionComponent.requireErrorText) && Intrinsics.d(this.component, actionComponent.component);
        }

        @NotNull
        public final Component getComponent() {
            return this.component;
        }

        @NotNull
        public final String getKey() {
            return this.key;
        }

        @NotNull
        public final TextDTO getRequireErrorText() {
            return this.requireErrorText;
        }

        public final boolean getShowRequireError() {
            return this.showRequireError;
        }

        public final TextDTO getSubtitle() {
            return this.subtitle;
        }

        @NotNull
        public final TextDTO getTitle() {
            return this.title;
        }

        public int hashCode() {
            int a11 = b.a(this.title, this.key.hashCode() * 31, 31);
            TextDTO textDTO = this.subtitle;
            return this.component.hashCode() + b.a(this.requireErrorText, C3532b.a((a11 + (textDTO == null ? 0 : textDTO.hashCode())) * 31, 31, this.showRequireError), 31);
        }

        @NotNull
        public String toString() {
            String str = this.key;
            TextDTO textDTO = this.title;
            TextDTO textDTO2 = this.subtitle;
            boolean z11 = this.showRequireError;
            TextDTO textDTO3 = this.requireErrorText;
            Component component = this.component;
            StringBuilder b11 = a.b("ActionComponent(key=", textDTO, str, ", title=", ", subtitle=");
            b11.append(textDTO2);
            b11.append(", showRequireError=");
            b11.append(z11);
            b11.append(", requireErrorText=");
            b11.append(textDTO3);
            b11.append(", component=");
            b11.append(component);
            b11.append(")");
            return b11.toString();
        }
    }

    public ReturnActionModalVO(long j11, @NotNull String returnNumber, @NotNull String action, TextDTO textDTO, TextDTO textDTO2, TabsDTO tabsDTO, DisclaimerAtom disclaimerAtom, Gallery gallery, List<ActionComponent> list, @NotNull ButtonV3DTO submitButton, ButtonV3DTO buttonV3DTO, Map<String, String> map) {
        Intrinsics.checkNotNullParameter(returnNumber, "returnNumber");
        Intrinsics.checkNotNullParameter(action, "action");
        Intrinsics.checkNotNullParameter(submitButton, "submitButton");
        this.id = j11;
        this.returnNumber = returnNumber;
        this.action = action;
        this.title = textDTO;
        this.subtitle = textDTO2;
        this.tabs = tabsDTO;
        this.hint = disclaimerAtom;
        this.photos = gallery;
        this.components = list;
        this.submitButton = submitButton;
        this.cancelButton = buttonV3DTO;
        this.extraValues = map;
    }

    @NotNull
    public final ReturnActionModalVO copy(long id2, @NotNull String returnNumber, @NotNull String action, TextDTO title, TextDTO subtitle, TabsDTO tabs, DisclaimerAtom hint, Gallery photos, List<ActionComponent> components, @NotNull ButtonV3DTO submitButton, ButtonV3DTO cancelButton, Map<String, String> extraValues) {
        Intrinsics.checkNotNullParameter(returnNumber, "returnNumber");
        Intrinsics.checkNotNullParameter(action, "action");
        Intrinsics.checkNotNullParameter(submitButton, "submitButton");
        return new ReturnActionModalVO(id2, returnNumber, action, title, subtitle, tabs, hint, photos, components, submitButton, cancelButton, extraValues);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ReturnActionModalVO)) {
            return false;
        }
        ReturnActionModalVO returnActionModalVO = (ReturnActionModalVO) other;
        return this.id == returnActionModalVO.id && Intrinsics.d(this.returnNumber, returnActionModalVO.returnNumber) && Intrinsics.d(this.action, returnActionModalVO.action) && Intrinsics.d(this.title, returnActionModalVO.title) && Intrinsics.d(this.subtitle, returnActionModalVO.subtitle) && Intrinsics.d(this.tabs, returnActionModalVO.tabs) && Intrinsics.d(this.hint, returnActionModalVO.hint) && Intrinsics.d(this.photos, returnActionModalVO.photos) && Intrinsics.d(this.components, returnActionModalVO.components) && Intrinsics.d(this.submitButton, returnActionModalVO.submitButton) && Intrinsics.d(this.cancelButton, returnActionModalVO.cancelButton) && Intrinsics.d(this.extraValues, returnActionModalVO.extraValues);
    }

    @NotNull
    public final String getAction() {
        return this.action;
    }

    public final ButtonV3DTO getCancelButton() {
        return this.cancelButton;
    }

    public final List<ActionComponent> getComponents() {
        return this.components;
    }

    public final Map<String, String> getExtraValues() {
        return this.extraValues;
    }

    public final DisclaimerAtom getHint() {
        return this.hint;
    }

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    public final Gallery getPhotos() {
        return this.photos;
    }

    @NotNull
    public final String getReturnNumber() {
        return this.returnNumber;
    }

    @Override // l20.c
    public Integer getScrollWidgetKey() {
        return null;
    }

    @NotNull
    public final ButtonV3DTO getSubmitButton() {
        return this.submitButton;
    }

    public final TextDTO getSubtitle() {
        return this.subtitle;
    }

    public final TabsDTO getTabs() {
        return this.tabs;
    }

    public final TextDTO getTitle() {
        return this.title;
    }

    @Override // l20.c
    public int getViewItemKey() {
        return hashCode();
    }

    public int hashCode() {
        int a11 = g.a(g.a(Long.hashCode(this.id) * 31, 31, this.returnNumber), 31, this.action);
        TextDTO textDTO = this.title;
        int hashCode = (a11 + (textDTO == null ? 0 : textDTO.hashCode())) * 31;
        TextDTO textDTO2 = this.subtitle;
        int hashCode2 = (hashCode + (textDTO2 == null ? 0 : textDTO2.hashCode())) * 31;
        TabsDTO tabsDTO = this.tabs;
        int hashCode3 = (hashCode2 + (tabsDTO == null ? 0 : tabsDTO.hashCode())) * 31;
        DisclaimerAtom disclaimerAtom = this.hint;
        int hashCode4 = (hashCode3 + (disclaimerAtom == null ? 0 : disclaimerAtom.hashCode())) * 31;
        Gallery gallery = this.photos;
        int hashCode5 = (hashCode4 + (gallery == null ? 0 : gallery.hashCode())) * 31;
        List<ActionComponent> list = this.components;
        int c11 = C2859b.c(this.submitButton, (hashCode5 + (list == null ? 0 : list.hashCode())) * 31, 31);
        ButtonV3DTO buttonV3DTO = this.cancelButton;
        int hashCode6 = (c11 + (buttonV3DTO == null ? 0 : buttonV3DTO.hashCode())) * 31;
        Map<String, String> map = this.extraValues;
        return hashCode6 + (map != null ? map.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        long j11 = this.id;
        String str = this.returnNumber;
        String str2 = this.action;
        TextDTO textDTO = this.title;
        TextDTO textDTO2 = this.subtitle;
        TabsDTO tabsDTO = this.tabs;
        DisclaimerAtom disclaimerAtom = this.hint;
        Gallery gallery = this.photos;
        List<ActionComponent> list = this.components;
        ButtonV3DTO buttonV3DTO = this.submitButton;
        ButtonV3DTO buttonV3DTO2 = this.cancelButton;
        Map<String, String> map = this.extraValues;
        StringBuilder c11 = C2436a.c(j11, "ReturnActionModalVO(id=", ", returnNumber=", str);
        c11.append(", action=");
        c11.append(str2);
        c11.append(", title=");
        c11.append(textDTO);
        c11.append(", subtitle=");
        c11.append(textDTO2);
        c11.append(", tabs=");
        c11.append(tabsDTO);
        c11.append(", hint=");
        c11.append(disclaimerAtom);
        c11.append(", photos=");
        c11.append(gallery);
        c11.append(", components=");
        c11.append(list);
        c11.append(", submitButton=");
        c11.append(buttonV3DTO);
        c11.append(", cancelButton=");
        c11.append(buttonV3DTO2);
        c11.append(", extraValues=");
        c11.append(map);
        c11.append(")");
        return c11.toString();
    }
}
