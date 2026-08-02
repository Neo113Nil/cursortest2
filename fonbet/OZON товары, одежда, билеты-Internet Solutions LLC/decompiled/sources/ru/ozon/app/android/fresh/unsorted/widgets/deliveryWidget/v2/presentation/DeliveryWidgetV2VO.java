package ru.ozon.app.android.fresh.unsorted.widgets.deliveryWidget.v2.presentation;

import An.C2439a;
import B90.C2618u;
import C.C2702w;
import C.o0;
import D3.h;
import E0.C2942q;
import G.g;
import Ve.C4598rp;
import WZ.t;
import Xc.a;
import Xc.b;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.K;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.button.Icon;
import ru.ozon.uni.atoms.data.text.TextDTO;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b1\u0018\u00002\u00060\u0001j\u0002`\u0002:\u0005\u0019\u001a\u001b\u001c\u001dB5\b\u0004\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fR\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0006\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R \u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\b\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001c\u0010\n\u001a\u0004\u0018\u00010\t8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\n\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018\u0082\u0001\u0003\u001e\u001f ¨\u0006!"}, d2 = {"Lru/ozon/app/android/fresh/unsorted/widgets/deliveryWidget/v2/presentation/DeliveryWidgetV2VO;", "Ll20/c;", "Lru/ozon/app/android/composer/view/ViewObject;", "Ll20/d;", "widgetInfo", "", "lifetimeSeconds", "", "availableDeliverySchemas", "LWZ/t;", "tokenizedEvent", "<init>", "(Ll20/d;JLjava/util/List;LWZ/t;)V", "Ll20/d;", "getWidgetInfo", "()Ll20/d;", "J", "getLifetimeSeconds", "()J", "Ljava/util/List;", "getAvailableDeliverySchemas", "()Ljava/util/List;", "LWZ/t;", "getTokenizedEvent", "()LWZ/t;", "ProgressVO", "MethodVO", "HiddenStateVOWidget", "OzonDeliveryVOWidget", "SellerVOWidget", "Lru/ozon/app/android/fresh/unsorted/widgets/deliveryWidget/v2/presentation/DeliveryWidgetV2VO$HiddenStateVOWidget;", "Lru/ozon/app/android/fresh/unsorted/widgets/deliveryWidget/v2/presentation/DeliveryWidgetV2VO$OzonDeliveryVOWidget;", "Lru/ozon/app/android/fresh/unsorted/widgets/deliveryWidget/v2/presentation/DeliveryWidgetV2VO$SellerVOWidget;", "widgets-unsorted_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public abstract class DeliveryWidgetV2VO implements c {

    @NotNull
    private final List<Long> availableDeliverySchemas;
    private final long lifetimeSeconds;
    private final t tokenizedEvent;

    @NotNull
    private final d widgetInfo;

    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\b\u0081\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0004\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0016\u001a\u0004\b\u0019\u0010\u0018R\u001a\u0010\u0006\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR \u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\b\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f¨\u0006 "}, d2 = {"Lru/ozon/app/android/fresh/unsorted/widgets/deliveryWidget/v2/presentation/DeliveryWidgetV2VO$HiddenStateVOWidget;", "Lru/ozon/app/android/fresh/unsorted/widgets/deliveryWidget/v2/presentation/DeliveryWidgetV2VO;", "", "id", "lifetimeSeconds", "Ll20/d;", "widgetInfo", "", "availableDeliverySchemas", "<init>", "(JJLl20/d;Ljava/util/List;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "getLifetimeSeconds", "Ll20/d;", "getWidgetInfo", "()Ll20/d;", "Ljava/util/List;", "getAvailableDeliverySchemas", "()Ljava/util/List;", "widgets-unsorted_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class HiddenStateVOWidget extends DeliveryWidgetV2VO {

        @NotNull
        private final List<Long> availableDeliverySchemas;
        private final long id;
        private final long lifetimeSeconds;

        @NotNull
        private final d widgetInfo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public HiddenStateVOWidget(long j11, long j12, @NotNull d widgetInfo, @NotNull List<Long> availableDeliverySchemas) {
            super(widgetInfo, j12, availableDeliverySchemas, null, 8, null);
            Intrinsics.checkNotNullParameter(widgetInfo, "widgetInfo");
            Intrinsics.checkNotNullParameter(availableDeliverySchemas, "availableDeliverySchemas");
            this.id = j11;
            this.lifetimeSeconds = j12;
            this.widgetInfo = widgetInfo;
            this.availableDeliverySchemas = availableDeliverySchemas;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof HiddenStateVOWidget)) {
                return false;
            }
            HiddenStateVOWidget hiddenStateVOWidget = (HiddenStateVOWidget) other;
            return this.id == hiddenStateVOWidget.id && this.lifetimeSeconds == hiddenStateVOWidget.lifetimeSeconds && Intrinsics.d(this.widgetInfo, hiddenStateVOWidget.widgetInfo) && Intrinsics.d(this.availableDeliverySchemas, hiddenStateVOWidget.availableDeliverySchemas);
        }

        @Override // ru.ozon.app.android.fresh.unsorted.widgets.deliveryWidget.v2.presentation.DeliveryWidgetV2VO
        @NotNull
        public List<Long> getAvailableDeliverySchemas() {
            return this.availableDeliverySchemas;
        }

        @Override // l20.c
        public long getId() {
            return this.id;
        }

        @Override // ru.ozon.app.android.fresh.unsorted.widgets.deliveryWidget.v2.presentation.DeliveryWidgetV2VO
        public long getLifetimeSeconds() {
            return this.lifetimeSeconds;
        }

        @Override // ru.ozon.app.android.fresh.unsorted.widgets.deliveryWidget.v2.presentation.DeliveryWidgetV2VO
        @NotNull
        public d getWidgetInfo() {
            return this.widgetInfo;
        }

        public int hashCode() {
            return this.availableDeliverySchemas.hashCode() + ((this.widgetInfo.hashCode() + Pk0.c.a(Long.hashCode(this.id) * 31, 31, this.lifetimeSeconds)) * 31);
        }

        @NotNull
        public String toString() {
            long j11 = this.id;
            long j12 = this.lifetimeSeconds;
            d dVar = this.widgetInfo;
            List<Long> list = this.availableDeliverySchemas;
            StringBuilder d11 = C2702w.d(j11, "HiddenStateVOWidget(id=", ", lifetimeSeconds=");
            d11.append(j12);
            d11.append(", widgetInfo=");
            d11.append(dVar);
            return h.c(d11, ", availableDeliverySchemas=", list, ")");
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lru/ozon/app/android/fresh/unsorted/widgets/deliveryWidget/v2/presentation/DeliveryWidgetV2VO$MethodVO;", "", "<init>", "(Ljava/lang/String;I)V", "GROSS", "NON_GROSS", "UNDEFINED", "widgets-unsorted_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class MethodVO {
        private static final /* synthetic */ a $ENTRIES;
        private static final /* synthetic */ MethodVO[] $VALUES;
        public static final MethodVO GROSS = new MethodVO("GROSS", 0);
        public static final MethodVO NON_GROSS = new MethodVO("NON_GROSS", 1);
        public static final MethodVO UNDEFINED = new MethodVO("UNDEFINED", 2);

        private static final /* synthetic */ MethodVO[] $values() {
            return new MethodVO[]{GROSS, NON_GROSS, UNDEFINED};
        }

        static {
            MethodVO[] $values = $values();
            $VALUES = $values;
            $ENTRIES = b.a($values);
        }

        private MethodVO(String str, int i11) {
        }

        public static MethodVO valueOf(String str) {
            return (MethodVO) Enum.valueOf(MethodVO.class, str);
        }

        public static MethodVO[] values() {
            return (MethodVO[]) $VALUES.clone();
        }
    }

    @Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\"\b\u0081\b\u0018\u00002\u00020\u0001By\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\t\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u000f\u001a\u00020\t\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0014\u001a\u00020\u0012\u0012\u0006\u0010\u0016\u001a\u00020\u0015\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001e\u001a\u00020\u001dHÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u001a\u0010#\u001a\u00020\"2\b\u0010!\u001a\u0004\u0018\u00010 HÖ\u0003¢\u0006\u0004\b#\u0010$R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010%\u001a\u0004\b&\u0010'R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010(\u001a\u0004\b)\u0010*R\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010(\u001a\u0004\b+\u0010*R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010,\u001a\u0004\b-\u0010.R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010/\u001a\u0004\b0\u0010\u001cR\u0017\u0010\u000b\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u000b\u0010/\u001a\u0004\b1\u0010\u001cR\u0017\u0010\f\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\f\u0010/\u001a\u0004\b2\u0010\u001cR\u0017\u0010\u000e\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b\u000e\u00103\u001a\u0004\b4\u00105R\u0017\u0010\u000f\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u000f\u0010/\u001a\u0004\b6\u0010\u001cR\u0017\u0010\u0011\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\b\u0011\u00107\u001a\u0004\b8\u00109R\u001a\u0010\u0013\u001a\u00020\u00128\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0013\u0010:\u001a\u0004\b;\u0010<R\u001a\u0010\u0014\u001a\u00020\u00128\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0014\u0010:\u001a\u0004\b=\u0010<R\u001a\u0010\u0016\u001a\u00020\u00158\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0016\u0010>\u001a\u0004\b?\u0010@R\u001c\u0010\u0018\u001a\u0004\u0018\u00010\u00178\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0018\u0010A\u001a\u0004\bB\u0010C¨\u0006D"}, d2 = {"Lru/ozon/app/android/fresh/unsorted/widgets/deliveryWidget/v2/presentation/DeliveryWidgetV2VO$OzonDeliveryVOWidget;", "Lru/ozon/app/android/fresh/unsorted/widgets/deliveryWidget/v2/presentation/DeliveryWidgetV2VO;", "Lru/ozon/app/android/fresh/unsorted/widgets/deliveryWidget/v2/presentation/DeliveryWidgetV2VO$MethodVO;", "method", "Lru/ozon/uni/atoms/data/text/TextDTO;", SelectionItemFormDTO.TITLE_FIELD_NAME, "subtitle", "Lru/ozon/uni/atoms/data/button/Icon;", "infoIcon", "", "statusIcon", "statusCircleColor", "statusIconColor", "Lru/ozon/app/android/fresh/unsorted/widgets/deliveryWidget/v2/presentation/DeliveryWidgetV2VO$ProgressVO;", "progress", "asyncData", "Lru/ozon/uni/atoms/af/AtomAction;", "onWidgetClickAction", "", "id", "lifetimeSeconds", "Ll20/d;", "widgetInfo", "LWZ/t;", "tokenizedEvent", "<init>", "(Lru/ozon/app/android/fresh/unsorted/widgets/deliveryWidget/v2/presentation/DeliveryWidgetV2VO$MethodVO;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/button/Icon;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lru/ozon/app/android/fresh/unsorted/widgets/deliveryWidget/v2/presentation/DeliveryWidgetV2VO$ProgressVO;Ljava/lang/String;Lru/ozon/uni/atoms/af/AtomAction;JJLl20/d;LWZ/t;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/app/android/fresh/unsorted/widgets/deliveryWidget/v2/presentation/DeliveryWidgetV2VO$MethodVO;", "getMethod", "()Lru/ozon/app/android/fresh/unsorted/widgets/deliveryWidget/v2/presentation/DeliveryWidgetV2VO$MethodVO;", "Lru/ozon/uni/atoms/data/text/TextDTO;", "getTitle", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "getSubtitle", "Lru/ozon/uni/atoms/data/button/Icon;", "getInfoIcon", "()Lru/ozon/uni/atoms/data/button/Icon;", "Ljava/lang/String;", "getStatusIcon", "getStatusCircleColor", "getStatusIconColor", "Lru/ozon/app/android/fresh/unsorted/widgets/deliveryWidget/v2/presentation/DeliveryWidgetV2VO$ProgressVO;", "getProgress", "()Lru/ozon/app/android/fresh/unsorted/widgets/deliveryWidget/v2/presentation/DeliveryWidgetV2VO$ProgressVO;", "getAsyncData", "Lru/ozon/uni/atoms/af/AtomAction;", "getOnWidgetClickAction", "()Lru/ozon/uni/atoms/af/AtomAction;", "J", "getId", "()J", "getLifetimeSeconds", "Ll20/d;", "getWidgetInfo", "()Ll20/d;", "LWZ/t;", "getTokenizedEvent", "()LWZ/t;", "widgets-unsorted_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class OzonDeliveryVOWidget extends DeliveryWidgetV2VO {

        @NotNull
        private final String asyncData;
        private final long id;

        @NotNull
        private final Icon infoIcon;
        private final long lifetimeSeconds;

        @NotNull
        private final MethodVO method;

        @NotNull
        private final AtomAction onWidgetClickAction;

        @NotNull
        private final ProgressVO progress;

        @NotNull
        private final String statusCircleColor;

        @NotNull
        private final String statusIcon;

        @NotNull
        private final String statusIconColor;

        @NotNull
        private final TextDTO subtitle;

        @NotNull
        private final TextDTO title;
        private final t tokenizedEvent;

        @NotNull
        private final d widgetInfo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OzonDeliveryVOWidget(@NotNull MethodVO method, @NotNull TextDTO title, @NotNull TextDTO subtitle, @NotNull Icon infoIcon, @NotNull String statusIcon, @NotNull String statusCircleColor, @NotNull String statusIconColor, @NotNull ProgressVO progress, @NotNull String asyncData, @NotNull AtomAction onWidgetClickAction, long j11, long j12, @NotNull d widgetInfo, t tVar) {
            super(widgetInfo, j12, null, tVar, 4, null);
            Intrinsics.checkNotNullParameter(method, "method");
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(subtitle, "subtitle");
            Intrinsics.checkNotNullParameter(infoIcon, "infoIcon");
            Intrinsics.checkNotNullParameter(statusIcon, "statusIcon");
            Intrinsics.checkNotNullParameter(statusCircleColor, "statusCircleColor");
            Intrinsics.checkNotNullParameter(statusIconColor, "statusIconColor");
            Intrinsics.checkNotNullParameter(progress, "progress");
            Intrinsics.checkNotNullParameter(asyncData, "asyncData");
            Intrinsics.checkNotNullParameter(onWidgetClickAction, "onWidgetClickAction");
            Intrinsics.checkNotNullParameter(widgetInfo, "widgetInfo");
            this.method = method;
            this.title = title;
            this.subtitle = subtitle;
            this.infoIcon = infoIcon;
            this.statusIcon = statusIcon;
            this.statusCircleColor = statusCircleColor;
            this.statusIconColor = statusIconColor;
            this.progress = progress;
            this.asyncData = asyncData;
            this.onWidgetClickAction = onWidgetClickAction;
            this.id = j11;
            this.lifetimeSeconds = j12;
            this.widgetInfo = widgetInfo;
            this.tokenizedEvent = tVar;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof OzonDeliveryVOWidget)) {
                return false;
            }
            OzonDeliveryVOWidget ozonDeliveryVOWidget = (OzonDeliveryVOWidget) other;
            return this.method == ozonDeliveryVOWidget.method && Intrinsics.d(this.title, ozonDeliveryVOWidget.title) && Intrinsics.d(this.subtitle, ozonDeliveryVOWidget.subtitle) && Intrinsics.d(this.infoIcon, ozonDeliveryVOWidget.infoIcon) && Intrinsics.d(this.statusIcon, ozonDeliveryVOWidget.statusIcon) && Intrinsics.d(this.statusCircleColor, ozonDeliveryVOWidget.statusCircleColor) && Intrinsics.d(this.statusIconColor, ozonDeliveryVOWidget.statusIconColor) && Intrinsics.d(this.progress, ozonDeliveryVOWidget.progress) && Intrinsics.d(this.asyncData, ozonDeliveryVOWidget.asyncData) && Intrinsics.d(this.onWidgetClickAction, ozonDeliveryVOWidget.onWidgetClickAction) && this.id == ozonDeliveryVOWidget.id && this.lifetimeSeconds == ozonDeliveryVOWidget.lifetimeSeconds && Intrinsics.d(this.widgetInfo, ozonDeliveryVOWidget.widgetInfo) && Intrinsics.d(this.tokenizedEvent, ozonDeliveryVOWidget.tokenizedEvent);
        }

        @Override // l20.c
        public long getId() {
            return this.id;
        }

        @NotNull
        public final Icon getInfoIcon() {
            return this.infoIcon;
        }

        @Override // ru.ozon.app.android.fresh.unsorted.widgets.deliveryWidget.v2.presentation.DeliveryWidgetV2VO
        public long getLifetimeSeconds() {
            return this.lifetimeSeconds;
        }

        @NotNull
        public final MethodVO getMethod() {
            return this.method;
        }

        @NotNull
        public final AtomAction getOnWidgetClickAction() {
            return this.onWidgetClickAction;
        }

        @NotNull
        public final ProgressVO getProgress() {
            return this.progress;
        }

        @NotNull
        public final String getStatusCircleColor() {
            return this.statusCircleColor;
        }

        @NotNull
        public final String getStatusIcon() {
            return this.statusIcon;
        }

        @NotNull
        public final String getStatusIconColor() {
            return this.statusIconColor;
        }

        @NotNull
        public final TextDTO getSubtitle() {
            return this.subtitle;
        }

        @NotNull
        public final TextDTO getTitle() {
            return this.title;
        }

        public t getTokenizedEvent() {
            return this.tokenizedEvent;
        }

        @Override // ru.ozon.app.android.fresh.unsorted.widgets.deliveryWidget.v2.presentation.DeliveryWidgetV2VO
        @NotNull
        public d getWidgetInfo() {
            return this.widgetInfo;
        }

        public int hashCode() {
            int hashCode = (this.widgetInfo.hashCode() + Pk0.c.a(Pk0.c.a(C4598rp.a(this.onWidgetClickAction, g.a((this.progress.hashCode() + g.a(g.a(g.a(Lc.a.a(this.infoIcon, Ns.b.a(this.subtitle, Ns.b.a(this.title, this.method.hashCode() * 31, 31), 31), 31), 31, this.statusIcon), 31, this.statusCircleColor), 31, this.statusIconColor)) * 31, 31, this.asyncData), 31), 31, this.id), 31, this.lifetimeSeconds)) * 31;
            t tVar = this.tokenizedEvent;
            return hashCode + (tVar == null ? 0 : tVar.hashCode());
        }

        @NotNull
        public String toString() {
            MethodVO methodVO = this.method;
            TextDTO textDTO = this.title;
            TextDTO textDTO2 = this.subtitle;
            Icon icon = this.infoIcon;
            String str = this.statusIcon;
            String str2 = this.statusCircleColor;
            String str3 = this.statusIconColor;
            ProgressVO progressVO = this.progress;
            String str4 = this.asyncData;
            AtomAction atomAction = this.onWidgetClickAction;
            long j11 = this.id;
            long j12 = this.lifetimeSeconds;
            d dVar = this.widgetInfo;
            t tVar = this.tokenizedEvent;
            StringBuilder sb2 = new StringBuilder("OzonDeliveryVOWidget(method=");
            sb2.append(methodVO);
            sb2.append(", title=");
            sb2.append(textDTO);
            sb2.append(", subtitle=");
            sb2.append(textDTO2);
            sb2.append(", infoIcon=");
            sb2.append(icon);
            sb2.append(", statusIcon=");
            Nh.a.h(sb2, str, ", statusCircleColor=", str2, ", statusIconColor=");
            sb2.append(str3);
            sb2.append(", progress=");
            sb2.append(progressVO);
            sb2.append(", asyncData=");
            Ns.b.d(str4, ", onWidgetClickAction=", ", id=", sb2, atomAction);
            sb2.append(j11);
            C2942q.f(sb2, ", lifetimeSeconds=", j12, ", widgetInfo=");
            sb2.append(dVar);
            sb2.append(", tokenizedEvent=");
            sb2.append(tVar);
            sb2.append(")");
            return sb2.toString();
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0081\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0015\u001a\u0004\b\u0016\u0010\nR\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0015\u001a\u0004\b\u0017\u0010\n¨\u0006\u0018"}, d2 = {"Lru/ozon/app/android/fresh/unsorted/widgets/deliveryWidget/v2/presentation/DeliveryWidgetV2VO$ProgressVO;", "", "", "progress", "", "ringProgressColor", "ringBackgroundColor", "<init>", "(FLjava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "F", "getProgress", "()F", "Ljava/lang/String;", "getRingProgressColor", "getRingBackgroundColor", "widgets-unsorted_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class ProgressVO {
        private final float progress;

        @NotNull
        private final String ringBackgroundColor;

        @NotNull
        private final String ringProgressColor;

        public ProgressVO(float f7, @NotNull String ringProgressColor, @NotNull String ringBackgroundColor) {
            Intrinsics.checkNotNullParameter(ringProgressColor, "ringProgressColor");
            Intrinsics.checkNotNullParameter(ringBackgroundColor, "ringBackgroundColor");
            this.progress = f7;
            this.ringProgressColor = ringProgressColor;
            this.ringBackgroundColor = ringBackgroundColor;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ProgressVO)) {
                return false;
            }
            ProgressVO progressVO = (ProgressVO) other;
            return Float.compare(this.progress, progressVO.progress) == 0 && Intrinsics.d(this.ringProgressColor, progressVO.ringProgressColor) && Intrinsics.d(this.ringBackgroundColor, progressVO.ringBackgroundColor);
        }

        public final float getProgress() {
            return this.progress;
        }

        @NotNull
        public final String getRingBackgroundColor() {
            return this.ringBackgroundColor;
        }

        @NotNull
        public final String getRingProgressColor() {
            return this.ringProgressColor;
        }

        public int hashCode() {
            return this.ringBackgroundColor.hashCode() + g.a(Float.hashCode(this.progress) * 31, 31, this.ringProgressColor);
        }

        @NotNull
        public String toString() {
            float f7 = this.progress;
            String str = this.ringProgressColor;
            String str2 = this.ringBackgroundColor;
            StringBuilder sb2 = new StringBuilder("ProgressVO(progress=");
            sb2.append(f7);
            sb2.append(", ringProgressColor=");
            sb2.append(str);
            sb2.append(", ringBackgroundColor=");
            return o0.c(sb2, str2, ")");
        }
    }

    @Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b$\b\u0081\b\u0018\u00002\u00020\u0001B\u0091\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\t\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u000f\u001a\u00020\t\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0002\u0012\u0006\u0010\u0014\u001a\u00020\u0002\u0012\u0006\u0010\u0016\u001a\u00020\u0015\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017\u0012\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00020\u0019¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010 \u001a\u00020\u001fHÖ\u0001¢\u0006\u0004\b \u0010!J\u001a\u0010%\u001a\u00020$2\b\u0010#\u001a\u0004\u0018\u00010\"HÖ\u0003¢\u0006\u0004\b%\u0010&R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010'\u001a\u0004\b(\u0010)R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010*\u001a\u0004\b+\u0010,R\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010*\u001a\u0004\b-\u0010,R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010.\u001a\u0004\b/\u00100R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u00101\u001a\u0004\b2\u0010\u001eR\u0017\u0010\u000b\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u000b\u00101\u001a\u0004\b3\u0010\u001eR\u0017\u0010\f\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\f\u00101\u001a\u0004\b4\u0010\u001eR\u0017\u0010\u000e\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b\u000e\u00105\u001a\u0004\b6\u00107R\u0017\u0010\u000f\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u000f\u00101\u001a\u0004\b8\u0010\u001eR\u0017\u0010\u0011\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\b\u0011\u00109\u001a\u0004\b:\u0010;R\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00108\u0006¢\u0006\f\n\u0004\b\u0012\u00109\u001a\u0004\b<\u0010;R\u001a\u0010\u0013\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0013\u0010'\u001a\u0004\b=\u0010)R\u001a\u0010\u0014\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0014\u0010'\u001a\u0004\b>\u0010)R\u001a\u0010\u0016\u001a\u00020\u00158\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0016\u0010?\u001a\u0004\b@\u0010AR\u001c\u0010\u0018\u001a\u0004\u0018\u00010\u00178\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0018\u0010B\u001a\u0004\bC\u0010DR \u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00020\u00198\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001a\u0010E\u001a\u0004\bF\u0010G¨\u0006H"}, d2 = {"Lru/ozon/app/android/fresh/unsorted/widgets/deliveryWidget/v2/presentation/DeliveryWidgetV2VO$SellerVOWidget;", "Lru/ozon/app/android/fresh/unsorted/widgets/deliveryWidget/v2/presentation/DeliveryWidgetV2VO;", "", "sellerId", "Lru/ozon/uni/atoms/data/text/TextDTO;", SelectionItemFormDTO.TITLE_FIELD_NAME, "subtitle", "Lru/ozon/app/android/fresh/unsorted/widgets/deliveryWidget/v2/presentation/DeliveryWidgetV2VO$ProgressVO;", "progress", "", "statusIcon", "statusIconColor", "statusCircleColor", "Lru/ozon/uni/atoms/data/button/Icon;", "infoIcon", "asyncData", "Lru/ozon/uni/atoms/af/AtomAction;", "onWidgetClickAction", "forceAction", "id", "lifetimeSeconds", "Ll20/d;", "widgetInfo", "LWZ/t;", "tokenizedEvent", "", "availableDeliverySchemas", "<init>", "(JLru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/app/android/fresh/unsorted/widgets/deliveryWidget/v2/presentation/DeliveryWidgetV2VO$ProgressVO;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lru/ozon/uni/atoms/data/button/Icon;Ljava/lang/String;Lru/ozon/uni/atoms/af/AtomAction;Lru/ozon/uni/atoms/af/AtomAction;JJLl20/d;LWZ/t;Ljava/util/List;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getSellerId", "()J", "Lru/ozon/uni/atoms/data/text/TextDTO;", "getTitle", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "getSubtitle", "Lru/ozon/app/android/fresh/unsorted/widgets/deliveryWidget/v2/presentation/DeliveryWidgetV2VO$ProgressVO;", "getProgress", "()Lru/ozon/app/android/fresh/unsorted/widgets/deliveryWidget/v2/presentation/DeliveryWidgetV2VO$ProgressVO;", "Ljava/lang/String;", "getStatusIcon", "getStatusIconColor", "getStatusCircleColor", "Lru/ozon/uni/atoms/data/button/Icon;", "getInfoIcon", "()Lru/ozon/uni/atoms/data/button/Icon;", "getAsyncData", "Lru/ozon/uni/atoms/af/AtomAction;", "getOnWidgetClickAction", "()Lru/ozon/uni/atoms/af/AtomAction;", "getForceAction", "getId", "getLifetimeSeconds", "Ll20/d;", "getWidgetInfo", "()Ll20/d;", "LWZ/t;", "getTokenizedEvent", "()LWZ/t;", "Ljava/util/List;", "getAvailableDeliverySchemas", "()Ljava/util/List;", "widgets-unsorted_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class SellerVOWidget extends DeliveryWidgetV2VO {

        @NotNull
        private final String asyncData;

        @NotNull
        private final List<Long> availableDeliverySchemas;
        private final AtomAction forceAction;
        private final long id;

        @NotNull
        private final Icon infoIcon;
        private final long lifetimeSeconds;

        @NotNull
        private final AtomAction onWidgetClickAction;

        @NotNull
        private final ProgressVO progress;
        private final long sellerId;

        @NotNull
        private final String statusCircleColor;

        @NotNull
        private final String statusIcon;

        @NotNull
        private final String statusIconColor;

        @NotNull
        private final TextDTO subtitle;

        @NotNull
        private final TextDTO title;
        private final t tokenizedEvent;

        @NotNull
        private final d widgetInfo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SellerVOWidget(long j11, @NotNull TextDTO title, @NotNull TextDTO subtitle, @NotNull ProgressVO progress, @NotNull String statusIcon, @NotNull String statusIconColor, @NotNull String statusCircleColor, @NotNull Icon infoIcon, @NotNull String asyncData, @NotNull AtomAction onWidgetClickAction, AtomAction atomAction, long j12, long j13, @NotNull d widgetInfo, t tVar, @NotNull List<Long> availableDeliverySchemas) {
            super(widgetInfo, j13, availableDeliverySchemas, tVar, null);
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(subtitle, "subtitle");
            Intrinsics.checkNotNullParameter(progress, "progress");
            Intrinsics.checkNotNullParameter(statusIcon, "statusIcon");
            Intrinsics.checkNotNullParameter(statusIconColor, "statusIconColor");
            Intrinsics.checkNotNullParameter(statusCircleColor, "statusCircleColor");
            Intrinsics.checkNotNullParameter(infoIcon, "infoIcon");
            Intrinsics.checkNotNullParameter(asyncData, "asyncData");
            Intrinsics.checkNotNullParameter(onWidgetClickAction, "onWidgetClickAction");
            Intrinsics.checkNotNullParameter(widgetInfo, "widgetInfo");
            Intrinsics.checkNotNullParameter(availableDeliverySchemas, "availableDeliverySchemas");
            this.sellerId = j11;
            this.title = title;
            this.subtitle = subtitle;
            this.progress = progress;
            this.statusIcon = statusIcon;
            this.statusIconColor = statusIconColor;
            this.statusCircleColor = statusCircleColor;
            this.infoIcon = infoIcon;
            this.asyncData = asyncData;
            this.onWidgetClickAction = onWidgetClickAction;
            this.forceAction = atomAction;
            this.id = j12;
            this.lifetimeSeconds = j13;
            this.widgetInfo = widgetInfo;
            this.tokenizedEvent = tVar;
            this.availableDeliverySchemas = availableDeliverySchemas;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof SellerVOWidget)) {
                return false;
            }
            SellerVOWidget sellerVOWidget = (SellerVOWidget) other;
            return this.sellerId == sellerVOWidget.sellerId && Intrinsics.d(this.title, sellerVOWidget.title) && Intrinsics.d(this.subtitle, sellerVOWidget.subtitle) && Intrinsics.d(this.progress, sellerVOWidget.progress) && Intrinsics.d(this.statusIcon, sellerVOWidget.statusIcon) && Intrinsics.d(this.statusIconColor, sellerVOWidget.statusIconColor) && Intrinsics.d(this.statusCircleColor, sellerVOWidget.statusCircleColor) && Intrinsics.d(this.infoIcon, sellerVOWidget.infoIcon) && Intrinsics.d(this.asyncData, sellerVOWidget.asyncData) && Intrinsics.d(this.onWidgetClickAction, sellerVOWidget.onWidgetClickAction) && Intrinsics.d(this.forceAction, sellerVOWidget.forceAction) && this.id == sellerVOWidget.id && this.lifetimeSeconds == sellerVOWidget.lifetimeSeconds && Intrinsics.d(this.widgetInfo, sellerVOWidget.widgetInfo) && Intrinsics.d(this.tokenizedEvent, sellerVOWidget.tokenizedEvent) && Intrinsics.d(this.availableDeliverySchemas, sellerVOWidget.availableDeliverySchemas);
        }

        @Override // ru.ozon.app.android.fresh.unsorted.widgets.deliveryWidget.v2.presentation.DeliveryWidgetV2VO
        @NotNull
        public List<Long> getAvailableDeliverySchemas() {
            return this.availableDeliverySchemas;
        }

        public final AtomAction getForceAction() {
            return this.forceAction;
        }

        @Override // l20.c
        public long getId() {
            return this.id;
        }

        @NotNull
        public final Icon getInfoIcon() {
            return this.infoIcon;
        }

        @Override // ru.ozon.app.android.fresh.unsorted.widgets.deliveryWidget.v2.presentation.DeliveryWidgetV2VO
        public long getLifetimeSeconds() {
            return this.lifetimeSeconds;
        }

        @NotNull
        public final AtomAction getOnWidgetClickAction() {
            return this.onWidgetClickAction;
        }

        @NotNull
        public final ProgressVO getProgress() {
            return this.progress;
        }

        @NotNull
        public final String getStatusCircleColor() {
            return this.statusCircleColor;
        }

        @NotNull
        public final String getStatusIcon() {
            return this.statusIcon;
        }

        @NotNull
        public final String getStatusIconColor() {
            return this.statusIconColor;
        }

        @NotNull
        public final TextDTO getSubtitle() {
            return this.subtitle;
        }

        @NotNull
        public final TextDTO getTitle() {
            return this.title;
        }

        public t getTokenizedEvent() {
            return this.tokenizedEvent;
        }

        @Override // ru.ozon.app.android.fresh.unsorted.widgets.deliveryWidget.v2.presentation.DeliveryWidgetV2VO
        @NotNull
        public d getWidgetInfo() {
            return this.widgetInfo;
        }

        public int hashCode() {
            int a11 = C4598rp.a(this.onWidgetClickAction, g.a(Lc.a.a(this.infoIcon, g.a(g.a(g.a((this.progress.hashCode() + Ns.b.a(this.subtitle, Ns.b.a(this.title, Long.hashCode(this.sellerId) * 31, 31), 31)) * 31, 31, this.statusIcon), 31, this.statusIconColor), 31, this.statusCircleColor), 31), 31, this.asyncData), 31);
            AtomAction atomAction = this.forceAction;
            int hashCode = (this.widgetInfo.hashCode() + Pk0.c.a(Pk0.c.a((a11 + (atomAction == null ? 0 : atomAction.hashCode())) * 31, 31, this.id), 31, this.lifetimeSeconds)) * 31;
            t tVar = this.tokenizedEvent;
            return this.availableDeliverySchemas.hashCode() + ((hashCode + (tVar != null ? tVar.hashCode() : 0)) * 31);
        }

        @NotNull
        public String toString() {
            long j11 = this.sellerId;
            TextDTO textDTO = this.title;
            TextDTO textDTO2 = this.subtitle;
            ProgressVO progressVO = this.progress;
            String str = this.statusIcon;
            String str2 = this.statusIconColor;
            String str3 = this.statusCircleColor;
            Icon icon = this.infoIcon;
            String str4 = this.asyncData;
            AtomAction atomAction = this.onWidgetClickAction;
            AtomAction atomAction2 = this.forceAction;
            long j12 = this.id;
            long j13 = this.lifetimeSeconds;
            d dVar = this.widgetInfo;
            t tVar = this.tokenizedEvent;
            List<Long> list = this.availableDeliverySchemas;
            StringBuilder b11 = TY.a.b("SellerVOWidget(sellerId=", j11, ", title=", textDTO);
            b11.append(", subtitle=");
            b11.append(textDTO2);
            b11.append(", progress=");
            b11.append(progressVO);
            Nh.a.h(b11, ", statusIcon=", str, ", statusIconColor=", str2);
            b11.append(", statusCircleColor=");
            b11.append(str3);
            b11.append(", infoIcon=");
            b11.append(icon);
            C2439a.c(", asyncData=", str4, ", onWidgetClickAction=", b11, atomAction);
            b11.append(", forceAction=");
            b11.append(atomAction2);
            b11.append(", id=");
            b11.append(j12);
            C2942q.f(b11, ", lifetimeSeconds=", j13, ", widgetInfo=");
            b11.append(dVar);
            b11.append(", tokenizedEvent=");
            b11.append(tVar);
            b11.append(", availableDeliverySchemas=");
            return C2618u.h(b11, list, ")");
        }
    }

    public /* synthetic */ DeliveryWidgetV2VO(d dVar, long j11, List list, t tVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(dVar, j11, list, tVar);
    }

    @NotNull
    public List<Long> getAvailableDeliverySchemas() {
        return this.availableDeliverySchemas;
    }

    public long getLifetimeSeconds() {
        return this.lifetimeSeconds;
    }

    @Override // l20.c
    public Integer getScrollWidgetKey() {
        return null;
    }

    @Override // l20.c
    public int getViewItemKey() {
        return hashCode();
    }

    @NotNull
    public d getWidgetInfo() {
        return this.widgetInfo;
    }

    private DeliveryWidgetV2VO(d dVar, long j11, List<Long> list, t tVar) {
        this.widgetInfo = dVar;
        this.lifetimeSeconds = j11;
        this.availableDeliverySchemas = list;
        this.tokenizedEvent = tVar;
    }

    public DeliveryWidgetV2VO(d dVar, long j11, List list, t tVar, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(dVar, j11, (i11 & 4) != 0 ? K.f71697a : list, (i11 & 8) != 0 ? null : tVar, null);
    }
}
