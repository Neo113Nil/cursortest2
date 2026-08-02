package ru.ozon.app.android.cscore.orderdetails.molecule.codeCompose;

import Tl.b;
import WZ.t;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.cscore.padding.PaddingCompose;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.TestInfo;
import ru.ozon.uni.atoms.data.common.CornerRadius;
import ru.ozon.uni.atoms.data.icon.IconDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0014\b\u0087\b\u0018\u00002\u00020\u0001:\u0001*B?\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\n\u001a\u00020\u0006\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010 \u001a\u0004\b!\u0010\"R\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\t\u0010#\u001a\u0004\b$\u0010%R\u0017\u0010\n\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\n\u0010 \u001a\u0004\b&\u0010\"R\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010'\u001a\u0004\b(\u0010)¨\u0006+"}, d2 = {"Lru/ozon/app/android/cscore/orderdetails/molecule/codeCompose/CodeComposeVI;", "Ll20/c;", "", "id", "Lru/ozon/app/android/cscore/orderdetails/molecule/codeCompose/CodeComposeVI$IslandSettings;", "settings", "Lru/ozon/uni/atoms/data/text/TextDTO;", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/uni/atoms/data/icon/IconDTO;", "titleIcon", "subtitle", "Lru/ozon/uni/atoms/data/TestInfo;", "testInfo", "<init>", "(JLru/ozon/app/android/cscore/orderdetails/molecule/codeCompose/CodeComposeVI$IslandSettings;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/icon/IconDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/TestInfo;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Lru/ozon/app/android/cscore/orderdetails/molecule/codeCompose/CodeComposeVI$IslandSettings;", "getSettings", "()Lru/ozon/app/android/cscore/orderdetails/molecule/codeCompose/CodeComposeVI$IslandSettings;", "Lru/ozon/uni/atoms/data/text/TextDTO;", "getTitle", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "Lru/ozon/uni/atoms/data/icon/IconDTO;", "getTitleIcon", "()Lru/ozon/uni/atoms/data/icon/IconDTO;", "getSubtitle", "Lru/ozon/uni/atoms/data/TestInfo;", "getTestInfo", "()Lru/ozon/uni/atoms/data/TestInfo;", "IslandSettings", "csma_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class CodeComposeVI implements c {
    private final long id;

    @NotNull
    private final IslandSettings settings;

    @NotNull
    private final TextDTO subtitle;
    private final TestInfo testInfo;

    @NotNull
    private final TextDTO title;
    private final IconDTO titleIcon;

    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0011\b\u0087\b\u0018\u00002\u00020\u0001B;\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\u000fR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\u001f\u001a\u0004\b \u0010!R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\"\u001a\u0004\b#\u0010$¨\u0006%"}, d2 = {"Lru/ozon/app/android/cscore/orderdetails/molecule/codeCompose/CodeComposeVI$IslandSettings;", "", "", "islandColor", "Lru/ozon/uni/atoms/data/common/CornerRadius;", "islandCornerRadius", "Lru/ozon/app/android/cscore/padding/PaddingCompose;", "padding", "LWZ/t;", "tokenizedEvent", "Lru/ozon/uni/atoms/af/AtomAction;", "action", "<init>", "(Ljava/lang/String;Lru/ozon/uni/atoms/data/common/CornerRadius;Lru/ozon/app/android/cscore/padding/PaddingCompose;LWZ/t;Lru/ozon/uni/atoms/af/AtomAction;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getIslandColor", "Lru/ozon/uni/atoms/data/common/CornerRadius;", "getIslandCornerRadius", "()Lru/ozon/uni/atoms/data/common/CornerRadius;", "Lru/ozon/app/android/cscore/padding/PaddingCompose;", "getPadding", "()Lru/ozon/app/android/cscore/padding/PaddingCompose;", "LWZ/t;", "getTokenizedEvent", "()LWZ/t;", "Lru/ozon/uni/atoms/af/AtomAction;", "getAction", "()Lru/ozon/uni/atoms/af/AtomAction;", "csma_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class IslandSettings {
        private final AtomAction action;
        private final String islandColor;

        @NotNull
        private final CornerRadius islandCornerRadius;

        @NotNull
        private final PaddingCompose padding;
        private final t tokenizedEvent;

        public IslandSettings(String str, @NotNull CornerRadius islandCornerRadius, @NotNull PaddingCompose padding, t tVar, AtomAction atomAction) {
            Intrinsics.checkNotNullParameter(islandCornerRadius, "islandCornerRadius");
            Intrinsics.checkNotNullParameter(padding, "padding");
            this.islandColor = str;
            this.islandCornerRadius = islandCornerRadius;
            this.padding = padding;
            this.tokenizedEvent = tVar;
            this.action = atomAction;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof IslandSettings)) {
                return false;
            }
            IslandSettings islandSettings = (IslandSettings) other;
            return Intrinsics.d(this.islandColor, islandSettings.islandColor) && this.islandCornerRadius == islandSettings.islandCornerRadius && Intrinsics.d(this.padding, islandSettings.padding) && Intrinsics.d(this.tokenizedEvent, islandSettings.tokenizedEvent) && Intrinsics.d(this.action, islandSettings.action);
        }

        public final AtomAction getAction() {
            return this.action;
        }

        public final String getIslandColor() {
            return this.islandColor;
        }

        @NotNull
        public final CornerRadius getIslandCornerRadius() {
            return this.islandCornerRadius;
        }

        @NotNull
        public final PaddingCompose getPadding() {
            return this.padding;
        }

        public final t getTokenizedEvent() {
            return this.tokenizedEvent;
        }

        public int hashCode() {
            String str = this.islandColor;
            int hashCode = (this.padding.hashCode() + b.b(this.islandCornerRadius, (str == null ? 0 : str.hashCode()) * 31, 31)) * 31;
            t tVar = this.tokenizedEvent;
            int hashCode2 = (hashCode + (tVar == null ? 0 : tVar.hashCode())) * 31;
            AtomAction atomAction = this.action;
            return hashCode2 + (atomAction != null ? atomAction.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            String str = this.islandColor;
            CornerRadius cornerRadius = this.islandCornerRadius;
            PaddingCompose paddingCompose = this.padding;
            t tVar = this.tokenizedEvent;
            AtomAction atomAction = this.action;
            StringBuilder sb2 = new StringBuilder("IslandSettings(islandColor=");
            sb2.append(str);
            sb2.append(", islandCornerRadius=");
            sb2.append(cornerRadius);
            sb2.append(", padding=");
            sb2.append(paddingCompose);
            sb2.append(", tokenizedEvent=");
            sb2.append(tVar);
            sb2.append(", action=");
            return B6.b.b(sb2, atomAction, ")");
        }
    }

    public CodeComposeVI(long j11, @NotNull IslandSettings settings, @NotNull TextDTO title, IconDTO iconDTO, @NotNull TextDTO subtitle, TestInfo testInfo) {
        Intrinsics.checkNotNullParameter(settings, "settings");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        this.id = j11;
        this.settings = settings;
        this.title = title;
        this.titleIcon = iconDTO;
        this.subtitle = subtitle;
        this.testInfo = testInfo;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CodeComposeVI)) {
            return false;
        }
        CodeComposeVI codeComposeVI = (CodeComposeVI) other;
        return this.id == codeComposeVI.id && Intrinsics.d(this.settings, codeComposeVI.settings) && Intrinsics.d(this.title, codeComposeVI.title) && Intrinsics.d(this.titleIcon, codeComposeVI.titleIcon) && Intrinsics.d(this.subtitle, codeComposeVI.subtitle) && Intrinsics.d(this.testInfo, codeComposeVI.testInfo);
    }

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    @Override // l20.c
    public Integer getScrollWidgetKey() {
        return null;
    }

    @NotNull
    public final IslandSettings getSettings() {
        return this.settings;
    }

    @NotNull
    public final TextDTO getSubtitle() {
        return this.subtitle;
    }

    public final TestInfo getTestInfo() {
        return this.testInfo;
    }

    @NotNull
    public final TextDTO getTitle() {
        return this.title;
    }

    public final IconDTO getTitleIcon() {
        return this.titleIcon;
    }

    @Override // l20.c
    public int getViewItemKey() {
        return hashCode();
    }

    public int hashCode() {
        int a11 = Ns.b.a(this.title, (this.settings.hashCode() + (Long.hashCode(this.id) * 31)) * 31, 31);
        IconDTO iconDTO = this.titleIcon;
        int a12 = Ns.b.a(this.subtitle, (a11 + (iconDTO == null ? 0 : iconDTO.hashCode())) * 31, 31);
        TestInfo testInfo = this.testInfo;
        return a12 + (testInfo != null ? testInfo.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "CodeComposeVI(id=" + this.id + ", settings=" + this.settings + ", title=" + this.title + ", titleIcon=" + this.titleIcon + ", subtitle=" + this.subtitle + ", testInfo=" + this.testInfo + ")";
    }
}
