package ru.ozon.app.android.button.data;

import An.C2439a;
import G.g;
import N3.C3660k;
import com.squareup.moshi.j;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.button.actions.extendDelivery.ExtendDeliveryActionDTO;
import ru.ozon.app.android.button.actions.redirect.CommonRedirectActionDTO;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.moshi.adapters.serialize.proto.ProtoOneOf;
import ru.ozon.moshi.adapters.serialize.proto.ProtoOneOfSignature;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0081\b\u0018\u00002\u00020\u0001:\u0001\u0016B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\u0011\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0003J%\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0019\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0017"}, d2 = {"Lru/ozon/app/android/button/data/ActionButtonDTO;", "", "displayStyle", "", "buttons", "", "Lru/ozon/app/android/button/data/ActionButtonDTO$ButtonsItem;", "<init>", "(Ljava/lang/String;Ljava/util/List;)V", "getDisplayStyle", "()Ljava/lang/String;", "getButtons", "()Ljava/util/List;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "ButtonsItem", "button_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class ActionButtonDTO {
    private final List<ButtonsItem> buttons;

    @NotNull
    private final String displayStyle;

    public ActionButtonDTO(@NotNull String displayStyle, List<ButtonsItem> list) {
        Intrinsics.checkNotNullParameter(displayStyle, "displayStyle");
        this.displayStyle = displayStyle;
        this.buttons = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ActionButtonDTO copy$default(ActionButtonDTO actionButtonDTO, String str, List list, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = actionButtonDTO.displayStyle;
        }
        if ((i11 & 2) != 0) {
            list = actionButtonDTO.buttons;
        }
        return actionButtonDTO.copy(str, list);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getDisplayStyle() {
        return this.displayStyle;
    }

    public final List<ButtonsItem> component2() {
        return this.buttons;
    }

    @NotNull
    public final ActionButtonDTO copy(@NotNull String displayStyle, List<ButtonsItem> buttons) {
        Intrinsics.checkNotNullParameter(displayStyle, "displayStyle");
        return new ActionButtonDTO(displayStyle, buttons);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ActionButtonDTO)) {
            return false;
        }
        ActionButtonDTO actionButtonDTO = (ActionButtonDTO) other;
        return Intrinsics.d(this.displayStyle, actionButtonDTO.displayStyle) && Intrinsics.d(this.buttons, actionButtonDTO.buttons);
    }

    public final List<ButtonsItem> getButtons() {
        return this.buttons;
    }

    @NotNull
    public final String getDisplayStyle() {
        return this.displayStyle;
    }

    public int hashCode() {
        int hashCode = this.displayStyle.hashCode() * 31;
        List<ButtonsItem> list = this.buttons;
        return hashCode + (list == null ? 0 : list.hashCode());
    }

    @NotNull
    public String toString() {
        return C2439a.a("ActionButtonDTO(displayStyle=", this.displayStyle, ", buttons=", ")", this.buttons);
    }

    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u001eB;\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0016\b\u0002\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\t\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u0017\u0010\u0016\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\t\u0018\u00010\bHÆ\u0003JA\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0016\b\u0002\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\t\u0018\u00010\bHÆ\u0001J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J\t\u0010\u001d\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u001f\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\t\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u001f"}, d2 = {"Lru/ozon/app/android/button/data/ActionButtonDTO$ButtonsItem;", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "", "style", "action", "Lru/ozon/app/android/button/data/ActionButtonDTO$ButtonsItem$Action;", "trackingInfo", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lru/ozon/app/android/button/data/ActionButtonDTO$ButtonsItem$Action;Ljava/util/Map;)V", "getTitle", "()Ljava/lang/String;", "getStyle", "getAction", "()Lru/ozon/app/android/button/data/ActionButtonDTO$ButtonsItem$Action;", "getTrackingInfo", "()Ljava/util/Map;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "Action", "button_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @j(generateAdapter = true)
    public static final /* data */ class ButtonsItem {
        private final Action action;

        @NotNull
        private final String style;

        @NotNull
        private final String title;
        private final Map<String, TokenizedTrackingInfo> trackingInfo;

        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lru/ozon/app/android/button/data/ActionButtonDTO$ButtonsItem$Action;", "", "type", "", "getType", "()Ljava/lang/String;", "button_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public interface Action {
            @NotNull
            String getType();
        }

        public ButtonsItem(@NotNull String title, @NotNull String style, @ProtoOneOfSignature.Container({@ProtoOneOfSignature(name = "csma.extendDeliveryDate", type = ExtendDeliveryActionDTO.class), @ProtoOneOfSignature(name = "common.redirect", type = CommonRedirectActionDTO.class)}) @ProtoOneOf(label = "type") Action action, Map<String, TokenizedTrackingInfo> map) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(style, "style");
            this.title = title;
            this.style = style;
            this.action = action;
            this.trackingInfo = map;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ ButtonsItem copy$default(ButtonsItem buttonsItem, String str, String str2, Action action, Map map, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = buttonsItem.title;
            }
            if ((i11 & 2) != 0) {
                str2 = buttonsItem.style;
            }
            if ((i11 & 4) != 0) {
                action = buttonsItem.action;
            }
            if ((i11 & 8) != 0) {
                map = buttonsItem.trackingInfo;
            }
            return buttonsItem.copy(str, str2, action, map);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final String getStyle() {
            return this.style;
        }

        /* renamed from: component3, reason: from getter */
        public final Action getAction() {
            return this.action;
        }

        public final Map<String, TokenizedTrackingInfo> component4() {
            return this.trackingInfo;
        }

        @NotNull
        public final ButtonsItem copy(@NotNull String title, @NotNull String style, @ProtoOneOfSignature.Container({@ProtoOneOfSignature(name = "csma.extendDeliveryDate", type = ExtendDeliveryActionDTO.class), @ProtoOneOfSignature(name = "common.redirect", type = CommonRedirectActionDTO.class)}) @ProtoOneOf(label = "type") Action action, Map<String, TokenizedTrackingInfo> trackingInfo) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(style, "style");
            return new ButtonsItem(title, style, action, trackingInfo);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ButtonsItem)) {
                return false;
            }
            ButtonsItem buttonsItem = (ButtonsItem) other;
            return Intrinsics.d(this.title, buttonsItem.title) && Intrinsics.d(this.style, buttonsItem.style) && Intrinsics.d(this.action, buttonsItem.action) && Intrinsics.d(this.trackingInfo, buttonsItem.trackingInfo);
        }

        public final Action getAction() {
            return this.action;
        }

        @NotNull
        public final String getStyle() {
            return this.style;
        }

        @NotNull
        public final String getTitle() {
            return this.title;
        }

        public final Map<String, TokenizedTrackingInfo> getTrackingInfo() {
            return this.trackingInfo;
        }

        public int hashCode() {
            int a11 = g.a(this.title.hashCode() * 31, 31, this.style);
            Action action = this.action;
            int hashCode = (a11 + (action == null ? 0 : action.hashCode())) * 31;
            Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
            return hashCode + (map != null ? map.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            String str = this.title;
            String str2 = this.style;
            Action action = this.action;
            Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
            StringBuilder d11 = C3660k.d("ButtonsItem(title=", str, ", style=", str2, ", action=");
            d11.append(action);
            d11.append(", trackingInfo=");
            d11.append(map);
            d11.append(")");
            return d11.toString();
        }

        public /* synthetic */ ButtonsItem(String str, String str2, Action action, Map map, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, str2, action, (i11 & 8) != 0 ? null : map);
        }
    }
}
