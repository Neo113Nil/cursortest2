package ru.ozon.app.android.common.filterWidgets.filters.presentation.brandAspects;

import Ak.C2436a;
import G.g;
import Kk.C3532b;
import WZ.t;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.TestInfo;
import ru.ozon.uni.atoms.data.aspect.AspectDTO;
import ru.ozon.uni.atoms.data.button.ButtonV3Atom;
import ru.ozon.uni.atoms.data.icon.IconDTO;

@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0002\b\"\b\u0080\b\u0018\u00002\u00060\u0001j\u0002`\u0002:\u0001AB\u0081\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0005\u0012\u0006\u0010\u0013\u001a\u00020\r\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0014\u0012\u000e\u0010\u0019\u001a\n\u0018\u00010\u0017j\u0004\u0018\u0001`\u0018¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u001a\u0010\"\u001a\u00020\r2\b\u0010!\u001a\u0004\u0018\u00010 HÖ\u0003¢\u0006\u0004\b\"\u0010#R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010$\u001a\u0004\b%\u0010&R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010'\u001a\u0004\b(\u0010\u001dR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010)\u001a\u0004\b*\u0010+R\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\n\u0010,\u001a\u0004\b-\u0010.R\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010/\u001a\u0004\b0\u00101R\u0017\u0010\u000e\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b\u000e\u00102\u001a\u0004\b3\u00104R\u001d\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f8\u0006¢\u0006\f\n\u0004\b\u0011\u00105\u001a\u0004\b6\u00107R\u0017\u0010\u0012\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0012\u0010'\u001a\u0004\b8\u0010\u001dR\u0017\u0010\u0013\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b\u0013\u00102\u001a\u0004\b9\u00104R\u0019\u0010\u0015\u001a\u0004\u0018\u00010\u00148\u0006¢\u0006\f\n\u0004\b\u0015\u0010:\u001a\u0004\b;\u0010<R\u0019\u0010\u0016\u001a\u0004\u0018\u00010\u00148\u0006¢\u0006\f\n\u0004\b\u0016\u0010:\u001a\u0004\b=\u0010<R\u001f\u0010\u0019\u001a\n\u0018\u00010\u0017j\u0004\u0018\u0001`\u00188\u0006¢\u0006\f\n\u0004\b\u0019\u0010>\u001a\u0004\b?\u0010@¨\u0006B"}, d2 = {"Lru/ozon/app/android/common/filterWidgets/filters/presentation/brandAspects/BrandAspectsVO;", "Ll20/c;", "Lru/ozon/app/android/composer/view/ViewObject;", "", "id", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/uni/atoms/af/AtomAction;", "action", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeBorderlessButton;", "rightButton", "Lru/ozon/uni/atoms/data/icon/IconDTO;", "rightIcon", "", "scrollEnabled", "", "Lru/ozon/app/android/common/filterWidgets/filters/presentation/brandAspects/BrandAspectsVO$AspectBrand;", "aspects", "originalUrl", "showSeparator", "", "maxRowsCount", "totalValuesCount", "LWZ/t;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedEvent;", "tokenizedEvent", "<init>", "(JLjava/lang/String;Lru/ozon/uni/atoms/af/AtomAction;Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeBorderlessButton;Lru/ozon/uni/atoms/data/icon/IconDTO;ZLjava/util/List;Ljava/lang/String;ZLjava/lang/Integer;Ljava/lang/Integer;LWZ/t;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Ljava/lang/String;", "getTitle", "Lru/ozon/uni/atoms/af/AtomAction;", "getAction", "()Lru/ozon/uni/atoms/af/AtomAction;", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeBorderlessButton;", "getRightButton", "()Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeBorderlessButton;", "Lru/ozon/uni/atoms/data/icon/IconDTO;", "getRightIcon", "()Lru/ozon/uni/atoms/data/icon/IconDTO;", "Z", "getScrollEnabled", "()Z", "Ljava/util/List;", "getAspects", "()Ljava/util/List;", "getOriginalUrl", "getShowSeparator", "Ljava/lang/Integer;", "getMaxRowsCount", "()Ljava/lang/Integer;", "getTotalValuesCount", "LWZ/t;", "getTokenizedEvent", "()LWZ/t;", "AspectBrand", "filter-widgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class BrandAspectsVO implements c {
    private final AtomAction action;

    @NotNull
    private final List<AspectBrand> aspects;
    private final long id;
    private final Integer maxRowsCount;

    @NotNull
    private final String originalUrl;
    private final ButtonV3Atom.LargeBorderlessButton rightButton;
    private final IconDTO rightIcon;
    private final boolean scrollEnabled;
    private final boolean showSeparator;
    private final String title;
    private final t tokenizedEvent;
    private final Integer totalValuesCount;

    @Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u001d\b\u0086\b\u0018\u00002\u00020\u0001BW\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\u000e\u0010\u000e\u001a\n\u0018\u00010\fj\u0004\u0018\u0001`\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001b\u001a\u00020\u000f2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010 \u001a\u0004\b!\u0010\"R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010#\u001a\u0004\b$\u0010%R\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\t\u0010&\u001a\u0004\b'\u0010\u0016R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010(\u001a\u0004\b)\u0010*R\u001f\u0010\u000e\u001a\n\u0018\u00010\fj\u0004\u0018\u0001`\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010+\u001a\u0004\b,\u0010-R\u0017\u0010\u0010\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u0010.\u001a\u0004\b/\u00100R\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0006¢\u0006\f\n\u0004\b\u0012\u00101\u001a\u0004\b2\u00103¨\u00064"}, d2 = {"Lru/ozon/app/android/common/filterWidgets/filters/presentation/brandAspects/BrandAspectsVO$AspectBrand;", "", "", "id", "Lru/ozon/uni/atoms/data/aspect/AspectDTO;", "aspect", "Lru/ozon/uni/atoms/data/icon/IconDTO;", "icon", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/uni/atoms/af/AtomAction;", "action", "LWZ/t;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedEvent;", "tokenizedEvent", "", "scrollEnabled", "Lru/ozon/uni/atoms/data/TestInfo;", "testInfo", "<init>", "(JLru/ozon/uni/atoms/data/aspect/AspectDTO;Lru/ozon/uni/atoms/data/icon/IconDTO;Ljava/lang/String;Lru/ozon/uni/atoms/af/AtomAction;LWZ/t;ZLru/ozon/uni/atoms/data/TestInfo;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Lru/ozon/uni/atoms/data/aspect/AspectDTO;", "getAspect", "()Lru/ozon/uni/atoms/data/aspect/AspectDTO;", "Lru/ozon/uni/atoms/data/icon/IconDTO;", "getIcon", "()Lru/ozon/uni/atoms/data/icon/IconDTO;", "Ljava/lang/String;", "getTitle", "Lru/ozon/uni/atoms/af/AtomAction;", "getAction", "()Lru/ozon/uni/atoms/af/AtomAction;", "LWZ/t;", "getTokenizedEvent", "()LWZ/t;", "Z", "getScrollEnabled", "()Z", "Lru/ozon/uni/atoms/data/TestInfo;", "getTestInfo", "()Lru/ozon/uni/atoms/data/TestInfo;", "filter-widgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class AspectBrand {
        private final AtomAction action;

        @NotNull
        private final AspectDTO aspect;
        private final IconDTO icon;
        private final long id;
        private final boolean scrollEnabled;
        private final TestInfo testInfo;
        private final String title;
        private final t tokenizedEvent;

        public AspectBrand(long j11, @NotNull AspectDTO aspect, IconDTO iconDTO, String str, AtomAction atomAction, t tVar, boolean z11, TestInfo testInfo) {
            Intrinsics.checkNotNullParameter(aspect, "aspect");
            this.id = j11;
            this.aspect = aspect;
            this.icon = iconDTO;
            this.title = str;
            this.action = atomAction;
            this.tokenizedEvent = tVar;
            this.scrollEnabled = z11;
            this.testInfo = testInfo;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof AspectBrand)) {
                return false;
            }
            AspectBrand aspectBrand = (AspectBrand) other;
            return this.id == aspectBrand.id && Intrinsics.d(this.aspect, aspectBrand.aspect) && Intrinsics.d(this.icon, aspectBrand.icon) && Intrinsics.d(this.title, aspectBrand.title) && Intrinsics.d(this.action, aspectBrand.action) && Intrinsics.d(this.tokenizedEvent, aspectBrand.tokenizedEvent) && this.scrollEnabled == aspectBrand.scrollEnabled && Intrinsics.d(this.testInfo, aspectBrand.testInfo);
        }

        public final AtomAction getAction() {
            return this.action;
        }

        @NotNull
        public final AspectDTO getAspect() {
            return this.aspect;
        }

        public final IconDTO getIcon() {
            return this.icon;
        }

        public final long getId() {
            return this.id;
        }

        public final boolean getScrollEnabled() {
            return this.scrollEnabled;
        }

        public final TestInfo getTestInfo() {
            return this.testInfo;
        }

        public final String getTitle() {
            return this.title;
        }

        public final t getTokenizedEvent() {
            return this.tokenizedEvent;
        }

        public int hashCode() {
            int hashCode = (this.aspect.hashCode() + (Long.hashCode(this.id) * 31)) * 31;
            IconDTO iconDTO = this.icon;
            int hashCode2 = (hashCode + (iconDTO == null ? 0 : iconDTO.hashCode())) * 31;
            String str = this.title;
            int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
            AtomAction atomAction = this.action;
            int hashCode4 = (hashCode3 + (atomAction == null ? 0 : atomAction.hashCode())) * 31;
            t tVar = this.tokenizedEvent;
            int a11 = C3532b.a((hashCode4 + (tVar == null ? 0 : tVar.hashCode())) * 31, 31, this.scrollEnabled);
            TestInfo testInfo = this.testInfo;
            return a11 + (testInfo != null ? testInfo.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            long j11 = this.id;
            AspectDTO aspectDTO = this.aspect;
            IconDTO iconDTO = this.icon;
            String str = this.title;
            AtomAction atomAction = this.action;
            t tVar = this.tokenizedEvent;
            boolean z11 = this.scrollEnabled;
            TestInfo testInfo = this.testInfo;
            StringBuilder sb2 = new StringBuilder("AspectBrand(id=");
            sb2.append(j11);
            sb2.append(", aspect=");
            sb2.append(aspectDTO);
            sb2.append(", icon=");
            sb2.append(iconDTO);
            sb2.append(", title=");
            sb2.append(str);
            Fj.c.e(tVar, ", action=", ", tokenizedEvent=", sb2, atomAction);
            sb2.append(", scrollEnabled=");
            sb2.append(z11);
            sb2.append(", testInfo=");
            sb2.append(testInfo);
            sb2.append(")");
            return sb2.toString();
        }
    }

    public BrandAspectsVO(long j11, String str, AtomAction atomAction, ButtonV3Atom.LargeBorderlessButton largeBorderlessButton, IconDTO iconDTO, boolean z11, @NotNull List<AspectBrand> aspects, @NotNull String originalUrl, boolean z12, Integer num, Integer num2, t tVar) {
        Intrinsics.checkNotNullParameter(aspects, "aspects");
        Intrinsics.checkNotNullParameter(originalUrl, "originalUrl");
        this.id = j11;
        this.title = str;
        this.action = atomAction;
        this.rightButton = largeBorderlessButton;
        this.rightIcon = iconDTO;
        this.scrollEnabled = z11;
        this.aspects = aspects;
        this.originalUrl = originalUrl;
        this.showSeparator = z12;
        this.maxRowsCount = num;
        this.totalValuesCount = num2;
        this.tokenizedEvent = tVar;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BrandAspectsVO)) {
            return false;
        }
        BrandAspectsVO brandAspectsVO = (BrandAspectsVO) other;
        return this.id == brandAspectsVO.id && Intrinsics.d(this.title, brandAspectsVO.title) && Intrinsics.d(this.action, brandAspectsVO.action) && Intrinsics.d(this.rightButton, brandAspectsVO.rightButton) && Intrinsics.d(this.rightIcon, brandAspectsVO.rightIcon) && this.scrollEnabled == brandAspectsVO.scrollEnabled && Intrinsics.d(this.aspects, brandAspectsVO.aspects) && Intrinsics.d(this.originalUrl, brandAspectsVO.originalUrl) && this.showSeparator == brandAspectsVO.showSeparator && Intrinsics.d(this.maxRowsCount, brandAspectsVO.maxRowsCount) && Intrinsics.d(this.totalValuesCount, brandAspectsVO.totalValuesCount) && Intrinsics.d(this.tokenizedEvent, brandAspectsVO.tokenizedEvent);
    }

    public final AtomAction getAction() {
        return this.action;
    }

    @NotNull
    public final List<AspectBrand> getAspects() {
        return this.aspects;
    }

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    public final Integer getMaxRowsCount() {
        return this.maxRowsCount;
    }

    @NotNull
    public final String getOriginalUrl() {
        return this.originalUrl;
    }

    public final ButtonV3Atom.LargeBorderlessButton getRightButton() {
        return this.rightButton;
    }

    public final IconDTO getRightIcon() {
        return this.rightIcon;
    }

    public final boolean getScrollEnabled() {
        return this.scrollEnabled;
    }

    @Override // l20.c
    public Integer getScrollWidgetKey() {
        return null;
    }

    public final boolean getShowSeparator() {
        return this.showSeparator;
    }

    public final String getTitle() {
        return this.title;
    }

    public final t getTokenizedEvent() {
        return this.tokenizedEvent;
    }

    public final Integer getTotalValuesCount() {
        return this.totalValuesCount;
    }

    @Override // l20.c
    public int getViewItemKey() {
        return hashCode();
    }

    public int hashCode() {
        int hashCode = Long.hashCode(this.id) * 31;
        String str = this.title;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        AtomAction atomAction = this.action;
        int hashCode3 = (hashCode2 + (atomAction == null ? 0 : atomAction.hashCode())) * 31;
        ButtonV3Atom.LargeBorderlessButton largeBorderlessButton = this.rightButton;
        int hashCode4 = (hashCode3 + (largeBorderlessButton == null ? 0 : largeBorderlessButton.hashCode())) * 31;
        IconDTO iconDTO = this.rightIcon;
        int a11 = C3532b.a(g.a(g.b(C3532b.a((hashCode4 + (iconDTO == null ? 0 : iconDTO.hashCode())) * 31, 31, this.scrollEnabled), 31, this.aspects), 31, this.originalUrl), 31, this.showSeparator);
        Integer num = this.maxRowsCount;
        int hashCode5 = (a11 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.totalValuesCount;
        int hashCode6 = (hashCode5 + (num2 == null ? 0 : num2.hashCode())) * 31;
        t tVar = this.tokenizedEvent;
        return hashCode6 + (tVar != null ? tVar.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        long j11 = this.id;
        String str = this.title;
        AtomAction atomAction = this.action;
        ButtonV3Atom.LargeBorderlessButton largeBorderlessButton = this.rightButton;
        IconDTO iconDTO = this.rightIcon;
        boolean z11 = this.scrollEnabled;
        List<AspectBrand> list = this.aspects;
        String str2 = this.originalUrl;
        boolean z12 = this.showSeparator;
        Integer num = this.maxRowsCount;
        Integer num2 = this.totalValuesCount;
        t tVar = this.tokenizedEvent;
        StringBuilder c11 = C2436a.c(j11, "BrandAspectsVO(id=", ", title=", str);
        c11.append(", action=");
        c11.append(atomAction);
        c11.append(", rightButton=");
        c11.append(largeBorderlessButton);
        c11.append(", rightIcon=");
        c11.append(iconDTO);
        c11.append(", scrollEnabled=");
        c11.append(z11);
        c11.append(", aspects=");
        c11.append(list);
        c11.append(", originalUrl=");
        c11.append(str2);
        c11.append(", showSeparator=");
        c11.append(z12);
        c11.append(", maxRowsCount=");
        c11.append(num);
        c11.append(", totalValuesCount=");
        c11.append(num2);
        c11.append(", tokenizedEvent=");
        c11.append(tVar);
        c11.append(")");
        return c11.toString();
    }
}
