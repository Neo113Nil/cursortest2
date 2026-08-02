package ru.ozon.app.android.commonwidgets.widgets.curtainnavbar.data;

import G.g;
import I0.C3173b;
import N3.C3660k;
import Nh.a;
import T7.P;
import com.squareup.moshi.j;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.button.ButtonV3Atom;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001:\u0003'()BA\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\r\u0010\u000eJ\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u000bHÆ\u0003JO\u0010 \u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000bHÆ\u0001J\u0013\u0010!\u001a\u00020\"2\b\u0010#\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010$\u001a\u00020%HÖ\u0001J\t\u0010&\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0013\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0018¨\u0006*"}, d2 = {"Lru/ozon/app/android/commonwidgets/widgets/curtainnavbar/data/CurtainNavBarDTO;", "", "style", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/app/android/commonwidgets/widgets/curtainnavbar/data/CurtainNavBarDTO$Title;", "actionLeft", "Lru/ozon/app/android/commonwidgets/widgets/curtainnavbar/data/CurtainNavBarDTO$ActionLeft;", "actionRight", "Lru/ozon/app/android/commonwidgets/widgets/curtainnavbar/data/CurtainNavBarDTO$ActionRight;", "leftButton", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallBorderlessButtonWithIcon;", "rightButton", "<init>", "(Ljava/lang/String;Lru/ozon/app/android/commonwidgets/widgets/curtainnavbar/data/CurtainNavBarDTO$Title;Lru/ozon/app/android/commonwidgets/widgets/curtainnavbar/data/CurtainNavBarDTO$ActionLeft;Lru/ozon/app/android/commonwidgets/widgets/curtainnavbar/data/CurtainNavBarDTO$ActionRight;Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallBorderlessButtonWithIcon;Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallBorderlessButtonWithIcon;)V", "getStyle", "()Ljava/lang/String;", "getTitle", "()Lru/ozon/app/android/commonwidgets/widgets/curtainnavbar/data/CurtainNavBarDTO$Title;", "getActionLeft", "()Lru/ozon/app/android/commonwidgets/widgets/curtainnavbar/data/CurtainNavBarDTO$ActionLeft;", "getActionRight", "()Lru/ozon/app/android/commonwidgets/widgets/curtainnavbar/data/CurtainNavBarDTO$ActionRight;", "getLeftButton", "()Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallBorderlessButtonWithIcon;", "getRightButton", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "", "toString", "Title", "ActionLeft", "ActionRight", "commonwidgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class CurtainNavBarDTO {
    private final ActionLeft actionLeft;
    private final ActionRight actionRight;
    private final ButtonV3Atom.SmallBorderlessButtonWithIcon leftButton;
    private final ButtonV3Atom.SmallBorderlessButtonWithIcon rightButton;

    @NotNull
    private final String style;
    private final Title title;

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001Bc\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0014\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0001\u0018\u00010\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\u0014\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000b\u0018\u00010\b¢\u0006\u0004\b\f\u0010\rJ\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\u0017\u0010\u001b\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0001\u0018\u00010\bHÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0017\u0010\u001d\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000b\u0018\u00010\bHÆ\u0003Js\u0010\u001e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\u0016\b\u0002\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0001\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\u0016\b\u0002\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000b\u0018\u00010\bHÆ\u0001J\u0013\u0010\u001f\u001a\u00020 2\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\"\u001a\u00020#HÖ\u0001J\t\u0010$\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000fR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000fR\u001f\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0001\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u000fR\u001f\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000b\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0014¨\u0006%"}, d2 = {"Lru/ozon/app/android/commonwidgets/widgets/curtainnavbar/data/CurtainNavBarDTO$ActionLeft;", "", "text", "", "icon", "deeplink", "actionId", "postParams", "", "parentDeeplink", "trackingInfo", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;Ljava/util/Map;)V", "getText", "()Ljava/lang/String;", "getIcon", "getDeeplink", "getActionId", "getPostParams", "()Ljava/util/Map;", "getParentDeeplink", "getTrackingInfo", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", "other", "hashCode", "", "toString", "commonwidgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class ActionLeft {

        @NotNull
        private final String actionId;
        private final String deeplink;
        private final String icon;
        private final String parentDeeplink;
        private final Map<String, Object> postParams;
        private final String text;
        private final Map<String, TokenizedTrackingInfo> trackingInfo;

        public ActionLeft(String str, String str2, String str3, @NotNull String actionId, Map<String, ? extends Object> map, String str4, Map<String, TokenizedTrackingInfo> map2) {
            Intrinsics.checkNotNullParameter(actionId, "actionId");
            this.text = str;
            this.icon = str2;
            this.deeplink = str3;
            this.actionId = actionId;
            this.postParams = map;
            this.parentDeeplink = str4;
            this.trackingInfo = map2;
        }

        public static /* synthetic */ ActionLeft copy$default(ActionLeft actionLeft, String str, String str2, String str3, String str4, Map map, String str5, Map map2, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = actionLeft.text;
            }
            if ((i11 & 2) != 0) {
                str2 = actionLeft.icon;
            }
            if ((i11 & 4) != 0) {
                str3 = actionLeft.deeplink;
            }
            if ((i11 & 8) != 0) {
                str4 = actionLeft.actionId;
            }
            if ((i11 & 16) != 0) {
                map = actionLeft.postParams;
            }
            if ((i11 & 32) != 0) {
                str5 = actionLeft.parentDeeplink;
            }
            if ((i11 & 64) != 0) {
                map2 = actionLeft.trackingInfo;
            }
            String str6 = str5;
            Map map3 = map2;
            Map map4 = map;
            String str7 = str3;
            return actionLeft.copy(str, str2, str7, str4, map4, str6, map3);
        }

        /* renamed from: component1, reason: from getter */
        public final String getText() {
            return this.text;
        }

        /* renamed from: component2, reason: from getter */
        public final String getIcon() {
            return this.icon;
        }

        /* renamed from: component3, reason: from getter */
        public final String getDeeplink() {
            return this.deeplink;
        }

        @NotNull
        /* renamed from: component4, reason: from getter */
        public final String getActionId() {
            return this.actionId;
        }

        public final Map<String, Object> component5() {
            return this.postParams;
        }

        /* renamed from: component6, reason: from getter */
        public final String getParentDeeplink() {
            return this.parentDeeplink;
        }

        public final Map<String, TokenizedTrackingInfo> component7() {
            return this.trackingInfo;
        }

        @NotNull
        public final ActionLeft copy(String text, String icon, String deeplink, @NotNull String actionId, Map<String, ? extends Object> postParams, String parentDeeplink, Map<String, TokenizedTrackingInfo> trackingInfo) {
            Intrinsics.checkNotNullParameter(actionId, "actionId");
            return new ActionLeft(text, icon, deeplink, actionId, postParams, parentDeeplink, trackingInfo);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ActionLeft)) {
                return false;
            }
            ActionLeft actionLeft = (ActionLeft) other;
            return Intrinsics.d(this.text, actionLeft.text) && Intrinsics.d(this.icon, actionLeft.icon) && Intrinsics.d(this.deeplink, actionLeft.deeplink) && Intrinsics.d(this.actionId, actionLeft.actionId) && Intrinsics.d(this.postParams, actionLeft.postParams) && Intrinsics.d(this.parentDeeplink, actionLeft.parentDeeplink) && Intrinsics.d(this.trackingInfo, actionLeft.trackingInfo);
        }

        @NotNull
        public final String getActionId() {
            return this.actionId;
        }

        public final String getDeeplink() {
            return this.deeplink;
        }

        public final String getIcon() {
            return this.icon;
        }

        public final String getParentDeeplink() {
            return this.parentDeeplink;
        }

        public final Map<String, Object> getPostParams() {
            return this.postParams;
        }

        public final String getText() {
            return this.text;
        }

        public final Map<String, TokenizedTrackingInfo> getTrackingInfo() {
            return this.trackingInfo;
        }

        public int hashCode() {
            String str = this.text;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.icon;
            int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.deeplink;
            int a11 = g.a((hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31, 31, this.actionId);
            Map<String, Object> map = this.postParams;
            int hashCode3 = (a11 + (map == null ? 0 : map.hashCode())) * 31;
            String str4 = this.parentDeeplink;
            int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
            Map<String, TokenizedTrackingInfo> map2 = this.trackingInfo;
            return hashCode4 + (map2 != null ? map2.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            String str = this.text;
            String str2 = this.icon;
            String str3 = this.deeplink;
            String str4 = this.actionId;
            Map<String, Object> map = this.postParams;
            String str5 = this.parentDeeplink;
            Map<String, TokenizedTrackingInfo> map2 = this.trackingInfo;
            StringBuilder d11 = C3660k.d("ActionLeft(text=", str, ", icon=", str2, ", deeplink=");
            a.h(d11, str3, ", actionId=", str4, ", postParams=");
            d11.append(map);
            d11.append(", parentDeeplink=");
            d11.append(str5);
            d11.append(", trackingInfo=");
            return P.f(d11, map2, ")");
        }
    }

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001Bc\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0014\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0001\u0018\u00010\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\u0014\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000b\u0018\u00010\b¢\u0006\u0004\b\f\u0010\rJ\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\u0017\u0010\u001b\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0001\u0018\u00010\bHÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0017\u0010\u001d\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000b\u0018\u00010\bHÆ\u0003Js\u0010\u001e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\u0016\b\u0002\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0001\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\u0016\b\u0002\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000b\u0018\u00010\bHÆ\u0001J\u0013\u0010\u001f\u001a\u00020 2\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\"\u001a\u00020#HÖ\u0001J\t\u0010$\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000fR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000fR\u001f\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0001\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u000fR\u001f\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000b\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0014¨\u0006%"}, d2 = {"Lru/ozon/app/android/commonwidgets/widgets/curtainnavbar/data/CurtainNavBarDTO$ActionRight;", "", "text", "", "icon", "deeplink", "actionId", "postParams", "", "parentDeeplink", "trackingInfo", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;Ljava/util/Map;)V", "getText", "()Ljava/lang/String;", "getIcon", "getDeeplink", "getActionId", "getPostParams", "()Ljava/util/Map;", "getParentDeeplink", "getTrackingInfo", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", "other", "hashCode", "", "toString", "commonwidgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class ActionRight {

        @NotNull
        private final String actionId;
        private final String deeplink;
        private final String icon;
        private final String parentDeeplink;
        private final Map<String, Object> postParams;
        private final String text;
        private final Map<String, TokenizedTrackingInfo> trackingInfo;

        public ActionRight(String str, String str2, String str3, @NotNull String actionId, Map<String, ? extends Object> map, String str4, Map<String, TokenizedTrackingInfo> map2) {
            Intrinsics.checkNotNullParameter(actionId, "actionId");
            this.text = str;
            this.icon = str2;
            this.deeplink = str3;
            this.actionId = actionId;
            this.postParams = map;
            this.parentDeeplink = str4;
            this.trackingInfo = map2;
        }

        public static /* synthetic */ ActionRight copy$default(ActionRight actionRight, String str, String str2, String str3, String str4, Map map, String str5, Map map2, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = actionRight.text;
            }
            if ((i11 & 2) != 0) {
                str2 = actionRight.icon;
            }
            if ((i11 & 4) != 0) {
                str3 = actionRight.deeplink;
            }
            if ((i11 & 8) != 0) {
                str4 = actionRight.actionId;
            }
            if ((i11 & 16) != 0) {
                map = actionRight.postParams;
            }
            if ((i11 & 32) != 0) {
                str5 = actionRight.parentDeeplink;
            }
            if ((i11 & 64) != 0) {
                map2 = actionRight.trackingInfo;
            }
            String str6 = str5;
            Map map3 = map2;
            Map map4 = map;
            String str7 = str3;
            return actionRight.copy(str, str2, str7, str4, map4, str6, map3);
        }

        /* renamed from: component1, reason: from getter */
        public final String getText() {
            return this.text;
        }

        /* renamed from: component2, reason: from getter */
        public final String getIcon() {
            return this.icon;
        }

        /* renamed from: component3, reason: from getter */
        public final String getDeeplink() {
            return this.deeplink;
        }

        @NotNull
        /* renamed from: component4, reason: from getter */
        public final String getActionId() {
            return this.actionId;
        }

        public final Map<String, Object> component5() {
            return this.postParams;
        }

        /* renamed from: component6, reason: from getter */
        public final String getParentDeeplink() {
            return this.parentDeeplink;
        }

        public final Map<String, TokenizedTrackingInfo> component7() {
            return this.trackingInfo;
        }

        @NotNull
        public final ActionRight copy(String text, String icon, String deeplink, @NotNull String actionId, Map<String, ? extends Object> postParams, String parentDeeplink, Map<String, TokenizedTrackingInfo> trackingInfo) {
            Intrinsics.checkNotNullParameter(actionId, "actionId");
            return new ActionRight(text, icon, deeplink, actionId, postParams, parentDeeplink, trackingInfo);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ActionRight)) {
                return false;
            }
            ActionRight actionRight = (ActionRight) other;
            return Intrinsics.d(this.text, actionRight.text) && Intrinsics.d(this.icon, actionRight.icon) && Intrinsics.d(this.deeplink, actionRight.deeplink) && Intrinsics.d(this.actionId, actionRight.actionId) && Intrinsics.d(this.postParams, actionRight.postParams) && Intrinsics.d(this.parentDeeplink, actionRight.parentDeeplink) && Intrinsics.d(this.trackingInfo, actionRight.trackingInfo);
        }

        @NotNull
        public final String getActionId() {
            return this.actionId;
        }

        public final String getDeeplink() {
            return this.deeplink;
        }

        public final String getIcon() {
            return this.icon;
        }

        public final String getParentDeeplink() {
            return this.parentDeeplink;
        }

        public final Map<String, Object> getPostParams() {
            return this.postParams;
        }

        public final String getText() {
            return this.text;
        }

        public final Map<String, TokenizedTrackingInfo> getTrackingInfo() {
            return this.trackingInfo;
        }

        public int hashCode() {
            String str = this.text;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.icon;
            int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.deeplink;
            int a11 = g.a((hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31, 31, this.actionId);
            Map<String, Object> map = this.postParams;
            int hashCode3 = (a11 + (map == null ? 0 : map.hashCode())) * 31;
            String str4 = this.parentDeeplink;
            int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
            Map<String, TokenizedTrackingInfo> map2 = this.trackingInfo;
            return hashCode4 + (map2 != null ? map2.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            String str = this.text;
            String str2 = this.icon;
            String str3 = this.deeplink;
            String str4 = this.actionId;
            Map<String, Object> map = this.postParams;
            String str5 = this.parentDeeplink;
            Map<String, TokenizedTrackingInfo> map2 = this.trackingInfo;
            StringBuilder d11 = C3660k.d("ActionRight(text=", str, ", icon=", str2, ", deeplink=");
            a.h(d11, str3, ", actionId=", str4, ", postParams=");
            d11.append(map);
            d11.append(", parentDeeplink=");
            d11.append(str5);
            d11.append(", trackingInfo=");
            return P.f(d11, map2, ")");
        }
    }

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J7\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\n¨\u0006\u0019"}, d2 = {"Lru/ozon/app/android/commonwidgets/widgets/curtainnavbar/data/CurtainNavBarDTO$Title;", "", "text", "", "textColor", "subtext", "subtextColor", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getText", "()Ljava/lang/String;", "getTextColor", "getSubtext", "getSubtextColor", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "commonwidgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Title {
        private final String subtext;
        private final String subtextColor;

        @NotNull
        private final String text;
        private final String textColor;

        public Title(@NotNull String text, String str, String str2, String str3) {
            Intrinsics.checkNotNullParameter(text, "text");
            this.text = text;
            this.textColor = str;
            this.subtext = str2;
            this.subtextColor = str3;
        }

        public static /* synthetic */ Title copy$default(Title title, String str, String str2, String str3, String str4, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = title.text;
            }
            if ((i11 & 2) != 0) {
                str2 = title.textColor;
            }
            if ((i11 & 4) != 0) {
                str3 = title.subtext;
            }
            if ((i11 & 8) != 0) {
                str4 = title.subtextColor;
            }
            return title.copy(str, str2, str3, str4);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final String getText() {
            return this.text;
        }

        /* renamed from: component2, reason: from getter */
        public final String getTextColor() {
            return this.textColor;
        }

        /* renamed from: component3, reason: from getter */
        public final String getSubtext() {
            return this.subtext;
        }

        /* renamed from: component4, reason: from getter */
        public final String getSubtextColor() {
            return this.subtextColor;
        }

        @NotNull
        public final Title copy(@NotNull String text, String textColor, String subtext, String subtextColor) {
            Intrinsics.checkNotNullParameter(text, "text");
            return new Title(text, textColor, subtext, subtextColor);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Title)) {
                return false;
            }
            Title title = (Title) other;
            return Intrinsics.d(this.text, title.text) && Intrinsics.d(this.textColor, title.textColor) && Intrinsics.d(this.subtext, title.subtext) && Intrinsics.d(this.subtextColor, title.subtextColor);
        }

        public final String getSubtext() {
            return this.subtext;
        }

        public final String getSubtextColor() {
            return this.subtextColor;
        }

        @NotNull
        public final String getText() {
            return this.text;
        }

        public final String getTextColor() {
            return this.textColor;
        }

        public int hashCode() {
            int hashCode = this.text.hashCode() * 31;
            String str = this.textColor;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.subtext;
            int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.subtextColor;
            return hashCode3 + (str3 != null ? str3.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            String str = this.text;
            String str2 = this.textColor;
            return C3173b.c(C3660k.d("Title(text=", str, ", textColor=", str2, ", subtext="), this.subtext, ", subtextColor=", this.subtextColor, ")");
        }
    }

    public CurtainNavBarDTO(@NotNull String style, Title title, ActionLeft actionLeft, ActionRight actionRight, ButtonV3Atom.SmallBorderlessButtonWithIcon smallBorderlessButtonWithIcon, ButtonV3Atom.SmallBorderlessButtonWithIcon smallBorderlessButtonWithIcon2) {
        Intrinsics.checkNotNullParameter(style, "style");
        this.style = style;
        this.title = title;
        this.actionLeft = actionLeft;
        this.actionRight = actionRight;
        this.leftButton = smallBorderlessButtonWithIcon;
        this.rightButton = smallBorderlessButtonWithIcon2;
    }

    public static /* synthetic */ CurtainNavBarDTO copy$default(CurtainNavBarDTO curtainNavBarDTO, String str, Title title, ActionLeft actionLeft, ActionRight actionRight, ButtonV3Atom.SmallBorderlessButtonWithIcon smallBorderlessButtonWithIcon, ButtonV3Atom.SmallBorderlessButtonWithIcon smallBorderlessButtonWithIcon2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = curtainNavBarDTO.style;
        }
        if ((i11 & 2) != 0) {
            title = curtainNavBarDTO.title;
        }
        if ((i11 & 4) != 0) {
            actionLeft = curtainNavBarDTO.actionLeft;
        }
        if ((i11 & 8) != 0) {
            actionRight = curtainNavBarDTO.actionRight;
        }
        if ((i11 & 16) != 0) {
            smallBorderlessButtonWithIcon = curtainNavBarDTO.leftButton;
        }
        if ((i11 & 32) != 0) {
            smallBorderlessButtonWithIcon2 = curtainNavBarDTO.rightButton;
        }
        ButtonV3Atom.SmallBorderlessButtonWithIcon smallBorderlessButtonWithIcon3 = smallBorderlessButtonWithIcon;
        ButtonV3Atom.SmallBorderlessButtonWithIcon smallBorderlessButtonWithIcon4 = smallBorderlessButtonWithIcon2;
        return curtainNavBarDTO.copy(str, title, actionLeft, actionRight, smallBorderlessButtonWithIcon3, smallBorderlessButtonWithIcon4);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getStyle() {
        return this.style;
    }

    /* renamed from: component2, reason: from getter */
    public final Title getTitle() {
        return this.title;
    }

    /* renamed from: component3, reason: from getter */
    public final ActionLeft getActionLeft() {
        return this.actionLeft;
    }

    /* renamed from: component4, reason: from getter */
    public final ActionRight getActionRight() {
        return this.actionRight;
    }

    /* renamed from: component5, reason: from getter */
    public final ButtonV3Atom.SmallBorderlessButtonWithIcon getLeftButton() {
        return this.leftButton;
    }

    /* renamed from: component6, reason: from getter */
    public final ButtonV3Atom.SmallBorderlessButtonWithIcon getRightButton() {
        return this.rightButton;
    }

    @NotNull
    public final CurtainNavBarDTO copy(@NotNull String style, Title title, ActionLeft actionLeft, ActionRight actionRight, ButtonV3Atom.SmallBorderlessButtonWithIcon leftButton, ButtonV3Atom.SmallBorderlessButtonWithIcon rightButton) {
        Intrinsics.checkNotNullParameter(style, "style");
        return new CurtainNavBarDTO(style, title, actionLeft, actionRight, leftButton, rightButton);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CurtainNavBarDTO)) {
            return false;
        }
        CurtainNavBarDTO curtainNavBarDTO = (CurtainNavBarDTO) other;
        return Intrinsics.d(this.style, curtainNavBarDTO.style) && Intrinsics.d(this.title, curtainNavBarDTO.title) && Intrinsics.d(this.actionLeft, curtainNavBarDTO.actionLeft) && Intrinsics.d(this.actionRight, curtainNavBarDTO.actionRight) && Intrinsics.d(this.leftButton, curtainNavBarDTO.leftButton) && Intrinsics.d(this.rightButton, curtainNavBarDTO.rightButton);
    }

    public final ActionLeft getActionLeft() {
        return this.actionLeft;
    }

    public final ActionRight getActionRight() {
        return this.actionRight;
    }

    public final ButtonV3Atom.SmallBorderlessButtonWithIcon getLeftButton() {
        return this.leftButton;
    }

    public final ButtonV3Atom.SmallBorderlessButtonWithIcon getRightButton() {
        return this.rightButton;
    }

    @NotNull
    public final String getStyle() {
        return this.style;
    }

    public final Title getTitle() {
        return this.title;
    }

    public int hashCode() {
        int hashCode = this.style.hashCode() * 31;
        Title title = this.title;
        int hashCode2 = (hashCode + (title == null ? 0 : title.hashCode())) * 31;
        ActionLeft actionLeft = this.actionLeft;
        int hashCode3 = (hashCode2 + (actionLeft == null ? 0 : actionLeft.hashCode())) * 31;
        ActionRight actionRight = this.actionRight;
        int hashCode4 = (hashCode3 + (actionRight == null ? 0 : actionRight.hashCode())) * 31;
        ButtonV3Atom.SmallBorderlessButtonWithIcon smallBorderlessButtonWithIcon = this.leftButton;
        int hashCode5 = (hashCode4 + (smallBorderlessButtonWithIcon == null ? 0 : smallBorderlessButtonWithIcon.hashCode())) * 31;
        ButtonV3Atom.SmallBorderlessButtonWithIcon smallBorderlessButtonWithIcon2 = this.rightButton;
        return hashCode5 + (smallBorderlessButtonWithIcon2 != null ? smallBorderlessButtonWithIcon2.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "CurtainNavBarDTO(style=" + this.style + ", title=" + this.title + ", actionLeft=" + this.actionLeft + ", actionRight=" + this.actionRight + ", leftButton=" + this.leftButton + ", rightButton=" + this.rightButton + ")";
    }
}
