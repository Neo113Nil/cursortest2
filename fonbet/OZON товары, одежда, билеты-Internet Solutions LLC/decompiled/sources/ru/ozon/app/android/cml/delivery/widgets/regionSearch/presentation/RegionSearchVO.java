package ru.ozon.app.android.cml.delivery.widgets.regionSearch.presentation;

import Ak.C2436a;
import Ak.b;
import G.g;
import Lh.a;
import WZ.t;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.controls.CommonControlSettings;
import ru.ozon.uni.atoms.data.text.TextDTO;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0012\b\u0080\b\u0018\u00002\u00060\u0001j\u0002`\u0002:\u0001'B1\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001c\u001a\u0004\b\u001d\u0010\u0010R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010!\u001a\u0004\b\"\u0010#R\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010$\u001a\u0004\b%\u0010&¨\u0006("}, d2 = {"Lru/ozon/app/android/cml/delivery/widgets/regionSearch/presentation/RegionSearchVO;", "Ll20/c;", "Lru/ozon/app/android/composer/view/ViewObject;", "", "id", "", "backgroundColor", "Lru/ozon/uni/atoms/data/text/TextDTO;", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/app/android/cml/delivery/widgets/regionSearch/presentation/RegionSearchVO$TextFieldVO;", "input", "LWZ/t;", "tokenizedEvent", "<init>", "(JLjava/lang/String;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/app/android/cml/delivery/widgets/regionSearch/presentation/RegionSearchVO$TextFieldVO;LWZ/t;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Ljava/lang/String;", "getBackgroundColor", "Lru/ozon/uni/atoms/data/text/TextDTO;", "getTitle", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "Lru/ozon/app/android/cml/delivery/widgets/regionSearch/presentation/RegionSearchVO$TextFieldVO;", "getInput", "()Lru/ozon/app/android/cml/delivery/widgets/regionSearch/presentation/RegionSearchVO$TextFieldVO;", "LWZ/t;", "getTokenizedEvent", "()LWZ/t;", "TextFieldVO", "delivery_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class RegionSearchVO implements c {

    @NotNull
    private final String backgroundColor;
    private final long id;

    @NotNull
    private final TextFieldVO input;

    @NotNull
    private final TextDTO title;
    private final t tokenizedEvent;

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0086\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u000bR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, d2 = {"Lru/ozon/app/android/cml/delivery/widgets/regionSearch/presentation/RegionSearchVO$TextFieldVO;", "", "", "label", "", "delay", "Lru/ozon/uni/atoms/data/controls/CommonControlSettings;", "common", "<init>", "(Ljava/lang/String;Ljava/lang/Long;Lru/ozon/uni/atoms/data/controls/CommonControlSettings;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getLabel", "Ljava/lang/Long;", "getDelay", "()Ljava/lang/Long;", "Lru/ozon/uni/atoms/data/controls/CommonControlSettings;", "getCommon", "()Lru/ozon/uni/atoms/data/controls/CommonControlSettings;", "delivery_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class TextFieldVO {

        @NotNull
        private final CommonControlSettings common;
        private final Long delay;

        @NotNull
        private final String label;

        public TextFieldVO(@NotNull String label, Long l11, @NotNull CommonControlSettings common) {
            Intrinsics.checkNotNullParameter(label, "label");
            Intrinsics.checkNotNullParameter(common, "common");
            this.label = label;
            this.delay = l11;
            this.common = common;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof TextFieldVO)) {
                return false;
            }
            TextFieldVO textFieldVO = (TextFieldVO) other;
            return Intrinsics.d(this.label, textFieldVO.label) && Intrinsics.d(this.delay, textFieldVO.delay) && Intrinsics.d(this.common, textFieldVO.common);
        }

        @NotNull
        public final CommonControlSettings getCommon() {
            return this.common;
        }

        public final Long getDelay() {
            return this.delay;
        }

        @NotNull
        public final String getLabel() {
            return this.label;
        }

        public int hashCode() {
            int hashCode = this.label.hashCode() * 31;
            Long l11 = this.delay;
            return this.common.hashCode() + ((hashCode + (l11 == null ? 0 : l11.hashCode())) * 31);
        }

        @NotNull
        public String toString() {
            String str = this.label;
            Long l11 = this.delay;
            CommonControlSettings commonControlSettings = this.common;
            StringBuilder sb2 = new StringBuilder("TextFieldVO(label=");
            sb2.append(str);
            sb2.append(", delay=");
            sb2.append(l11);
            sb2.append(", common=");
            return b.g(sb2, commonControlSettings, ")");
        }
    }

    public RegionSearchVO(long j11, @NotNull String backgroundColor, @NotNull TextDTO title, @NotNull TextFieldVO input, t tVar) {
        Intrinsics.checkNotNullParameter(backgroundColor, "backgroundColor");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(input, "input");
        this.id = j11;
        this.backgroundColor = backgroundColor;
        this.title = title;
        this.input = input;
        this.tokenizedEvent = tVar;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RegionSearchVO)) {
            return false;
        }
        RegionSearchVO regionSearchVO = (RegionSearchVO) other;
        return this.id == regionSearchVO.id && Intrinsics.d(this.backgroundColor, regionSearchVO.backgroundColor) && Intrinsics.d(this.title, regionSearchVO.title) && Intrinsics.d(this.input, regionSearchVO.input) && Intrinsics.d(this.tokenizedEvent, regionSearchVO.tokenizedEvent);
    }

    @NotNull
    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    @NotNull
    public final TextFieldVO getInput() {
        return this.input;
    }

    @Override // l20.c
    public Integer getScrollWidgetKey() {
        return null;
    }

    @NotNull
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
        int hashCode = (this.input.hashCode() + Ns.b.a(this.title, g.a(Long.hashCode(this.id) * 31, 31, this.backgroundColor), 31)) * 31;
        t tVar = this.tokenizedEvent;
        return hashCode + (tVar == null ? 0 : tVar.hashCode());
    }

    @NotNull
    public String toString() {
        long j11 = this.id;
        String str = this.backgroundColor;
        TextDTO textDTO = this.title;
        TextFieldVO textFieldVO = this.input;
        t tVar = this.tokenizedEvent;
        StringBuilder c11 = C2436a.c(j11, "RegionSearchVO(id=", ", backgroundColor=", str);
        c11.append(", title=");
        c11.append(textDTO);
        c11.append(", input=");
        c11.append(textFieldVO);
        return a.b(c11, ", tokenizedEvent=", tVar, ")");
    }
}
