package ru.ozon.app.android.pdp.widgets.markdown.presentation;

import G.g;
import Lh.b;
import V.e;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import m10.InterfaceC8039a;
import m10.m;
import m10.o;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.atoms.utils.OzonSpannableString;

@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0011\b\u0087\b\u0018\u00002\u00060\u0001j\u0002`\u00022\u00020\u00032\u00020\u00042\u00020\u0005:\u0001(B1\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aR\u001a\u0010\u0007\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0006¢\u0006\f\n\u0004\b\n\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010!\u001a\u0004\b\"\u0010#R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010$\u001a\u0004\b%\u0010\u0012R\u001a\u0010&\u001a\u00020\r8\u0016X\u0096D¢\u0006\f\n\u0004\b&\u0010$\u001a\u0004\b'\u0010\u0012¨\u0006)"}, d2 = {"Lru/ozon/app/android/pdp/widgets/markdown/presentation/MarkdownVO;", "Ll20/c;", "Lru/ozon/app/android/composer/view/ViewObject;", "Lm10/a;", "Lm10/m;", "Lm10/o;", "", "id", "", "Lru/ozon/app/android/pdp/widgets/markdown/presentation/MarkdownVO$Characteristic;", "characteristics", "Lru/ozon/uni/atoms/utils/OzonSpannableString;", "description", "", "deeplink", "<init>", "(JLjava/util/List;Lru/ozon/uni/atoms/utils/OzonSpannableString;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Ljava/util/List;", "getCharacteristics", "()Ljava/util/List;", "Lru/ozon/uni/atoms/utils/OzonSpannableString;", "getDescription", "()Lru/ozon/uni/atoms/utils/OzonSpannableString;", "Ljava/lang/String;", "getDeeplink", "widgetName", "getWidgetName", "Characteristic", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class MarkdownVO implements c, InterfaceC8039a, m, o {

    @NotNull
    private final List<Characteristic> characteristics;
    private final String deeplink;
    private final OzonSpannableString description;
    private final long id;

    @NotNull
    private final String widgetName;

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0010\u001a\u0004\b\u0011\u0010\bR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0010\u001a\u0004\b\u0012\u0010\b¨\u0006\u0013"}, d2 = {"Lru/ozon/app/android/pdp/widgets/markdown/presentation/MarkdownVO$Characteristic;", "", "", AppMeasurementSdk.ConditionalUserProperty.NAME, AppMeasurementSdk.ConditionalUserProperty.VALUE, "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getName", "getValue", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Characteristic {

        @NotNull
        private final String name;

        @NotNull
        private final String value;

        public Characteristic(@NotNull String name, @NotNull String value) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(value, "value");
            this.name = name;
            this.value = value;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Characteristic)) {
                return false;
            }
            Characteristic characteristic = (Characteristic) other;
            return Intrinsics.d(this.name, characteristic.name) && Intrinsics.d(this.value, characteristic.value);
        }

        @NotNull
        public final String getName() {
            return this.name;
        }

        @NotNull
        public final String getValue() {
            return this.value;
        }

        public int hashCode() {
            return this.value.hashCode() + (this.name.hashCode() * 31);
        }

        @NotNull
        public String toString() {
            return e.a("Characteristic(name=", this.name, ", value=", this.value, ")");
        }
    }

    public MarkdownVO(long j11, @NotNull List<Characteristic> characteristics, OzonSpannableString ozonSpannableString, String str) {
        Intrinsics.checkNotNullParameter(characteristics, "characteristics");
        this.id = j11;
        this.characteristics = characteristics;
        this.description = ozonSpannableString;
        this.deeplink = str;
        this.widgetName = "pdp_markdown";
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MarkdownVO)) {
            return false;
        }
        MarkdownVO markdownVO = (MarkdownVO) other;
        return this.id == markdownVO.id && Intrinsics.d(this.characteristics, markdownVO.characteristics) && Intrinsics.d(this.description, markdownVO.description) && Intrinsics.d(this.deeplink, markdownVO.deeplink);
    }

    @NotNull
    public final List<Characteristic> getCharacteristics() {
        return this.characteristics;
    }

    public final String getDeeplink() {
        return this.deeplink;
    }

    public final OzonSpannableString getDescription() {
        return this.description;
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

    @Override // m10.o
    @NotNull
    public String getWidgetName() {
        return this.widgetName;
    }

    public int hashCode() {
        int b11 = g.b(Long.hashCode(this.id) * 31, 31, this.characteristics);
        OzonSpannableString ozonSpannableString = this.description;
        int hashCode = (b11 + (ozonSpannableString == null ? 0 : ozonSpannableString.hashCode())) * 31;
        String str = this.deeplink;
        return hashCode + (str != null ? str.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        long j11 = this.id;
        List<Characteristic> list = this.characteristics;
        OzonSpannableString ozonSpannableString = this.description;
        String str = this.deeplink;
        StringBuilder b11 = b.b(j11, "MarkdownVO(id=", ", characteristics=", list);
        b11.append(", description=");
        b11.append((Object) ozonSpannableString);
        b11.append(", deeplink=");
        b11.append(str);
        b11.append(")");
        return b11.toString();
    }
}
