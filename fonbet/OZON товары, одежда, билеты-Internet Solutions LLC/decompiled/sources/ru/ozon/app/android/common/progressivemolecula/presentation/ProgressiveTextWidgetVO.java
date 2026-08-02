package ru.ozon.app.android.common.progressivemolecula.presentation;

import Bi.b;
import TY.a;
import WZ.t;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.common.progressivemolecula.data.ProgressiveBadgeDTO;
import ru.ozon.app.android.common.progressivemolecula.data.ProgressiveTextWidgetDTO;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.cell.CommonCellSettings;
import ru.ozon.uni.atoms.data.icon.IconDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0013\b\u0086\b\u0018\u00002\u00060\u0001j\u0002`\u0002:\u0001&B3\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\u000b\u001a\u00020\t¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0016\u001a\u00020\t2\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\n\u0010!\u001a\u0004\b\n\u0010\"R\u0017\u0010\u000b\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u000b\u0010#\u001a\u0004\b$\u0010%¨\u0006'"}, d2 = {"Lru/ozon/app/android/common/progressivemolecula/presentation/ProgressiveTextWidgetVO;", "Ll20/c;", "Lru/ozon/app/android/composer/view/ViewObject;", "", "id", "Lru/ozon/app/android/common/progressivemolecula/presentation/ProgressiveTextWidgetVO$ProgressiveTextVO;", "progressiveText", "Lru/ozon/uni/atoms/data/cell/CommonCellSettings$LayoutPadding;", "horizontalPadding", "", "isSticky", "pageTypeIsPDP", "<init>", "(JLru/ozon/app/android/common/progressivemolecula/presentation/ProgressiveTextWidgetVO$ProgressiveTextVO;Lru/ozon/uni/atoms/data/cell/CommonCellSettings$LayoutPadding;Ljava/lang/Boolean;Z)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Lru/ozon/app/android/common/progressivemolecula/presentation/ProgressiveTextWidgetVO$ProgressiveTextVO;", "getProgressiveText", "()Lru/ozon/app/android/common/progressivemolecula/presentation/ProgressiveTextWidgetVO$ProgressiveTextVO;", "Lru/ozon/uni/atoms/data/cell/CommonCellSettings$LayoutPadding;", "getHorizontalPadding", "()Lru/ozon/uni/atoms/data/cell/CommonCellSettings$LayoutPadding;", "Ljava/lang/Boolean;", "()Ljava/lang/Boolean;", "Z", "getPageTypeIsPDP", "()Z", "ProgressiveTextVO", "progressive-molecula_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class ProgressiveTextWidgetVO implements c {
    private final CommonCellSettings.LayoutPadding horizontalPadding;
    private final long id;
    private final Boolean isSticky;
    private final boolean pageTypeIsPDP;

    @NotNull
    private final ProgressiveTextVO progressiveText;

    @Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u001e\b\u0086\b\u0018\u00002\u00060\u0001j\u0002`\u0002Bo\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\u000e\u0010\u0016\u001a\n\u0018\u00010\u0014j\u0004\u0018\u0001`\u0015¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010 \u001a\u00020\u001f2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dHÖ\u0003¢\u0006\u0004\b \u0010!R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\"\u001a\u0004\b#\u0010$R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010%\u001a\u0004\b&\u0010'R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010(\u001a\u0004\b)\u0010*R\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\n\u0010+\u001a\u0004\b,\u0010-R\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010.\u001a\u0004\b/\u0010\u001aR\u0019\u0010\r\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b\r\u0010.\u001a\u0004\b0\u0010\u001aR\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u00101\u001a\u0004\b2\u00103R\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0006¢\u0006\f\n\u0004\b\u0011\u00104\u001a\u0004\b5\u00106R\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0006¢\u0006\f\n\u0004\b\u0013\u00107\u001a\u0004\b8\u00109R\u001f\u0010\u0016\u001a\n\u0018\u00010\u0014j\u0004\u0018\u0001`\u00158\u0006¢\u0006\f\n\u0004\b\u0016\u0010:\u001a\u0004\b;\u0010<¨\u0006="}, d2 = {"Lru/ozon/app/android/common/progressivemolecula/presentation/ProgressiveTextWidgetVO$ProgressiveTextVO;", "Ll20/c;", "Lru/ozon/app/android/composer/view/ViewObject;", "", "id", "Lru/ozon/uni/atoms/data/text/TextDTO;", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/uni/atoms/data/icon/IconDTO;", "icon", "Lru/ozon/app/android/common/progressivemolecula/data/ProgressiveBadgeDTO;", "badge", "", "backgroundColor", "borderColor", "Lru/ozon/app/android/common/progressivemolecula/data/ProgressiveTextWidgetDTO$Paddings;", "paddings", "", "cornerRadius", "Lru/ozon/uni/atoms/af/AtomAction;", "action", "LWZ/t;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedEvent;", "tokenizedEvent", "<init>", "(JLru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/icon/IconDTO;Lru/ozon/app/android/common/progressivemolecula/data/ProgressiveBadgeDTO;Ljava/lang/String;Ljava/lang/String;Lru/ozon/app/android/common/progressivemolecula/data/ProgressiveTextWidgetDTO$Paddings;Ljava/lang/Integer;Lru/ozon/uni/atoms/af/AtomAction;LWZ/t;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Lru/ozon/uni/atoms/data/text/TextDTO;", "getTitle", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "Lru/ozon/uni/atoms/data/icon/IconDTO;", "getIcon", "()Lru/ozon/uni/atoms/data/icon/IconDTO;", "Lru/ozon/app/android/common/progressivemolecula/data/ProgressiveBadgeDTO;", "getBadge", "()Lru/ozon/app/android/common/progressivemolecula/data/ProgressiveBadgeDTO;", "Ljava/lang/String;", "getBackgroundColor", "getBorderColor", "Lru/ozon/app/android/common/progressivemolecula/data/ProgressiveTextWidgetDTO$Paddings;", "getPaddings", "()Lru/ozon/app/android/common/progressivemolecula/data/ProgressiveTextWidgetDTO$Paddings;", "Ljava/lang/Integer;", "getCornerRadius", "()Ljava/lang/Integer;", "Lru/ozon/uni/atoms/af/AtomAction;", "getAction", "()Lru/ozon/uni/atoms/af/AtomAction;", "LWZ/t;", "getTokenizedEvent", "()LWZ/t;", "progressive-molecula_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class ProgressiveTextVO implements c {
        private final AtomAction action;
        private final String backgroundColor;
        private final ProgressiveBadgeDTO badge;
        private final String borderColor;
        private final Integer cornerRadius;
        private final IconDTO icon;
        private final long id;
        private final ProgressiveTextWidgetDTO.Paddings paddings;
        private final TextDTO title;
        private final t tokenizedEvent;

        public ProgressiveTextVO(long j11, TextDTO textDTO, IconDTO iconDTO, ProgressiveBadgeDTO progressiveBadgeDTO, String str, String str2, ProgressiveTextWidgetDTO.Paddings paddings, Integer num, AtomAction atomAction, t tVar) {
            this.id = j11;
            this.title = textDTO;
            this.icon = iconDTO;
            this.badge = progressiveBadgeDTO;
            this.backgroundColor = str;
            this.borderColor = str2;
            this.paddings = paddings;
            this.cornerRadius = num;
            this.action = atomAction;
            this.tokenizedEvent = tVar;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ProgressiveTextVO)) {
                return false;
            }
            ProgressiveTextVO progressiveTextVO = (ProgressiveTextVO) other;
            return this.id == progressiveTextVO.id && Intrinsics.d(this.title, progressiveTextVO.title) && Intrinsics.d(this.icon, progressiveTextVO.icon) && Intrinsics.d(this.badge, progressiveTextVO.badge) && Intrinsics.d(this.backgroundColor, progressiveTextVO.backgroundColor) && Intrinsics.d(this.borderColor, progressiveTextVO.borderColor) && Intrinsics.d(this.paddings, progressiveTextVO.paddings) && Intrinsics.d(this.cornerRadius, progressiveTextVO.cornerRadius) && Intrinsics.d(this.action, progressiveTextVO.action) && Intrinsics.d(this.tokenizedEvent, progressiveTextVO.tokenizedEvent);
        }

        public final AtomAction getAction() {
            return this.action;
        }

        public final String getBackgroundColor() {
            return this.backgroundColor;
        }

        public final ProgressiveBadgeDTO getBadge() {
            return this.badge;
        }

        public final String getBorderColor() {
            return this.borderColor;
        }

        public final Integer getCornerRadius() {
            return this.cornerRadius;
        }

        public final IconDTO getIcon() {
            return this.icon;
        }

        @Override // l20.c
        public long getId() {
            return this.id;
        }

        public final ProgressiveTextWidgetDTO.Paddings getPaddings() {
            return this.paddings;
        }

        @Override // l20.c
        public Integer getScrollWidgetKey() {
            return null;
        }

        public final TextDTO getTitle() {
            return this.title;
        }

        public final t getTokenizedEvent() {
            return this.tokenizedEvent;
        }

        @Override // l20.c
        public int getViewItemKey() {
            return hashCode();
        }

        public int hashCode() {
            int hashCode = Long.hashCode(this.id) * 31;
            TextDTO textDTO = this.title;
            int hashCode2 = (hashCode + (textDTO == null ? 0 : textDTO.hashCode())) * 31;
            IconDTO iconDTO = this.icon;
            int hashCode3 = (hashCode2 + (iconDTO == null ? 0 : iconDTO.hashCode())) * 31;
            ProgressiveBadgeDTO progressiveBadgeDTO = this.badge;
            int hashCode4 = (hashCode3 + (progressiveBadgeDTO == null ? 0 : progressiveBadgeDTO.hashCode())) * 31;
            String str = this.backgroundColor;
            int hashCode5 = (hashCode4 + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.borderColor;
            int hashCode6 = (hashCode5 + (str2 == null ? 0 : str2.hashCode())) * 31;
            ProgressiveTextWidgetDTO.Paddings paddings = this.paddings;
            int hashCode7 = (hashCode6 + (paddings == null ? 0 : paddings.hashCode())) * 31;
            Integer num = this.cornerRadius;
            int hashCode8 = (hashCode7 + (num == null ? 0 : num.hashCode())) * 31;
            AtomAction atomAction = this.action;
            int hashCode9 = (hashCode8 + (atomAction == null ? 0 : atomAction.hashCode())) * 31;
            t tVar = this.tokenizedEvent;
            return hashCode9 + (tVar != null ? tVar.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            long j11 = this.id;
            TextDTO textDTO = this.title;
            IconDTO iconDTO = this.icon;
            ProgressiveBadgeDTO progressiveBadgeDTO = this.badge;
            String str = this.backgroundColor;
            String str2 = this.borderColor;
            ProgressiveTextWidgetDTO.Paddings paddings = this.paddings;
            Integer num = this.cornerRadius;
            AtomAction atomAction = this.action;
            t tVar = this.tokenizedEvent;
            StringBuilder b11 = a.b("ProgressiveTextVO(id=", j11, ", title=", textDTO);
            b11.append(", icon=");
            b11.append(iconDTO);
            b11.append(", badge=");
            b11.append(progressiveBadgeDTO);
            Nh.a.h(b11, ", backgroundColor=", str, ", borderColor=", str2);
            b11.append(", paddings=");
            b11.append(paddings);
            b11.append(", cornerRadius=");
            b11.append(num);
            Fj.c.e(tVar, ", action=", ", tokenizedEvent=", b11, atomAction);
            b11.append(")");
            return b11.toString();
        }
    }

    public ProgressiveTextWidgetVO(long j11, @NotNull ProgressiveTextVO progressiveText, CommonCellSettings.LayoutPadding layoutPadding, Boolean bool, boolean z11) {
        Intrinsics.checkNotNullParameter(progressiveText, "progressiveText");
        this.id = j11;
        this.progressiveText = progressiveText;
        this.horizontalPadding = layoutPadding;
        this.isSticky = bool;
        this.pageTypeIsPDP = z11;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ProgressiveTextWidgetVO)) {
            return false;
        }
        ProgressiveTextWidgetVO progressiveTextWidgetVO = (ProgressiveTextWidgetVO) other;
        return this.id == progressiveTextWidgetVO.id && Intrinsics.d(this.progressiveText, progressiveTextWidgetVO.progressiveText) && this.horizontalPadding == progressiveTextWidgetVO.horizontalPadding && Intrinsics.d(this.isSticky, progressiveTextWidgetVO.isSticky) && this.pageTypeIsPDP == progressiveTextWidgetVO.pageTypeIsPDP;
    }

    public final CommonCellSettings.LayoutPadding getHorizontalPadding() {
        return this.horizontalPadding;
    }

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    public final boolean getPageTypeIsPDP() {
        return this.pageTypeIsPDP;
    }

    @NotNull
    public final ProgressiveTextVO getProgressiveText() {
        return this.progressiveText;
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
        int hashCode = (this.progressiveText.hashCode() + (Long.hashCode(this.id) * 31)) * 31;
        CommonCellSettings.LayoutPadding layoutPadding = this.horizontalPadding;
        int hashCode2 = (hashCode + (layoutPadding == null ? 0 : layoutPadding.hashCode())) * 31;
        Boolean bool = this.isSticky;
        return Boolean.hashCode(this.pageTypeIsPDP) + ((hashCode2 + (bool != null ? bool.hashCode() : 0)) * 31);
    }

    @NotNull
    public String toString() {
        long j11 = this.id;
        ProgressiveTextVO progressiveTextVO = this.progressiveText;
        CommonCellSettings.LayoutPadding layoutPadding = this.horizontalPadding;
        Boolean bool = this.isSticky;
        boolean z11 = this.pageTypeIsPDP;
        StringBuilder sb2 = new StringBuilder("ProgressiveTextWidgetVO(id=");
        sb2.append(j11);
        sb2.append(", progressiveText=");
        sb2.append(progressiveTextVO);
        sb2.append(", horizontalPadding=");
        sb2.append(layoutPadding);
        sb2.append(", isSticky=");
        sb2.append(bool);
        return b.f(sb2, ", pageTypeIsPDP=", z11, ")");
    }
}
