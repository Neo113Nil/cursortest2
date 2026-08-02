package ru.ozon.app.android.commonwidgets.widgets.curtainnavbar.presentation;

import B0.C2454a;
import B4.V;
import Cm.e;
import Ds.C2880a;
import G.g;
import I0.C3173b;
import Kk.C3532b;
import N3.C3660k;
import Nh.a;
import Pk0.f;
import Pk0.i;
import Tl.b;
import WZ.t;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.R$style;
import ru.ozon.uni.atoms.data.button.ButtonV3Atom;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\b\u0086\b\u0018\u00002\u00060\u0001j\u0002`\u0002:\u0004\u001a\u001b\u001c\u001dB\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001e"}, d2 = {"Lru/ozon/app/android/commonwidgets/widgets/curtainnavbar/presentation/CurtainNavBarVO;", "Ll20/c;", "Lru/ozon/app/android/composer/view/ViewObject;", "", "id", "Lru/ozon/app/android/commonwidgets/widgets/curtainnavbar/presentation/CurtainNavBarVO$CurtainBar;", "curtainBar", "<init>", "(JLru/ozon/app/android/commonwidgets/widgets/curtainnavbar/presentation/CurtainNavBarVO$CurtainBar;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Lru/ozon/app/android/commonwidgets/widgets/curtainnavbar/presentation/CurtainNavBarVO$CurtainBar;", "getCurtainBar", "()Lru/ozon/app/android/commonwidgets/widgets/curtainnavbar/presentation/CurtainNavBarVO$CurtainBar;", "CurtainBar", "BarAction", "ActionLeft", "ActionRight", "commonwidgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class CurtainNavBarVO implements c {

    @NotNull
    private final CurtainBar curtainBar;
    private final long id;

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0010\u0011B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003R\u0012\u0010\u0004\u001a\u00020\u0005X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u0012\u0010\b\u001a\u00020\u0005X¦\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\u0007R\u0012\u0010\n\u001a\u00020\u000bX¦\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u0012\u0010\u000e\u001a\u00020\u000bX¦\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\r\u0082\u0001\u0002\u0012\u0013¨\u0006\u0014"}, d2 = {"Lru/ozon/app/android/commonwidgets/widgets/curtainnavbar/presentation/CurtainNavBarVO$ActionLeft;", "Lru/ozon/app/android/commonwidgets/widgets/curtainnavbar/presentation/CurtainNavBarVO$BarAction;", "<init>", "()V", "icon", "", "getIcon", "()Ljava/lang/String;", "text", "getText", "showTextAction", "", "getShowTextAction", "()Z", "showIconAction", "getShowIconAction", "TextAction", "IconAction", "Lru/ozon/app/android/commonwidgets/widgets/curtainnavbar/presentation/CurtainNavBarVO$ActionLeft$IconAction;", "Lru/ozon/app/android/commonwidgets/widgets/curtainnavbar/presentation/CurtainNavBarVO$ActionLeft$TextAction;", "commonwidgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static abstract class ActionLeft implements BarAction {
        public /* synthetic */ ActionLeft(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public abstract String getIcon();

        public abstract boolean getShowIconAction();

        public abstract boolean getShowTextAction();

        @NotNull
        public abstract String getText();

        @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0016\b\u0086\b\u0018\u00002\u00020\u0001Bo\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\u0007\u0012\u0014\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u0010\u001a\n\u0018\u00010\u000ej\u0004\u0018\u0001`\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u0019\u001a\u00020\u00072\b\u0010\u0018\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001b\u001a\u0004\b\u001c\u0010\u0014R\u001a\u0010\u0004\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001b\u001a\u0004\b\u001d\u0010\u0014R\u001a\u0010\u0005\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001b\u001a\u0004\b\u001e\u0010\u0014R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001b\u001a\u0004\b\u001f\u0010\u0014R\u001a\u0010\b\u001a\u00020\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\b\u0010 \u001a\u0004\b!\u0010\"R\u001a\u0010\t\u001a\u00020\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\t\u0010 \u001a\u0004\b#\u0010\"R(\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\f\u0010$\u001a\u0004\b%\u0010&R\u001c\u0010\r\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\r\u0010\u001b\u001a\u0004\b'\u0010\u0014R\"\u0010\u0010\u001a\n\u0018\u00010\u000ej\u0004\u0018\u0001`\u000f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0010\u0010(\u001a\u0004\b)\u0010*¨\u0006+"}, d2 = {"Lru/ozon/app/android/commonwidgets/widgets/curtainnavbar/presentation/CurtainNavBarVO$ActionLeft$IconAction;", "Lru/ozon/app/android/commonwidgets/widgets/curtainnavbar/presentation/CurtainNavBarVO$ActionLeft;", "", "actionId", "icon", "text", "deeplink", "", "showIconAction", "showTextAction", "", "", "postParams", "parentDeeplink", "LWZ/t;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedEvent;", "tokenizedEvent", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZLjava/util/Map;Ljava/lang/String;LWZ/t;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getActionId", "getIcon", "getText", "getDeeplink", "Z", "getShowIconAction", "()Z", "getShowTextAction", "Ljava/util/Map;", "getPostParams", "()Ljava/util/Map;", "getParentDeeplink", "LWZ/t;", "getTokenizedEvent", "()LWZ/t;", "commonwidgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class IconAction extends ActionLeft {

            @NotNull
            private final String actionId;
            private final String deeplink;

            @NotNull
            private final String icon;
            private final String parentDeeplink;
            private final Map<String, Object> postParams;
            private final boolean showIconAction;
            private final boolean showTextAction;

            @NotNull
            private final String text;
            private final t tokenizedEvent;

            public /* synthetic */ IconAction(String str, String str2, String str3, String str4, boolean z11, boolean z12, Map map, String str5, t tVar, int i11, DefaultConstructorMarker defaultConstructorMarker) {
                this(str, str2, (i11 & 4) != 0 ? "" : str3, str4, (i11 & 16) != 0 ? true : z11, (i11 & 32) != 0 ? false : z12, map, str5, tVar);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof IconAction)) {
                    return false;
                }
                IconAction iconAction = (IconAction) other;
                return Intrinsics.d(this.actionId, iconAction.actionId) && Intrinsics.d(this.icon, iconAction.icon) && Intrinsics.d(this.text, iconAction.text) && Intrinsics.d(this.deeplink, iconAction.deeplink) && this.showIconAction == iconAction.showIconAction && this.showTextAction == iconAction.showTextAction && Intrinsics.d(this.postParams, iconAction.postParams) && Intrinsics.d(this.parentDeeplink, iconAction.parentDeeplink) && Intrinsics.d(this.tokenizedEvent, iconAction.tokenizedEvent);
            }

            @Override // ru.ozon.app.android.commonwidgets.widgets.curtainnavbar.presentation.CurtainNavBarVO.BarAction
            @NotNull
            public String getActionId() {
                return this.actionId;
            }

            @Override // ru.ozon.app.android.commonwidgets.widgets.curtainnavbar.presentation.CurtainNavBarVO.BarAction
            public String getDeeplink() {
                return this.deeplink;
            }

            @Override // ru.ozon.app.android.commonwidgets.widgets.curtainnavbar.presentation.CurtainNavBarVO.ActionLeft
            @NotNull
            public String getIcon() {
                return this.icon;
            }

            @Override // ru.ozon.app.android.commonwidgets.widgets.curtainnavbar.presentation.CurtainNavBarVO.BarAction
            public String getParentDeeplink() {
                return this.parentDeeplink;
            }

            @Override // ru.ozon.app.android.commonwidgets.widgets.curtainnavbar.presentation.CurtainNavBarVO.BarAction
            public Map<String, Object> getPostParams() {
                return this.postParams;
            }

            @Override // ru.ozon.app.android.commonwidgets.widgets.curtainnavbar.presentation.CurtainNavBarVO.ActionLeft
            public boolean getShowIconAction() {
                return this.showIconAction;
            }

            @Override // ru.ozon.app.android.commonwidgets.widgets.curtainnavbar.presentation.CurtainNavBarVO.ActionLeft
            public boolean getShowTextAction() {
                return this.showTextAction;
            }

            @Override // ru.ozon.app.android.commonwidgets.widgets.curtainnavbar.presentation.CurtainNavBarVO.ActionLeft
            @NotNull
            public String getText() {
                return this.text;
            }

            @Override // ru.ozon.app.android.commonwidgets.widgets.curtainnavbar.presentation.CurtainNavBarVO.BarAction
            public t getTokenizedEvent() {
                return this.tokenizedEvent;
            }

            public int hashCode() {
                int a11 = g.a(g.a(this.actionId.hashCode() * 31, 31, this.icon), 31, this.text);
                String str = this.deeplink;
                int a12 = C3532b.a(C3532b.a((a11 + (str == null ? 0 : str.hashCode())) * 31, 31, this.showIconAction), 31, this.showTextAction);
                Map<String, Object> map = this.postParams;
                int hashCode = (a12 + (map == null ? 0 : map.hashCode())) * 31;
                String str2 = this.parentDeeplink;
                int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
                t tVar = this.tokenizedEvent;
                return hashCode2 + (tVar != null ? tVar.hashCode() : 0);
            }

            @NotNull
            public String toString() {
                String str = this.actionId;
                String str2 = this.icon;
                String str3 = this.text;
                String str4 = this.deeplink;
                boolean z11 = this.showIconAction;
                boolean z12 = this.showTextAction;
                Map<String, Object> map = this.postParams;
                String str5 = this.parentDeeplink;
                t tVar = this.tokenizedEvent;
                StringBuilder d11 = C3660k.d("IconAction(actionId=", str, ", icon=", str2, ", text=");
                a.h(d11, str3, ", deeplink=", str4, ", showIconAction=");
                f.c(", showTextAction=", ", postParams=", d11, z11, z12);
                d11.append(map);
                d11.append(", parentDeeplink=");
                d11.append(str5);
                d11.append(", tokenizedEvent=");
                return b.d(d11, tVar, ")");
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public IconAction(@NotNull String actionId, @NotNull String icon, @NotNull String text, String str, boolean z11, boolean z12, Map<String, ? extends Object> map, String str2, t tVar) {
                super(null);
                Intrinsics.checkNotNullParameter(actionId, "actionId");
                Intrinsics.checkNotNullParameter(icon, "icon");
                Intrinsics.checkNotNullParameter(text, "text");
                this.actionId = actionId;
                this.icon = icon;
                this.text = text;
                this.deeplink = str;
                this.showIconAction = z11;
                this.showTextAction = z12;
                this.postParams = map;
                this.parentDeeplink = str2;
                this.tokenizedEvent = tVar;
            }
        }

        @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0016\b\u0086\b\u0018\u00002\u00020\u0001Bo\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\u0007\u0012\u0014\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u0010\u001a\n\u0018\u00010\u000ej\u0004\u0018\u0001`\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u0019\u001a\u00020\u00072\b\u0010\u0018\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001b\u001a\u0004\b\u001c\u0010\u0014R\u001a\u0010\u0004\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001b\u001a\u0004\b\u001d\u0010\u0014R\u001a\u0010\u0005\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001b\u001a\u0004\b\u001e\u0010\u0014R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001b\u001a\u0004\b\u001f\u0010\u0014R\u001a\u0010\b\u001a\u00020\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\b\u0010 \u001a\u0004\b!\u0010\"R\u001a\u0010\t\u001a\u00020\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\t\u0010 \u001a\u0004\b#\u0010\"R(\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\f\u0010$\u001a\u0004\b%\u0010&R\u001c\u0010\r\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\r\u0010\u001b\u001a\u0004\b'\u0010\u0014R\"\u0010\u0010\u001a\n\u0018\u00010\u000ej\u0004\u0018\u0001`\u000f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0010\u0010(\u001a\u0004\b)\u0010*¨\u0006+"}, d2 = {"Lru/ozon/app/android/commonwidgets/widgets/curtainnavbar/presentation/CurtainNavBarVO$ActionLeft$TextAction;", "Lru/ozon/app/android/commonwidgets/widgets/curtainnavbar/presentation/CurtainNavBarVO$ActionLeft;", "", "actionId", "icon", "text", "deeplink", "", "showIconAction", "showTextAction", "", "", "postParams", "parentDeeplink", "LWZ/t;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedEvent;", "tokenizedEvent", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZLjava/util/Map;Ljava/lang/String;LWZ/t;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getActionId", "getIcon", "getText", "getDeeplink", "Z", "getShowIconAction", "()Z", "getShowTextAction", "Ljava/util/Map;", "getPostParams", "()Ljava/util/Map;", "getParentDeeplink", "LWZ/t;", "getTokenizedEvent", "()LWZ/t;", "commonwidgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class TextAction extends ActionLeft {

            @NotNull
            private final String actionId;
            private final String deeplink;

            @NotNull
            private final String icon;
            private final String parentDeeplink;
            private final Map<String, Object> postParams;
            private final boolean showIconAction;
            private final boolean showTextAction;

            @NotNull
            private final String text;
            private final t tokenizedEvent;

            public /* synthetic */ TextAction(String str, String str2, String str3, String str4, boolean z11, boolean z12, Map map, String str5, t tVar, int i11, DefaultConstructorMarker defaultConstructorMarker) {
                this(str, (i11 & 2) != 0 ? "" : str2, str3, str4, (i11 & 16) != 0 ? false : z11, (i11 & 32) != 0 ? true : z12, map, str5, tVar);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof TextAction)) {
                    return false;
                }
                TextAction textAction = (TextAction) other;
                return Intrinsics.d(this.actionId, textAction.actionId) && Intrinsics.d(this.icon, textAction.icon) && Intrinsics.d(this.text, textAction.text) && Intrinsics.d(this.deeplink, textAction.deeplink) && this.showIconAction == textAction.showIconAction && this.showTextAction == textAction.showTextAction && Intrinsics.d(this.postParams, textAction.postParams) && Intrinsics.d(this.parentDeeplink, textAction.parentDeeplink) && Intrinsics.d(this.tokenizedEvent, textAction.tokenizedEvent);
            }

            @Override // ru.ozon.app.android.commonwidgets.widgets.curtainnavbar.presentation.CurtainNavBarVO.BarAction
            @NotNull
            public String getActionId() {
                return this.actionId;
            }

            @Override // ru.ozon.app.android.commonwidgets.widgets.curtainnavbar.presentation.CurtainNavBarVO.BarAction
            public String getDeeplink() {
                return this.deeplink;
            }

            @Override // ru.ozon.app.android.commonwidgets.widgets.curtainnavbar.presentation.CurtainNavBarVO.ActionLeft
            @NotNull
            public String getIcon() {
                return this.icon;
            }

            @Override // ru.ozon.app.android.commonwidgets.widgets.curtainnavbar.presentation.CurtainNavBarVO.BarAction
            public String getParentDeeplink() {
                return this.parentDeeplink;
            }

            @Override // ru.ozon.app.android.commonwidgets.widgets.curtainnavbar.presentation.CurtainNavBarVO.BarAction
            public Map<String, Object> getPostParams() {
                return this.postParams;
            }

            @Override // ru.ozon.app.android.commonwidgets.widgets.curtainnavbar.presentation.CurtainNavBarVO.ActionLeft
            public boolean getShowIconAction() {
                return this.showIconAction;
            }

            @Override // ru.ozon.app.android.commonwidgets.widgets.curtainnavbar.presentation.CurtainNavBarVO.ActionLeft
            public boolean getShowTextAction() {
                return this.showTextAction;
            }

            @Override // ru.ozon.app.android.commonwidgets.widgets.curtainnavbar.presentation.CurtainNavBarVO.ActionLeft
            @NotNull
            public String getText() {
                return this.text;
            }

            @Override // ru.ozon.app.android.commonwidgets.widgets.curtainnavbar.presentation.CurtainNavBarVO.BarAction
            public t getTokenizedEvent() {
                return this.tokenizedEvent;
            }

            public int hashCode() {
                int a11 = g.a(g.a(this.actionId.hashCode() * 31, 31, this.icon), 31, this.text);
                String str = this.deeplink;
                int a12 = C3532b.a(C3532b.a((a11 + (str == null ? 0 : str.hashCode())) * 31, 31, this.showIconAction), 31, this.showTextAction);
                Map<String, Object> map = this.postParams;
                int hashCode = (a12 + (map == null ? 0 : map.hashCode())) * 31;
                String str2 = this.parentDeeplink;
                int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
                t tVar = this.tokenizedEvent;
                return hashCode2 + (tVar != null ? tVar.hashCode() : 0);
            }

            @NotNull
            public String toString() {
                String str = this.actionId;
                String str2 = this.icon;
                String str3 = this.text;
                String str4 = this.deeplink;
                boolean z11 = this.showIconAction;
                boolean z12 = this.showTextAction;
                Map<String, Object> map = this.postParams;
                String str5 = this.parentDeeplink;
                t tVar = this.tokenizedEvent;
                StringBuilder d11 = C3660k.d("TextAction(actionId=", str, ", icon=", str2, ", text=");
                a.h(d11, str3, ", deeplink=", str4, ", showIconAction=");
                f.c(", showTextAction=", ", postParams=", d11, z11, z12);
                d11.append(map);
                d11.append(", parentDeeplink=");
                d11.append(str5);
                d11.append(", tokenizedEvent=");
                return b.d(d11, tVar, ")");
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public TextAction(@NotNull String actionId, @NotNull String icon, @NotNull String text, String str, boolean z11, boolean z12, Map<String, ? extends Object> map, String str2, t tVar) {
                super(null);
                Intrinsics.checkNotNullParameter(actionId, "actionId");
                Intrinsics.checkNotNullParameter(icon, "icon");
                Intrinsics.checkNotNullParameter(text, "text");
                this.actionId = actionId;
                this.icon = icon;
                this.text = text;
                this.deeplink = str;
                this.showIconAction = z11;
                this.showTextAction = z12;
                this.postParams = map;
                this.parentDeeplink = str2;
                this.tokenizedEvent = tVar;
            }
        }

        private ActionLeft() {
        }
    }

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0016\u0017\u0018B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003R\u0012\u0010\u0004\u001a\u00020\u0005X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u0004\u0018\u00010\tX¦\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u0012\u0010\f\u001a\u00020\u0005X¦\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u0007R\u0012\u0010\u000e\u001a\u00020\u000fX¦\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0012\u0010\u0012\u001a\u00020\u000fX¦\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0011R\u0012\u0010\u0014\u001a\u00020\u000fX¦\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0011\u0082\u0001\u0003\u0019\u001a\u001b¨\u0006\u001c"}, d2 = {"Lru/ozon/app/android/commonwidgets/widgets/curtainnavbar/presentation/CurtainNavBarVO$ActionRight;", "Lru/ozon/app/android/commonwidgets/widgets/curtainnavbar/presentation/CurtainNavBarVO$BarAction;", "<init>", "()V", "icon", "", "getIcon", "()Ljava/lang/String;", "drawableIcon", "", "getDrawableIcon", "()Ljava/lang/Integer;", "text", "getText", "showTextAction", "", "getShowTextAction", "()Z", "showIconAction", "getShowIconAction", "showDrawableAction", "getShowDrawableAction", "TextAction", "IconAction", "DrawableAction", "Lru/ozon/app/android/commonwidgets/widgets/curtainnavbar/presentation/CurtainNavBarVO$ActionRight$DrawableAction;", "Lru/ozon/app/android/commonwidgets/widgets/curtainnavbar/presentation/CurtainNavBarVO$ActionRight$IconAction;", "Lru/ozon/app/android/commonwidgets/widgets/curtainnavbar/presentation/CurtainNavBarVO$ActionRight$TextAction;", "commonwidgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static abstract class ActionRight implements BarAction {

        @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u001f\b\u0086\b\u0018\u00002\u00020\u0001B\u0087\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0002\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\u000b\u001a\u00020\t\u0012\b\b\u0002\u0010\f\u001a\u00020\t\u0012\u0014\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u0013\u001a\n\u0018\u00010\u0011j\u0004\u0018\u0001`\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001b\u001a\u00020\t2\b\u0010\u001a\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u001b\u0010\u001cR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001d\u001a\u0004\b\u001e\u0010\u0017R\u001a\u0010\u0004\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001d\u001a\u0004\b\u001f\u0010\u0017R\u001a\u0010\u0006\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010 \u001a\u0004\b!\u0010\"R\u001a\u0010\u0007\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001d\u001a\u0004\b#\u0010\u0017R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\b\u0010\u001d\u001a\u0004\b$\u0010\u0017R\u001a\u0010\n\u001a\u00020\t8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\n\u0010%\u001a\u0004\b&\u0010'R\u001a\u0010\u000b\u001a\u00020\t8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000b\u0010%\u001a\u0004\b(\u0010'R\u001a\u0010\f\u001a\u00020\t8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\f\u0010%\u001a\u0004\b)\u0010'R(\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000f\u0010*\u001a\u0004\b+\u0010,R\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u001d\u001a\u0004\b-\u0010\u0017R\"\u0010\u0013\u001a\n\u0018\u00010\u0011j\u0004\u0018\u0001`\u00128\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0013\u0010.\u001a\u0004\b/\u00100¨\u00061"}, d2 = {"Lru/ozon/app/android/commonwidgets/widgets/curtainnavbar/presentation/CurtainNavBarVO$ActionRight$DrawableAction;", "Lru/ozon/app/android/commonwidgets/widgets/curtainnavbar/presentation/CurtainNavBarVO$ActionRight;", "", "actionId", "icon", "", "drawableIcon", "text", "deeplink", "", "showTextAction", "showIconAction", "showDrawableAction", "", "", "postParams", "parentDeeplink", "LWZ/t;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedEvent;", "tokenizedEvent", "<init>", "(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;ZZZLjava/util/Map;Ljava/lang/String;LWZ/t;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getActionId", "getIcon", "I", "getDrawableIcon", "()Ljava/lang/Integer;", "getText", "getDeeplink", "Z", "getShowTextAction", "()Z", "getShowIconAction", "getShowDrawableAction", "Ljava/util/Map;", "getPostParams", "()Ljava/util/Map;", "getParentDeeplink", "LWZ/t;", "getTokenizedEvent", "()LWZ/t;", "commonwidgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class DrawableAction extends ActionRight {

            @NotNull
            private final String actionId;
            private final String deeplink;
            private final int drawableIcon;

            @NotNull
            private final String icon;
            private final String parentDeeplink;
            private final Map<String, Object> postParams;
            private final boolean showDrawableAction;
            private final boolean showIconAction;
            private final boolean showTextAction;

            @NotNull
            private final String text;
            private final t tokenizedEvent;

            public /* synthetic */ DrawableAction(String str, String str2, int i11, String str3, String str4, boolean z11, boolean z12, boolean z13, Map map, String str5, t tVar, int i12, DefaultConstructorMarker defaultConstructorMarker) {
                this(str, (i12 & 2) != 0 ? "" : str2, i11, (i12 & 8) != 0 ? "" : str3, (i12 & 16) != 0 ? null : str4, (i12 & 32) != 0 ? false : z11, (i12 & 64) != 0 ? false : z12, (i12 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? true : z13, map, str5, tVar);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof DrawableAction)) {
                    return false;
                }
                DrawableAction drawableAction = (DrawableAction) other;
                return Intrinsics.d(this.actionId, drawableAction.actionId) && Intrinsics.d(this.icon, drawableAction.icon) && this.drawableIcon == drawableAction.drawableIcon && Intrinsics.d(this.text, drawableAction.text) && Intrinsics.d(this.deeplink, drawableAction.deeplink) && this.showTextAction == drawableAction.showTextAction && this.showIconAction == drawableAction.showIconAction && this.showDrawableAction == drawableAction.showDrawableAction && Intrinsics.d(this.postParams, drawableAction.postParams) && Intrinsics.d(this.parentDeeplink, drawableAction.parentDeeplink) && Intrinsics.d(this.tokenizedEvent, drawableAction.tokenizedEvent);
            }

            @Override // ru.ozon.app.android.commonwidgets.widgets.curtainnavbar.presentation.CurtainNavBarVO.BarAction
            @NotNull
            public String getActionId() {
                return this.actionId;
            }

            @Override // ru.ozon.app.android.commonwidgets.widgets.curtainnavbar.presentation.CurtainNavBarVO.BarAction
            public String getDeeplink() {
                return this.deeplink;
            }

            @Override // ru.ozon.app.android.commonwidgets.widgets.curtainnavbar.presentation.CurtainNavBarVO.ActionRight
            @NotNull
            public Integer getDrawableIcon() {
                return Integer.valueOf(this.drawableIcon);
            }

            @Override // ru.ozon.app.android.commonwidgets.widgets.curtainnavbar.presentation.CurtainNavBarVO.ActionRight
            @NotNull
            public String getIcon() {
                return this.icon;
            }

            @Override // ru.ozon.app.android.commonwidgets.widgets.curtainnavbar.presentation.CurtainNavBarVO.BarAction
            public String getParentDeeplink() {
                return this.parentDeeplink;
            }

            @Override // ru.ozon.app.android.commonwidgets.widgets.curtainnavbar.presentation.CurtainNavBarVO.BarAction
            public Map<String, Object> getPostParams() {
                return this.postParams;
            }

            @Override // ru.ozon.app.android.commonwidgets.widgets.curtainnavbar.presentation.CurtainNavBarVO.ActionRight
            public boolean getShowDrawableAction() {
                return this.showDrawableAction;
            }

            @Override // ru.ozon.app.android.commonwidgets.widgets.curtainnavbar.presentation.CurtainNavBarVO.ActionRight
            public boolean getShowIconAction() {
                return this.showIconAction;
            }

            @Override // ru.ozon.app.android.commonwidgets.widgets.curtainnavbar.presentation.CurtainNavBarVO.ActionRight
            public boolean getShowTextAction() {
                return this.showTextAction;
            }

            @Override // ru.ozon.app.android.commonwidgets.widgets.curtainnavbar.presentation.CurtainNavBarVO.ActionRight
            @NotNull
            public String getText() {
                return this.text;
            }

            @Override // ru.ozon.app.android.commonwidgets.widgets.curtainnavbar.presentation.CurtainNavBarVO.BarAction
            public t getTokenizedEvent() {
                return this.tokenizedEvent;
            }

            public int hashCode() {
                int a11 = g.a(C2454a.a(this.drawableIcon, g.a(this.actionId.hashCode() * 31, 31, this.icon), 31), 31, this.text);
                String str = this.deeplink;
                int a12 = C3532b.a(C3532b.a(C3532b.a((a11 + (str == null ? 0 : str.hashCode())) * 31, 31, this.showTextAction), 31, this.showIconAction), 31, this.showDrawableAction);
                Map<String, Object> map = this.postParams;
                int hashCode = (a12 + (map == null ? 0 : map.hashCode())) * 31;
                String str2 = this.parentDeeplink;
                int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
                t tVar = this.tokenizedEvent;
                return hashCode2 + (tVar != null ? tVar.hashCode() : 0);
            }

            @NotNull
            public String toString() {
                String str = this.actionId;
                String str2 = this.icon;
                int i11 = this.drawableIcon;
                String str3 = this.text;
                String str4 = this.deeplink;
                boolean z11 = this.showTextAction;
                boolean z12 = this.showIconAction;
                boolean z13 = this.showDrawableAction;
                Map<String, Object> map = this.postParams;
                String str5 = this.parentDeeplink;
                t tVar = this.tokenizedEvent;
                StringBuilder d11 = C3660k.d("DrawableAction(actionId=", str, ", icon=", str2, ", drawableIcon=");
                i.c(i11, ", text=", str3, ", deeplink=", d11);
                C2880a.c(str4, ", showTextAction=", ", showIconAction=", d11, z11);
                f.c(", showDrawableAction=", ", postParams=", d11, z12, z13);
                d11.append(map);
                d11.append(", parentDeeplink=");
                d11.append(str5);
                d11.append(", tokenizedEvent=");
                return b.d(d11, tVar, ")");
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public DrawableAction(@NotNull String actionId, @NotNull String icon, int i11, @NotNull String text, String str, boolean z11, boolean z12, boolean z13, Map<String, ? extends Object> map, String str2, t tVar) {
                super(null);
                Intrinsics.checkNotNullParameter(actionId, "actionId");
                Intrinsics.checkNotNullParameter(icon, "icon");
                Intrinsics.checkNotNullParameter(text, "text");
                this.actionId = actionId;
                this.icon = icon;
                this.drawableIcon = i11;
                this.text = text;
                this.deeplink = str;
                this.showTextAction = z11;
                this.showIconAction = z12;
                this.showDrawableAction = z13;
                this.postParams = map;
                this.parentDeeplink = str2;
                this.tokenizedEvent = tVar;
            }
        }

        public /* synthetic */ ActionRight(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public abstract Integer getDrawableIcon();

        @NotNull
        public abstract String getIcon();

        public abstract boolean getShowDrawableAction();

        public abstract boolean getShowIconAction();

        public abstract boolean getShowTextAction();

        @NotNull
        public abstract String getText();

        @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u001f\b\u0086\b\u0018\u00002\u00020\u0001B\u0085\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\u000b\u001a\u00020\t\u0012\b\b\u0002\u0010\f\u001a\u00020\t\u0012\u0014\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u0013\u001a\n\u0018\u00010\u0011j\u0004\u0018\u0001`\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001b\u001a\u00020\t2\b\u0010\u001a\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u001b\u0010\u001cR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001d\u001a\u0004\b\u001e\u0010\u0017R\u001a\u0010\u0004\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001d\u001a\u0004\b\u001f\u0010\u0017R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010 \u001a\u0004\b!\u0010\"R\u001a\u0010\u0007\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001d\u001a\u0004\b#\u0010\u0017R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\b\u0010\u001d\u001a\u0004\b$\u0010\u0017R\u001a\u0010\n\u001a\u00020\t8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\n\u0010%\u001a\u0004\b&\u0010'R\u001a\u0010\u000b\u001a\u00020\t8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000b\u0010%\u001a\u0004\b(\u0010'R\u001a\u0010\f\u001a\u00020\t8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\f\u0010%\u001a\u0004\b)\u0010'R(\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000f\u0010*\u001a\u0004\b+\u0010,R\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u001d\u001a\u0004\b-\u0010\u0017R\"\u0010\u0013\u001a\n\u0018\u00010\u0011j\u0004\u0018\u0001`\u00128\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0013\u0010.\u001a\u0004\b/\u00100¨\u00061"}, d2 = {"Lru/ozon/app/android/commonwidgets/widgets/curtainnavbar/presentation/CurtainNavBarVO$ActionRight$IconAction;", "Lru/ozon/app/android/commonwidgets/widgets/curtainnavbar/presentation/CurtainNavBarVO$ActionRight;", "", "actionId", "icon", "", "drawableIcon", "text", "deeplink", "", "showTextAction", "showIconAction", "showDrawableAction", "", "", "postParams", "parentDeeplink", "LWZ/t;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedEvent;", "tokenizedEvent", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;ZZZLjava/util/Map;Ljava/lang/String;LWZ/t;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getActionId", "getIcon", "Ljava/lang/Integer;", "getDrawableIcon", "()Ljava/lang/Integer;", "getText", "getDeeplink", "Z", "getShowTextAction", "()Z", "getShowIconAction", "getShowDrawableAction", "Ljava/util/Map;", "getPostParams", "()Ljava/util/Map;", "getParentDeeplink", "LWZ/t;", "getTokenizedEvent", "()LWZ/t;", "commonwidgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class IconAction extends ActionRight {

            @NotNull
            private final String actionId;
            private final String deeplink;
            private final Integer drawableIcon;

            @NotNull
            private final String icon;
            private final String parentDeeplink;
            private final Map<String, Object> postParams;
            private final boolean showDrawableAction;
            private final boolean showIconAction;
            private final boolean showTextAction;

            @NotNull
            private final String text;
            private final t tokenizedEvent;

            /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
                java.lang.NullPointerException
                */
            public /* synthetic */ IconAction(java.lang.String r15, java.lang.String r16, java.lang.Integer r17, java.lang.String r18, java.lang.String r19, boolean r20, boolean r21, boolean r22, java.util.Map r23, java.lang.String r24, WZ.t r25, int r26, kotlin.jvm.internal.DefaultConstructorMarker r27) {
                /*
                    r14 = this;
                    r0 = r26
                    r1 = r0 & 4
                    if (r1 == 0) goto L9
                    r1 = 0
                    r5 = r1
                    goto Lb
                L9:
                    r5 = r17
                Lb:
                    r1 = r0 & 8
                    if (r1 == 0) goto L13
                    java.lang.String r1 = ""
                    r6 = r1
                    goto L15
                L13:
                    r6 = r18
                L15:
                    r1 = r0 & 32
                    r2 = 0
                    if (r1 == 0) goto L1c
                    r8 = r2
                    goto L1e
                L1c:
                    r8 = r20
                L1e:
                    r1 = r0 & 64
                    if (r1 == 0) goto L25
                    r1 = 1
                    r9 = r1
                    goto L27
                L25:
                    r9 = r21
                L27:
                    r0 = r0 & 128(0x80, float:1.8E-43)
                    if (r0 == 0) goto L39
                    r10 = r2
                    r3 = r15
                    r4 = r16
                    r7 = r19
                    r11 = r23
                    r12 = r24
                    r13 = r25
                    r2 = r14
                    goto L47
                L39:
                    r10 = r22
                    r2 = r14
                    r3 = r15
                    r4 = r16
                    r7 = r19
                    r11 = r23
                    r12 = r24
                    r13 = r25
                L47:
                    r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: ru.ozon.app.android.commonwidgets.widgets.curtainnavbar.presentation.CurtainNavBarVO.ActionRight.IconAction.<init>(java.lang.String, java.lang.String, java.lang.Integer, java.lang.String, java.lang.String, boolean, boolean, boolean, java.util.Map, java.lang.String, WZ.t, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof IconAction)) {
                    return false;
                }
                IconAction iconAction = (IconAction) other;
                return Intrinsics.d(this.actionId, iconAction.actionId) && Intrinsics.d(this.icon, iconAction.icon) && Intrinsics.d(this.drawableIcon, iconAction.drawableIcon) && Intrinsics.d(this.text, iconAction.text) && Intrinsics.d(this.deeplink, iconAction.deeplink) && this.showTextAction == iconAction.showTextAction && this.showIconAction == iconAction.showIconAction && this.showDrawableAction == iconAction.showDrawableAction && Intrinsics.d(this.postParams, iconAction.postParams) && Intrinsics.d(this.parentDeeplink, iconAction.parentDeeplink) && Intrinsics.d(this.tokenizedEvent, iconAction.tokenizedEvent);
            }

            @Override // ru.ozon.app.android.commonwidgets.widgets.curtainnavbar.presentation.CurtainNavBarVO.BarAction
            @NotNull
            public String getActionId() {
                return this.actionId;
            }

            @Override // ru.ozon.app.android.commonwidgets.widgets.curtainnavbar.presentation.CurtainNavBarVO.BarAction
            public String getDeeplink() {
                return this.deeplink;
            }

            @Override // ru.ozon.app.android.commonwidgets.widgets.curtainnavbar.presentation.CurtainNavBarVO.ActionRight
            public Integer getDrawableIcon() {
                return this.drawableIcon;
            }

            @Override // ru.ozon.app.android.commonwidgets.widgets.curtainnavbar.presentation.CurtainNavBarVO.ActionRight
            @NotNull
            public String getIcon() {
                return this.icon;
            }

            @Override // ru.ozon.app.android.commonwidgets.widgets.curtainnavbar.presentation.CurtainNavBarVO.BarAction
            public String getParentDeeplink() {
                return this.parentDeeplink;
            }

            @Override // ru.ozon.app.android.commonwidgets.widgets.curtainnavbar.presentation.CurtainNavBarVO.BarAction
            public Map<String, Object> getPostParams() {
                return this.postParams;
            }

            @Override // ru.ozon.app.android.commonwidgets.widgets.curtainnavbar.presentation.CurtainNavBarVO.ActionRight
            public boolean getShowDrawableAction() {
                return this.showDrawableAction;
            }

            @Override // ru.ozon.app.android.commonwidgets.widgets.curtainnavbar.presentation.CurtainNavBarVO.ActionRight
            public boolean getShowIconAction() {
                return this.showIconAction;
            }

            @Override // ru.ozon.app.android.commonwidgets.widgets.curtainnavbar.presentation.CurtainNavBarVO.ActionRight
            public boolean getShowTextAction() {
                return this.showTextAction;
            }

            @Override // ru.ozon.app.android.commonwidgets.widgets.curtainnavbar.presentation.CurtainNavBarVO.ActionRight
            @NotNull
            public String getText() {
                return this.text;
            }

            @Override // ru.ozon.app.android.commonwidgets.widgets.curtainnavbar.presentation.CurtainNavBarVO.BarAction
            public t getTokenizedEvent() {
                return this.tokenizedEvent;
            }

            public int hashCode() {
                int a11 = g.a(this.actionId.hashCode() * 31, 31, this.icon);
                Integer num = this.drawableIcon;
                int a12 = g.a((a11 + (num == null ? 0 : num.hashCode())) * 31, 31, this.text);
                String str = this.deeplink;
                int a13 = C3532b.a(C3532b.a(C3532b.a((a12 + (str == null ? 0 : str.hashCode())) * 31, 31, this.showTextAction), 31, this.showIconAction), 31, this.showDrawableAction);
                Map<String, Object> map = this.postParams;
                int hashCode = (a13 + (map == null ? 0 : map.hashCode())) * 31;
                String str2 = this.parentDeeplink;
                int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
                t tVar = this.tokenizedEvent;
                return hashCode2 + (tVar != null ? tVar.hashCode() : 0);
            }

            @NotNull
            public String toString() {
                String str = this.actionId;
                String str2 = this.icon;
                Integer num = this.drawableIcon;
                String str3 = this.text;
                String str4 = this.deeplink;
                boolean z11 = this.showTextAction;
                boolean z12 = this.showIconAction;
                boolean z13 = this.showDrawableAction;
                Map<String, Object> map = this.postParams;
                String str5 = this.parentDeeplink;
                t tVar = this.tokenizedEvent;
                StringBuilder d11 = C3660k.d("IconAction(actionId=", str, ", icon=", str2, ", drawableIcon=");
                V.f(num, ", text=", str3, ", deeplink=", d11);
                C2880a.c(str4, ", showTextAction=", ", showIconAction=", d11, z11);
                f.c(", showDrawableAction=", ", postParams=", d11, z12, z13);
                d11.append(map);
                d11.append(", parentDeeplink=");
                d11.append(str5);
                d11.append(", tokenizedEvent=");
                return b.d(d11, tVar, ")");
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public IconAction(@NotNull String actionId, @NotNull String icon, Integer num, @NotNull String text, String str, boolean z11, boolean z12, boolean z13, Map<String, ? extends Object> map, String str2, t tVar) {
                super(null);
                Intrinsics.checkNotNullParameter(actionId, "actionId");
                Intrinsics.checkNotNullParameter(icon, "icon");
                Intrinsics.checkNotNullParameter(text, "text");
                this.actionId = actionId;
                this.icon = icon;
                this.drawableIcon = num;
                this.text = text;
                this.deeplink = str;
                this.showTextAction = z11;
                this.showIconAction = z12;
                this.showDrawableAction = z13;
                this.postParams = map;
                this.parentDeeplink = str2;
                this.tokenizedEvent = tVar;
            }
        }

        @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u001f\b\u0086\b\u0018\u00002\u00020\u0001B\u0085\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\u000b\u001a\u00020\t\u0012\b\b\u0002\u0010\f\u001a\u00020\t\u0012\u0014\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u0013\u001a\n\u0018\u00010\u0011j\u0004\u0018\u0001`\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001b\u001a\u00020\t2\b\u0010\u001a\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u001b\u0010\u001cR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001d\u001a\u0004\b\u001e\u0010\u0017R\u001a\u0010\u0004\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001d\u001a\u0004\b\u001f\u0010\u0017R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010 \u001a\u0004\b!\u0010\"R\u001a\u0010\u0007\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001d\u001a\u0004\b#\u0010\u0017R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\b\u0010\u001d\u001a\u0004\b$\u0010\u0017R\u001a\u0010\n\u001a\u00020\t8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\n\u0010%\u001a\u0004\b&\u0010'R\u001a\u0010\u000b\u001a\u00020\t8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000b\u0010%\u001a\u0004\b(\u0010'R\u001a\u0010\f\u001a\u00020\t8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\f\u0010%\u001a\u0004\b)\u0010'R(\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000f\u0010*\u001a\u0004\b+\u0010,R\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u001d\u001a\u0004\b-\u0010\u0017R\"\u0010\u0013\u001a\n\u0018\u00010\u0011j\u0004\u0018\u0001`\u00128\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0013\u0010.\u001a\u0004\b/\u00100¨\u00061"}, d2 = {"Lru/ozon/app/android/commonwidgets/widgets/curtainnavbar/presentation/CurtainNavBarVO$ActionRight$TextAction;", "Lru/ozon/app/android/commonwidgets/widgets/curtainnavbar/presentation/CurtainNavBarVO$ActionRight;", "", "actionId", "icon", "", "drawableIcon", "text", "deeplink", "", "showTextAction", "showIconAction", "showDrawableAction", "", "", "postParams", "parentDeeplink", "LWZ/t;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedEvent;", "tokenizedEvent", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;ZZZLjava/util/Map;Ljava/lang/String;LWZ/t;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getActionId", "getIcon", "Ljava/lang/Integer;", "getDrawableIcon", "()Ljava/lang/Integer;", "getText", "getDeeplink", "Z", "getShowTextAction", "()Z", "getShowIconAction", "getShowDrawableAction", "Ljava/util/Map;", "getPostParams", "()Ljava/util/Map;", "getParentDeeplink", "LWZ/t;", "getTokenizedEvent", "()LWZ/t;", "commonwidgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class TextAction extends ActionRight {

            @NotNull
            private final String actionId;
            private final String deeplink;
            private final Integer drawableIcon;

            @NotNull
            private final String icon;
            private final String parentDeeplink;
            private final Map<String, Object> postParams;
            private final boolean showDrawableAction;
            private final boolean showIconAction;
            private final boolean showTextAction;

            @NotNull
            private final String text;
            private final t tokenizedEvent;

            /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
                java.lang.NullPointerException
                */
            public /* synthetic */ TextAction(java.lang.String r15, java.lang.String r16, java.lang.Integer r17, java.lang.String r18, java.lang.String r19, boolean r20, boolean r21, boolean r22, java.util.Map r23, java.lang.String r24, WZ.t r25, int r26, kotlin.jvm.internal.DefaultConstructorMarker r27) {
                /*
                    r14 = this;
                    r0 = r26
                    r1 = r0 & 2
                    if (r1 == 0) goto La
                    java.lang.String r1 = ""
                    r4 = r1
                    goto Lc
                La:
                    r4 = r16
                Lc:
                    r1 = r0 & 4
                    if (r1 == 0) goto L13
                    r1 = 0
                    r5 = r1
                    goto L15
                L13:
                    r5 = r17
                L15:
                    r1 = r0 & 32
                    if (r1 == 0) goto L1c
                    r1 = 1
                    r8 = r1
                    goto L1e
                L1c:
                    r8 = r20
                L1e:
                    r1 = r0 & 64
                    r2 = 0
                    if (r1 == 0) goto L25
                    r9 = r2
                    goto L27
                L25:
                    r9 = r21
                L27:
                    r0 = r0 & 128(0x80, float:1.8E-43)
                    if (r0 == 0) goto L39
                    r10 = r2
                    r3 = r15
                    r6 = r18
                    r7 = r19
                    r11 = r23
                    r12 = r24
                    r13 = r25
                    r2 = r14
                    goto L47
                L39:
                    r10 = r22
                    r2 = r14
                    r3 = r15
                    r6 = r18
                    r7 = r19
                    r11 = r23
                    r12 = r24
                    r13 = r25
                L47:
                    r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: ru.ozon.app.android.commonwidgets.widgets.curtainnavbar.presentation.CurtainNavBarVO.ActionRight.TextAction.<init>(java.lang.String, java.lang.String, java.lang.Integer, java.lang.String, java.lang.String, boolean, boolean, boolean, java.util.Map, java.lang.String, WZ.t, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof TextAction)) {
                    return false;
                }
                TextAction textAction = (TextAction) other;
                return Intrinsics.d(this.actionId, textAction.actionId) && Intrinsics.d(this.icon, textAction.icon) && Intrinsics.d(this.drawableIcon, textAction.drawableIcon) && Intrinsics.d(this.text, textAction.text) && Intrinsics.d(this.deeplink, textAction.deeplink) && this.showTextAction == textAction.showTextAction && this.showIconAction == textAction.showIconAction && this.showDrawableAction == textAction.showDrawableAction && Intrinsics.d(this.postParams, textAction.postParams) && Intrinsics.d(this.parentDeeplink, textAction.parentDeeplink) && Intrinsics.d(this.tokenizedEvent, textAction.tokenizedEvent);
            }

            @Override // ru.ozon.app.android.commonwidgets.widgets.curtainnavbar.presentation.CurtainNavBarVO.BarAction
            @NotNull
            public String getActionId() {
                return this.actionId;
            }

            @Override // ru.ozon.app.android.commonwidgets.widgets.curtainnavbar.presentation.CurtainNavBarVO.BarAction
            public String getDeeplink() {
                return this.deeplink;
            }

            @Override // ru.ozon.app.android.commonwidgets.widgets.curtainnavbar.presentation.CurtainNavBarVO.ActionRight
            public Integer getDrawableIcon() {
                return this.drawableIcon;
            }

            @Override // ru.ozon.app.android.commonwidgets.widgets.curtainnavbar.presentation.CurtainNavBarVO.ActionRight
            @NotNull
            public String getIcon() {
                return this.icon;
            }

            @Override // ru.ozon.app.android.commonwidgets.widgets.curtainnavbar.presentation.CurtainNavBarVO.BarAction
            public String getParentDeeplink() {
                return this.parentDeeplink;
            }

            @Override // ru.ozon.app.android.commonwidgets.widgets.curtainnavbar.presentation.CurtainNavBarVO.BarAction
            public Map<String, Object> getPostParams() {
                return this.postParams;
            }

            @Override // ru.ozon.app.android.commonwidgets.widgets.curtainnavbar.presentation.CurtainNavBarVO.ActionRight
            public boolean getShowDrawableAction() {
                return this.showDrawableAction;
            }

            @Override // ru.ozon.app.android.commonwidgets.widgets.curtainnavbar.presentation.CurtainNavBarVO.ActionRight
            public boolean getShowIconAction() {
                return this.showIconAction;
            }

            @Override // ru.ozon.app.android.commonwidgets.widgets.curtainnavbar.presentation.CurtainNavBarVO.ActionRight
            public boolean getShowTextAction() {
                return this.showTextAction;
            }

            @Override // ru.ozon.app.android.commonwidgets.widgets.curtainnavbar.presentation.CurtainNavBarVO.ActionRight
            @NotNull
            public String getText() {
                return this.text;
            }

            @Override // ru.ozon.app.android.commonwidgets.widgets.curtainnavbar.presentation.CurtainNavBarVO.BarAction
            public t getTokenizedEvent() {
                return this.tokenizedEvent;
            }

            public int hashCode() {
                int a11 = g.a(this.actionId.hashCode() * 31, 31, this.icon);
                Integer num = this.drawableIcon;
                int a12 = g.a((a11 + (num == null ? 0 : num.hashCode())) * 31, 31, this.text);
                String str = this.deeplink;
                int a13 = C3532b.a(C3532b.a(C3532b.a((a12 + (str == null ? 0 : str.hashCode())) * 31, 31, this.showTextAction), 31, this.showIconAction), 31, this.showDrawableAction);
                Map<String, Object> map = this.postParams;
                int hashCode = (a13 + (map == null ? 0 : map.hashCode())) * 31;
                String str2 = this.parentDeeplink;
                int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
                t tVar = this.tokenizedEvent;
                return hashCode2 + (tVar != null ? tVar.hashCode() : 0);
            }

            @NotNull
            public String toString() {
                String str = this.actionId;
                String str2 = this.icon;
                Integer num = this.drawableIcon;
                String str3 = this.text;
                String str4 = this.deeplink;
                boolean z11 = this.showTextAction;
                boolean z12 = this.showIconAction;
                boolean z13 = this.showDrawableAction;
                Map<String, Object> map = this.postParams;
                String str5 = this.parentDeeplink;
                t tVar = this.tokenizedEvent;
                StringBuilder d11 = C3660k.d("TextAction(actionId=", str, ", icon=", str2, ", drawableIcon=");
                V.f(num, ", text=", str3, ", deeplink=", d11);
                C2880a.c(str4, ", showTextAction=", ", showIconAction=", d11, z11);
                f.c(", showDrawableAction=", ", postParams=", d11, z12, z13);
                d11.append(map);
                d11.append(", parentDeeplink=");
                d11.append(str5);
                d11.append(", tokenizedEvent=");
                return b.d(d11, tVar, ")");
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public TextAction(@NotNull String actionId, @NotNull String icon, Integer num, @NotNull String text, String str, boolean z11, boolean z12, boolean z13, Map<String, ? extends Object> map, String str2, t tVar) {
                super(null);
                Intrinsics.checkNotNullParameter(actionId, "actionId");
                Intrinsics.checkNotNullParameter(icon, "icon");
                Intrinsics.checkNotNullParameter(text, "text");
                this.actionId = actionId;
                this.icon = icon;
                this.drawableIcon = num;
                this.text = text;
                this.deeplink = str;
                this.showTextAction = z11;
                this.showIconAction = z12;
                this.showDrawableAction = z13;
                this.postParams = map;
                this.parentDeeplink = str2;
                this.tokenizedEvent = tVar;
            }
        }

        private ActionRight() {
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010$\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001R\u0014\u0010\u0005\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0004R\"\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0001\u0018\u00010\b8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u0016\u0010\r\u001a\u0004\u0018\u00010\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\u0004R\u001c\u0010\u0012\u001a\n\u0018\u00010\u000ej\u0004\u0018\u0001`\u000f8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0013"}, d2 = {"Lru/ozon/app/android/commonwidgets/widgets/curtainnavbar/presentation/CurtainNavBarVO$BarAction;", "", "", "getActionId", "()Ljava/lang/String;", "actionId", "getDeeplink", "deeplink", "", "getPostParams", "()Ljava/util/Map;", "postParams", "getParentDeeplink", "parentDeeplink", "LWZ/t;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedEvent;", "getTokenizedEvent", "()LWZ/t;", "tokenizedEvent", "commonwidgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public interface BarAction {
        @NotNull
        String getActionId();

        String getDeeplink();

        String getParentDeeplink();

        Map<String, Object> getPostParams();

        t getTokenizedEvent();
    }

    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u001e\u001fB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003R\u0012\u0010\u0004\u001a\u00020\u0005X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u0004\u0018\u00010\tX¦\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u0004\u0018\u00010\rX¦\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u0012\u0010\u0010\u001a\u00020\u0011X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0014\u001a\u0004\u0018\u00010\u0011X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0013R\u0012\u0010\u0016\u001a\u00020\u0017X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001a\u001a\u0004\u0018\u00010\u0011X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u0013R\u0014\u0010\u001c\u001a\u0004\u0018\u00010\u0011X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u0013\u0082\u0001\u0002 !¨\u0006\""}, d2 = {"Lru/ozon/app/android/commonwidgets/widgets/curtainnavbar/presentation/CurtainNavBarVO$CurtainBar;", "", "<init>", "()V", "titleTextAppearance", "", "getTitleTextAppearance", "()I", "actionLeft", "Lru/ozon/app/android/commonwidgets/widgets/curtainnavbar/presentation/CurtainNavBarVO$ActionLeft;", "getActionLeft", "()Lru/ozon/app/android/commonwidgets/widgets/curtainnavbar/presentation/CurtainNavBarVO$ActionLeft;", "actionRight", "Lru/ozon/app/android/commonwidgets/widgets/curtainnavbar/presentation/CurtainNavBarVO$ActionRight;", "getActionRight", "()Lru/ozon/app/android/commonwidgets/widgets/curtainnavbar/presentation/CurtainNavBarVO$ActionRight;", SelectionItemFormDTO.TITLE_FIELD_NAME, "", "getTitle", "()Ljava/lang/String;", "titleColor", "getTitleColor", "showSubTitle", "", "getShowSubTitle", "()Z", "subtitle", "getSubtitle", "subtitleColor", "getSubtitleColor", "Large", "Small", "Lru/ozon/app/android/commonwidgets/widgets/curtainnavbar/presentation/CurtainNavBarVO$CurtainBar$Large;", "Lru/ozon/app/android/commonwidgets/widgets/curtainnavbar/presentation/CurtainNavBarVO$CurtainBar$Small;", "commonwidgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static abstract class CurtainBar {
        public /* synthetic */ CurtainBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public abstract ActionLeft getActionLeft();

        public abstract ActionRight getActionRight();

        public abstract boolean getShowSubTitle();

        public abstract String getSubtitle();

        public abstract String getSubtitleColor();

        @NotNull
        public abstract String getTitle();

        public abstract String getTitleColor();

        public abstract int getTitleTextAppearance();

        @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\u0000\n\u0002\b\u0014\b\u0086\b\u0018\u00002\u00020\u0001BY\u0012\b\b\u0003\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0017\u001a\u00020\u000b2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0019\u001a\u0004\b\u001a\u0010\u0014R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001b\u001a\u0004\b\u001c\u0010\u0012R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001b\u001a\u0004\b\u001d\u0010\u0012R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\b\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u001c\u0010\n\u001a\u0004\u0018\u00010\t8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\n\u0010!\u001a\u0004\b\"\u0010#R\u001a\u0010\f\u001a\u00020\u000b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\f\u0010$\u001a\u0004\b%\u0010&R\u001c\u0010\r\u001a\u0004\u0018\u00010\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\r\u0010\u001b\u001a\u0004\b'\u0010\u0012R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u001b\u001a\u0004\b(\u0010\u0012¨\u0006)"}, d2 = {"Lru/ozon/app/android/commonwidgets/widgets/curtainnavbar/presentation/CurtainNavBarVO$CurtainBar$Large;", "Lru/ozon/app/android/commonwidgets/widgets/curtainnavbar/presentation/CurtainNavBarVO$CurtainBar;", "", "titleTextAppearance", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "titleColor", "Lru/ozon/app/android/commonwidgets/widgets/curtainnavbar/presentation/CurtainNavBarVO$ActionLeft;", "actionLeft", "Lru/ozon/app/android/commonwidgets/widgets/curtainnavbar/presentation/CurtainNavBarVO$ActionRight;", "actionRight", "", "showSubTitle", "subtitle", "subtitleColor", "<init>", "(ILjava/lang/String;Ljava/lang/String;Lru/ozon/app/android/commonwidgets/widgets/curtainnavbar/presentation/CurtainNavBarVO$ActionLeft;Lru/ozon/app/android/commonwidgets/widgets/curtainnavbar/presentation/CurtainNavBarVO$ActionRight;ZLjava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "I", "getTitleTextAppearance", "Ljava/lang/String;", "getTitle", "getTitleColor", "Lru/ozon/app/android/commonwidgets/widgets/curtainnavbar/presentation/CurtainNavBarVO$ActionLeft;", "getActionLeft", "()Lru/ozon/app/android/commonwidgets/widgets/curtainnavbar/presentation/CurtainNavBarVO$ActionLeft;", "Lru/ozon/app/android/commonwidgets/widgets/curtainnavbar/presentation/CurtainNavBarVO$ActionRight;", "getActionRight", "()Lru/ozon/app/android/commonwidgets/widgets/curtainnavbar/presentation/CurtainNavBarVO$ActionRight;", "Z", "getShowSubTitle", "()Z", "getSubtitle", "getSubtitleColor", "commonwidgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class Large extends CurtainBar {
            private final ActionLeft actionLeft;
            private final ActionRight actionRight;
            private final boolean showSubTitle;
            private final String subtitle;
            private final String subtitleColor;

            @NotNull
            private final String title;
            private final String titleColor;
            private final int titleTextAppearance;

            /* JADX WARN: Illegal instructions before constructor call */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public /* synthetic */ Large(int i11, String str, String str2, ActionLeft actionLeft, ActionRight actionRight, boolean z11, String str3, String str4, int i12, DefaultConstructorMarker defaultConstructorMarker) {
                this(r4, str, r6, r7, r8, r9, r10, r11);
                String str5;
                String str6;
                ActionRight actionRight2;
                boolean z12;
                String str7;
                ActionLeft actionLeft2;
                int i13;
                i11 = (i12 & 1) != 0 ? R$style.TextStyle_Head_M : i11;
                actionLeft = (i12 & 8) != 0 ? null : actionLeft;
                z11 = (i12 & 32) != 0 ? false : z11;
                if ((i12 & 64) != 0) {
                    str5 = null;
                    actionRight2 = actionRight;
                    str6 = str4;
                    str7 = str2;
                    z12 = z11;
                    i13 = i11;
                    actionLeft2 = actionLeft;
                } else {
                    str5 = str3;
                    str6 = str4;
                    actionRight2 = actionRight;
                    z12 = z11;
                    str7 = str2;
                    actionLeft2 = actionLeft;
                    i13 = i11;
                }
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Large)) {
                    return false;
                }
                Large large = (Large) other;
                return this.titleTextAppearance == large.titleTextAppearance && Intrinsics.d(this.title, large.title) && Intrinsics.d(this.titleColor, large.titleColor) && Intrinsics.d(this.actionLeft, large.actionLeft) && Intrinsics.d(this.actionRight, large.actionRight) && this.showSubTitle == large.showSubTitle && Intrinsics.d(this.subtitle, large.subtitle) && Intrinsics.d(this.subtitleColor, large.subtitleColor);
            }

            @Override // ru.ozon.app.android.commonwidgets.widgets.curtainnavbar.presentation.CurtainNavBarVO.CurtainBar
            public ActionLeft getActionLeft() {
                return this.actionLeft;
            }

            @Override // ru.ozon.app.android.commonwidgets.widgets.curtainnavbar.presentation.CurtainNavBarVO.CurtainBar
            public ActionRight getActionRight() {
                return this.actionRight;
            }

            @Override // ru.ozon.app.android.commonwidgets.widgets.curtainnavbar.presentation.CurtainNavBarVO.CurtainBar
            public boolean getShowSubTitle() {
                return this.showSubTitle;
            }

            @Override // ru.ozon.app.android.commonwidgets.widgets.curtainnavbar.presentation.CurtainNavBarVO.CurtainBar
            public String getSubtitle() {
                return this.subtitle;
            }

            @Override // ru.ozon.app.android.commonwidgets.widgets.curtainnavbar.presentation.CurtainNavBarVO.CurtainBar
            public String getSubtitleColor() {
                return this.subtitleColor;
            }

            @Override // ru.ozon.app.android.commonwidgets.widgets.curtainnavbar.presentation.CurtainNavBarVO.CurtainBar
            @NotNull
            public String getTitle() {
                return this.title;
            }

            @Override // ru.ozon.app.android.commonwidgets.widgets.curtainnavbar.presentation.CurtainNavBarVO.CurtainBar
            public String getTitleColor() {
                return this.titleColor;
            }

            @Override // ru.ozon.app.android.commonwidgets.widgets.curtainnavbar.presentation.CurtainNavBarVO.CurtainBar
            public int getTitleTextAppearance() {
                return this.titleTextAppearance;
            }

            public int hashCode() {
                int a11 = g.a(Integer.hashCode(this.titleTextAppearance) * 31, 31, this.title);
                String str = this.titleColor;
                int hashCode = (a11 + (str == null ? 0 : str.hashCode())) * 31;
                ActionLeft actionLeft = this.actionLeft;
                int hashCode2 = (hashCode + (actionLeft == null ? 0 : actionLeft.hashCode())) * 31;
                ActionRight actionRight = this.actionRight;
                int a12 = C3532b.a((hashCode2 + (actionRight == null ? 0 : actionRight.hashCode())) * 31, 31, this.showSubTitle);
                String str2 = this.subtitle;
                int hashCode3 = (a12 + (str2 == null ? 0 : str2.hashCode())) * 31;
                String str3 = this.subtitleColor;
                return hashCode3 + (str3 != null ? str3.hashCode() : 0);
            }

            @NotNull
            public String toString() {
                int i11 = this.titleTextAppearance;
                String str = this.title;
                String str2 = this.titleColor;
                ActionLeft actionLeft = this.actionLeft;
                ActionRight actionRight = this.actionRight;
                boolean z11 = this.showSubTitle;
                String str3 = this.subtitle;
                String str4 = this.subtitleColor;
                StringBuilder g10 = e.g(i11, "Large(titleTextAppearance=", ", title=", str, ", titleColor=");
                g10.append(str2);
                g10.append(", actionLeft=");
                g10.append(actionLeft);
                g10.append(", actionRight=");
                g10.append(actionRight);
                g10.append(", showSubTitle=");
                g10.append(z11);
                g10.append(", subtitle=");
                return C3173b.c(g10, str3, ", subtitleColor=", str4, ")");
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Large(int i11, @NotNull String title, String str, ActionLeft actionLeft, ActionRight actionRight, boolean z11, String str2, String str3) {
                super(null);
                Intrinsics.checkNotNullParameter(title, "title");
                this.titleTextAppearance = i11;
                this.title = title;
                this.titleColor = str;
                this.actionLeft = actionLeft;
                this.actionRight = actionRight;
                this.showSubTitle = z11;
                this.subtitle = str2;
                this.subtitleColor = str3;
            }
        }

        @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0000\n\u0002\b\u0018\b\u0086\b\u0018\u00002\u00020\u0001Bg\u0012\b\b\u0003\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\t\u001a\u00020\u0006\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001a\u001a\u00020\u00042\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001c\u001a\u0004\b\u001d\u0010\u0017R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0007\u0010!\u001a\u0004\b\"\u0010\u0015R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\b\u0010!\u001a\u0004\b#\u0010\u0015R\u001a\u0010\t\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\t\u0010!\u001a\u0004\b$\u0010\u0015R\u001c\u0010\n\u001a\u0004\u0018\u00010\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\n\u0010!\u001a\u0004\b%\u0010\u0015R\u001c\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\f\u0010&\u001a\u0004\b'\u0010(R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000e\u0010)\u001a\u0004\b*\u0010+R\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u0010,\u001a\u0004\b-\u0010.R\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u000f8\u0006¢\u0006\f\n\u0004\b\u0011\u0010,\u001a\u0004\b/\u0010.¨\u00060"}, d2 = {"Lru/ozon/app/android/commonwidgets/widgets/curtainnavbar/presentation/CurtainNavBarVO$CurtainBar$Small;", "Lru/ozon/app/android/commonwidgets/widgets/curtainnavbar/presentation/CurtainNavBarVO$CurtainBar;", "", "titleTextAppearance", "", "showSubTitle", "", "subtitle", "subtitleColor", SelectionItemFormDTO.TITLE_FIELD_NAME, "titleColor", "Lru/ozon/app/android/commonwidgets/widgets/curtainnavbar/presentation/CurtainNavBarVO$ActionLeft;", "actionLeft", "Lru/ozon/app/android/commonwidgets/widgets/curtainnavbar/presentation/CurtainNavBarVO$ActionRight;", "actionRight", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallBorderlessButtonWithIcon;", "leftButton", "rightButton", "<init>", "(IZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lru/ozon/app/android/commonwidgets/widgets/curtainnavbar/presentation/CurtainNavBarVO$ActionLeft;Lru/ozon/app/android/commonwidgets/widgets/curtainnavbar/presentation/CurtainNavBarVO$ActionRight;Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallBorderlessButtonWithIcon;Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallBorderlessButtonWithIcon;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "I", "getTitleTextAppearance", "Z", "getShowSubTitle", "()Z", "Ljava/lang/String;", "getSubtitle", "getSubtitleColor", "getTitle", "getTitleColor", "Lru/ozon/app/android/commonwidgets/widgets/curtainnavbar/presentation/CurtainNavBarVO$ActionLeft;", "getActionLeft", "()Lru/ozon/app/android/commonwidgets/widgets/curtainnavbar/presentation/CurtainNavBarVO$ActionLeft;", "Lru/ozon/app/android/commonwidgets/widgets/curtainnavbar/presentation/CurtainNavBarVO$ActionRight;", "getActionRight", "()Lru/ozon/app/android/commonwidgets/widgets/curtainnavbar/presentation/CurtainNavBarVO$ActionRight;", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallBorderlessButtonWithIcon;", "getLeftButton", "()Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallBorderlessButtonWithIcon;", "getRightButton", "commonwidgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class Small extends CurtainBar {
            private final ActionLeft actionLeft;
            private final ActionRight actionRight;
            private final ButtonV3Atom.SmallBorderlessButtonWithIcon leftButton;
            private final ButtonV3Atom.SmallBorderlessButtonWithIcon rightButton;
            private final boolean showSubTitle;
            private final String subtitle;
            private final String subtitleColor;

            @NotNull
            private final String title;
            private final String titleColor;
            private final int titleTextAppearance;

            public /* synthetic */ Small(int i11, boolean z11, String str, String str2, String str3, String str4, ActionLeft actionLeft, ActionRight actionRight, ButtonV3Atom.SmallBorderlessButtonWithIcon smallBorderlessButtonWithIcon, ButtonV3Atom.SmallBorderlessButtonWithIcon smallBorderlessButtonWithIcon2, int i12, DefaultConstructorMarker defaultConstructorMarker) {
                this((i12 & 1) != 0 ? R$style.TextStyle_Body_L_Bold : i11, z11, str, str2, str3, str4, actionLeft, actionRight, smallBorderlessButtonWithIcon, smallBorderlessButtonWithIcon2);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Small)) {
                    return false;
                }
                Small small = (Small) other;
                return this.titleTextAppearance == small.titleTextAppearance && this.showSubTitle == small.showSubTitle && Intrinsics.d(this.subtitle, small.subtitle) && Intrinsics.d(this.subtitleColor, small.subtitleColor) && Intrinsics.d(this.title, small.title) && Intrinsics.d(this.titleColor, small.titleColor) && Intrinsics.d(this.actionLeft, small.actionLeft) && Intrinsics.d(this.actionRight, small.actionRight) && Intrinsics.d(this.leftButton, small.leftButton) && Intrinsics.d(this.rightButton, small.rightButton);
            }

            @Override // ru.ozon.app.android.commonwidgets.widgets.curtainnavbar.presentation.CurtainNavBarVO.CurtainBar
            public ActionLeft getActionLeft() {
                return this.actionLeft;
            }

            @Override // ru.ozon.app.android.commonwidgets.widgets.curtainnavbar.presentation.CurtainNavBarVO.CurtainBar
            public ActionRight getActionRight() {
                return this.actionRight;
            }

            public final ButtonV3Atom.SmallBorderlessButtonWithIcon getLeftButton() {
                return this.leftButton;
            }

            public final ButtonV3Atom.SmallBorderlessButtonWithIcon getRightButton() {
                return this.rightButton;
            }

            @Override // ru.ozon.app.android.commonwidgets.widgets.curtainnavbar.presentation.CurtainNavBarVO.CurtainBar
            public boolean getShowSubTitle() {
                return this.showSubTitle;
            }

            @Override // ru.ozon.app.android.commonwidgets.widgets.curtainnavbar.presentation.CurtainNavBarVO.CurtainBar
            public String getSubtitle() {
                return this.subtitle;
            }

            @Override // ru.ozon.app.android.commonwidgets.widgets.curtainnavbar.presentation.CurtainNavBarVO.CurtainBar
            public String getSubtitleColor() {
                return this.subtitleColor;
            }

            @Override // ru.ozon.app.android.commonwidgets.widgets.curtainnavbar.presentation.CurtainNavBarVO.CurtainBar
            @NotNull
            public String getTitle() {
                return this.title;
            }

            @Override // ru.ozon.app.android.commonwidgets.widgets.curtainnavbar.presentation.CurtainNavBarVO.CurtainBar
            public String getTitleColor() {
                return this.titleColor;
            }

            @Override // ru.ozon.app.android.commonwidgets.widgets.curtainnavbar.presentation.CurtainNavBarVO.CurtainBar
            public int getTitleTextAppearance() {
                return this.titleTextAppearance;
            }

            public int hashCode() {
                int a11 = C3532b.a(Integer.hashCode(this.titleTextAppearance) * 31, 31, this.showSubTitle);
                String str = this.subtitle;
                int hashCode = (a11 + (str == null ? 0 : str.hashCode())) * 31;
                String str2 = this.subtitleColor;
                int a12 = g.a((hashCode + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.title);
                String str3 = this.titleColor;
                int hashCode2 = (a12 + (str3 == null ? 0 : str3.hashCode())) * 31;
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
                int i11 = this.titleTextAppearance;
                boolean z11 = this.showSubTitle;
                String str = this.subtitle;
                String str2 = this.subtitleColor;
                String str3 = this.title;
                String str4 = this.titleColor;
                ActionLeft actionLeft = this.actionLeft;
                ActionRight actionRight = this.actionRight;
                ButtonV3Atom.SmallBorderlessButtonWithIcon smallBorderlessButtonWithIcon = this.leftButton;
                ButtonV3Atom.SmallBorderlessButtonWithIcon smallBorderlessButtonWithIcon2 = this.rightButton;
                StringBuilder sb2 = new StringBuilder("Small(titleTextAppearance=");
                sb2.append(i11);
                sb2.append(", showSubTitle=");
                sb2.append(z11);
                sb2.append(", subtitle=");
                a.h(sb2, str, ", subtitleColor=", str2, ", title=");
                a.h(sb2, str3, ", titleColor=", str4, ", actionLeft=");
                sb2.append(actionLeft);
                sb2.append(", actionRight=");
                sb2.append(actionRight);
                sb2.append(", leftButton=");
                sb2.append(smallBorderlessButtonWithIcon);
                sb2.append(", rightButton=");
                sb2.append(smallBorderlessButtonWithIcon2);
                sb2.append(")");
                return sb2.toString();
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Small(int i11, boolean z11, String str, String str2, @NotNull String title, String str3, ActionLeft actionLeft, ActionRight actionRight, ButtonV3Atom.SmallBorderlessButtonWithIcon smallBorderlessButtonWithIcon, ButtonV3Atom.SmallBorderlessButtonWithIcon smallBorderlessButtonWithIcon2) {
                super(null);
                Intrinsics.checkNotNullParameter(title, "title");
                this.titleTextAppearance = i11;
                this.showSubTitle = z11;
                this.subtitle = str;
                this.subtitleColor = str2;
                this.title = title;
                this.titleColor = str3;
                this.actionLeft = actionLeft;
                this.actionRight = actionRight;
                this.leftButton = smallBorderlessButtonWithIcon;
                this.rightButton = smallBorderlessButtonWithIcon2;
            }
        }

        private CurtainBar() {
        }
    }

    public CurtainNavBarVO(long j11, @NotNull CurtainBar curtainBar) {
        Intrinsics.checkNotNullParameter(curtainBar, "curtainBar");
        this.id = j11;
        this.curtainBar = curtainBar;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CurtainNavBarVO)) {
            return false;
        }
        CurtainNavBarVO curtainNavBarVO = (CurtainNavBarVO) other;
        return this.id == curtainNavBarVO.id && Intrinsics.d(this.curtainBar, curtainNavBarVO.curtainBar);
    }

    @NotNull
    public final CurtainBar getCurtainBar() {
        return this.curtainBar;
    }

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    @Override // l20.c
    public Integer getScrollWidgetKey() {
        return null;
    }

    @Override // l20.c
    public int getViewItemKey() {
        return hashCode();
    }

    public int hashCode() {
        return this.curtainBar.hashCode() + (Long.hashCode(this.id) * 31);
    }

    @NotNull
    public String toString() {
        return "CurtainNavBarVO(id=" + this.id + ", curtainBar=" + this.curtainBar + ")";
    }
}
