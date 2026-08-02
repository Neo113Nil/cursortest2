package ru.ozon.app.android.common.filterWidgets.filters.presentation.textinputfilter;

import Ak.C2436a;
import B3.p;
import Bi.b;
import G.g;
import N3.C3660k;
import T7.P;
import WZ.t;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.marketing.widgets.hammersV3.newHammers.data.HammersV3BodyDTO;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.button.Icon;

@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u001d\b\u0080\b\u0018\u00002\u00060\u0001j\u0002`\u0002:\u00019Bk\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0014\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r\u0012\u000e\u0010\u0012\u001a\n\u0018\u00010\u0010j\u0004\u0018\u0001`\u0011\u0012\u0006\u0010\u0013\u001a\u00020\u0005\u0012\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u001aHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001f\u001a\u00020\u00142\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dHÖ\u0003¢\u0006\u0004\b\u001f\u0010 R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010!\u001a\u0004\b\"\u0010#R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010$\u001a\u0004\b%\u0010\u0019R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010&\u001a\u0004\b'\u0010(R\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\n\u0010)\u001a\u0004\b*\u0010+R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010,\u001a\u0004\b-\u0010.R%\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b\u000f\u0010/\u001a\u0004\b0\u00101R\u001f\u0010\u0012\u001a\n\u0018\u00010\u0010j\u0004\u0018\u0001`\u00118\u0006¢\u0006\f\n\u0004\b\u0012\u00102\u001a\u0004\b3\u00104R\u0017\u0010\u0013\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0013\u0010$\u001a\u0004\b5\u0010\u0019R\u0017\u0010\u0015\u001a\u00020\u00148\u0006¢\u0006\f\n\u0004\b\u0015\u00106\u001a\u0004\b7\u00108¨\u0006:"}, d2 = {"Lru/ozon/app/android/common/filterWidgets/filters/presentation/textinputfilter/TextInputFilterVO;", "Ll20/c;", "Lru/ozon/app/android/composer/view/ViewObject;", "", "id", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/uni/atoms/data/button/Icon;", "icon", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "action", "Lru/ozon/app/android/common/filterWidgets/filters/presentation/textinputfilter/TextInputFilterVO$Input;", "input", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "trackingInfo", "LWZ/t;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedEvent;", "tokenizedEvent", "originalUrl", "", "showSeparator", "<init>", "(JLjava/lang/String;Lru/ozon/uni/atoms/data/button/Icon;Lru/ozon/uni/atoms/data/AtomActionDTO;Lru/ozon/app/android/common/filterWidgets/filters/presentation/textinputfilter/TextInputFilterVO$Input;Ljava/util/Map;LWZ/t;Ljava/lang/String;Z)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Ljava/lang/String;", "getTitle", "Lru/ozon/uni/atoms/data/button/Icon;", "getIcon", "()Lru/ozon/uni/atoms/data/button/Icon;", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "getAction", "()Lru/ozon/uni/atoms/data/AtomActionDTO;", "Lru/ozon/app/android/common/filterWidgets/filters/presentation/textinputfilter/TextInputFilterVO$Input;", "getInput", "()Lru/ozon/app/android/common/filterWidgets/filters/presentation/textinputfilter/TextInputFilterVO$Input;", "Ljava/util/Map;", "getTrackingInfo", "()Ljava/util/Map;", "LWZ/t;", "getTokenizedEvent", "()LWZ/t;", "getOriginalUrl", "Z", "getShowSeparator", "()Z", "Input", "filter-widgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class TextInputFilterVO implements c {
    private final AtomActionDTO action;
    private final Icon icon;
    private final long id;

    @NotNull
    private final Input input;

    @NotNull
    private final String originalUrl;
    private final boolean showSeparator;
    private final String title;
    private final t tokenizedEvent;
    private final Map<String, TokenizedTrackingInfo> trackingInfo;

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\r\b\u0086\b\u0018\u00002\u00020\u0001BE\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0014\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\t\u0018\u00010\b¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\u000eR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0016\u001a\u0004\b\u0018\u0010\u000eR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0016\u001a\u0004\b\u0019\u0010\u000eR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR%\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\t\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\n\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f¨\u0006 "}, d2 = {"Lru/ozon/app/android/common/filterWidgets/filters/presentation/textinputfilter/TextInputFilterVO$Input;", "", "", HammersV3BodyDTO.PLACEHOLDER, "prefix", AppMeasurementSdk.ConditionalUserProperty.VALUE, "Lru/ozon/uni/atoms/data/AtomActionDTO;", "action", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "trackingInfo", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lru/ozon/uni/atoms/data/AtomActionDTO;Ljava/util/Map;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getPlaceholder", "getPrefix", "getValue", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "getAction", "()Lru/ozon/uni/atoms/data/AtomActionDTO;", "Ljava/util/Map;", "getTrackingInfo", "()Ljava/util/Map;", "filter-widgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Input {
        private final AtomActionDTO action;
        private final String placeholder;
        private final String prefix;
        private final Map<String, TokenizedTrackingInfo> trackingInfo;
        private final String value;

        public Input(String str, String str2, String str3, AtomActionDTO atomActionDTO, Map<String, TokenizedTrackingInfo> map) {
            this.placeholder = str;
            this.prefix = str2;
            this.value = str3;
            this.action = atomActionDTO;
            this.trackingInfo = map;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Input)) {
                return false;
            }
            Input input = (Input) other;
            return Intrinsics.d(this.placeholder, input.placeholder) && Intrinsics.d(this.prefix, input.prefix) && Intrinsics.d(this.value, input.value) && Intrinsics.d(this.action, input.action) && Intrinsics.d(this.trackingInfo, input.trackingInfo);
        }

        public final AtomActionDTO getAction() {
            return this.action;
        }

        public final String getPlaceholder() {
            return this.placeholder;
        }

        public final String getPrefix() {
            return this.prefix;
        }

        public final Map<String, TokenizedTrackingInfo> getTrackingInfo() {
            return this.trackingInfo;
        }

        public final String getValue() {
            return this.value;
        }

        public int hashCode() {
            String str = this.placeholder;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.prefix;
            int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.value;
            int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
            AtomActionDTO atomActionDTO = this.action;
            int hashCode4 = (hashCode3 + (atomActionDTO == null ? 0 : atomActionDTO.hashCode())) * 31;
            Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
            return hashCode4 + (map != null ? map.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            String str = this.placeholder;
            String str2 = this.prefix;
            String str3 = this.value;
            AtomActionDTO atomActionDTO = this.action;
            Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
            StringBuilder d11 = C3660k.d("Input(placeholder=", str, ", prefix=", str2, ", value=");
            p.c(str3, ", action=", ", trackingInfo=", d11, atomActionDTO);
            return P.f(d11, map, ")");
        }
    }

    public TextInputFilterVO(long j11, String str, Icon icon, AtomActionDTO atomActionDTO, @NotNull Input input, Map<String, TokenizedTrackingInfo> map, t tVar, @NotNull String originalUrl, boolean z11) {
        Intrinsics.checkNotNullParameter(input, "input");
        Intrinsics.checkNotNullParameter(originalUrl, "originalUrl");
        this.id = j11;
        this.title = str;
        this.icon = icon;
        this.action = atomActionDTO;
        this.input = input;
        this.trackingInfo = map;
        this.tokenizedEvent = tVar;
        this.originalUrl = originalUrl;
        this.showSeparator = z11;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TextInputFilterVO)) {
            return false;
        }
        TextInputFilterVO textInputFilterVO = (TextInputFilterVO) other;
        return this.id == textInputFilterVO.id && Intrinsics.d(this.title, textInputFilterVO.title) && Intrinsics.d(this.icon, textInputFilterVO.icon) && Intrinsics.d(this.action, textInputFilterVO.action) && Intrinsics.d(this.input, textInputFilterVO.input) && Intrinsics.d(this.trackingInfo, textInputFilterVO.trackingInfo) && Intrinsics.d(this.tokenizedEvent, textInputFilterVO.tokenizedEvent) && Intrinsics.d(this.originalUrl, textInputFilterVO.originalUrl) && this.showSeparator == textInputFilterVO.showSeparator;
    }

    public final AtomActionDTO getAction() {
        return this.action;
    }

    public final Icon getIcon() {
        return this.icon;
    }

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    @NotNull
    public final Input getInput() {
        return this.input;
    }

    @NotNull
    public final String getOriginalUrl() {
        return this.originalUrl;
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

    public final Map<String, TokenizedTrackingInfo> getTrackingInfo() {
        return this.trackingInfo;
    }

    @Override // l20.c
    public int getViewItemKey() {
        return hashCode();
    }

    public int hashCode() {
        int hashCode = Long.hashCode(this.id) * 31;
        String str = this.title;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        Icon icon = this.icon;
        int hashCode3 = (hashCode2 + (icon == null ? 0 : icon.hashCode())) * 31;
        AtomActionDTO atomActionDTO = this.action;
        int hashCode4 = (this.input.hashCode() + ((hashCode3 + (atomActionDTO == null ? 0 : atomActionDTO.hashCode())) * 31)) * 31;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        int hashCode5 = (hashCode4 + (map == null ? 0 : map.hashCode())) * 31;
        t tVar = this.tokenizedEvent;
        return Boolean.hashCode(this.showSeparator) + g.a((hashCode5 + (tVar != null ? tVar.hashCode() : 0)) * 31, 31, this.originalUrl);
    }

    @NotNull
    public String toString() {
        long j11 = this.id;
        String str = this.title;
        Icon icon = this.icon;
        AtomActionDTO atomActionDTO = this.action;
        Input input = this.input;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        t tVar = this.tokenizedEvent;
        String str2 = this.originalUrl;
        boolean z11 = this.showSeparator;
        StringBuilder c11 = C2436a.c(j11, "TextInputFilterVO(id=", ", title=", str);
        c11.append(", icon=");
        c11.append(icon);
        c11.append(", action=");
        c11.append(atomActionDTO);
        c11.append(", input=");
        c11.append(input);
        c11.append(", trackingInfo=");
        c11.append(map);
        c11.append(", tokenizedEvent=");
        c11.append(tVar);
        c11.append(", originalUrl=");
        c11.append(str2);
        return b.f(c11, ", showSeparator=", z11, ")");
    }
}
