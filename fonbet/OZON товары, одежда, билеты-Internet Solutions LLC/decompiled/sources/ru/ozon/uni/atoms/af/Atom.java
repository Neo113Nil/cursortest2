package ru.ozon.uni.atoms.af;

import Am.C2438a;
import B0.C2454a;
import J0.P;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.U;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.h;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.uni.atoms.AtomFeatures;
import ru.ozon.uni.atoms.af.Atom.AtomConfiguration;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.AtomDTO;
import ru.ozon.uni.atoms.data.TestInfo;
import ru.ozon.uni.atoms.utils.AtomLocatableView;
import ru.ozon.uni.atoms.utils.OzTrace;

@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u001b\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\b'\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u0001*\b\b\u0001\u0010\u0004*\u00020\u00032\u00020\u0005:\u0003QRSB\u0019\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00028\u0001H\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\r\u0010\u0010\u001a\u00028\u0000¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0012\u001a\u00020\r2\u0006\u0010\f\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\u0012\u0010\u000fJ\u0017\u0010\u0015\u001a\u00020\r2\u0006\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0015\u0010\u0016Jc\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00002\b\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\f\u001a\u00028\u00012 \u0010\u0019\u001a\u001c\u0012\u0004\u0012\u00020\u0018\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00030\u0017\u0018\u00010\u00172\u0014\u0010\u001b\u001a\u0010\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u001a\u0018\u00010\u0017¢\u0006\u0004\b\u001c\u0010\u001dJ\u0015\u0010\u001f\u001a\u00020\r2\u0006\u0010\u001e\u001a\u00028\u0000¢\u0006\u0004\b\u001f\u0010 J!\u0010#\u001a\u00020\r2\u0012\u0010\"\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020!0\u0017¢\u0006\u0004\b#\u0010$J\r\u0010%\u001a\u00020\r¢\u0006\u0004\b%\u0010&J\u0017\u0010(\u001a\u00020\r2\u0006\u0010'\u001a\u00020\bH\u0016¢\u0006\u0004\b(\u0010)J#\u0010-\u001a\u00020\r2\u0014\u0010,\u001a\u0010\u0012\u0004\u0012\u00020+\u0012\u0004\u0012\u00020\r\u0018\u00010*¢\u0006\u0004\b-\u0010.J\u0015\u00100\u001a\u00020\r2\u0006\u0010/\u001a\u00020+¢\u0006\u0004\b0\u00101J1\u00102\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00002\u0014\u0010,\u001a\u0010\u0012\u0004\u0012\u00020+\u0012\u0004\u0012\u00020\r\u0018\u00010*H\u0016¢\u0006\u0004\b2\u00103J\u000f\u00104\u001a\u00020\rH\u0017¢\u0006\u0004\b4\u0010&J\u0017\u00105\u001a\u00020\r2\u0006\u0010\u001e\u001a\u00028\u0000H$¢\u0006\u0004\b5\u0010 R\u001a\u0010\u0007\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0007\u00106\u001a\u0004\b7\u00108R\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\t\u00109\u001a\u0004\b:\u0010;R\"\u0010<\u001a\u00028\u00018\u0004@\u0004X\u0084.¢\u0006\u0012\n\u0004\b<\u0010=\u001a\u0004\b>\u0010?\"\u0004\b@\u0010\u000fR0\u0010,\u001a\u0010\u0012\u0004\u0012\u00020+\u0012\u0004\u0012\u00020\r\u0018\u00010*8\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\b,\u0010A\u001a\u0004\bB\u0010C\"\u0004\bD\u0010.R\u0018\u0010E\u001a\u0004\u0018\u00018\u00008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bE\u0010FR\u0016\u0010H\u001a\u00020G8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bH\u0010IR \u0010L\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00028\u00010\u00178&X¦\u0004¢\u0006\u0006\u001a\u0004\bJ\u0010KR\u0014\u0010P\u001a\u00020M8DX\u0084\u0004¢\u0006\u0006\u001a\u0004\bN\u0010O¨\u0006T"}, d2 = {"Lru/ozon/uni/atoms/af/Atom;", "Lru/ozon/uni/atoms/data/AtomDTO;", "DTO", "Lru/ozon/uni/atoms/af/Atom$AtomConfiguration;", "C", "", "Landroid/view/View;", "containerView", "", "atomContext", "<init>", "(Landroid/view/View;Ljava/lang/String;)V", "configuration", "", "configure", "(Lru/ozon/uni/atoms/af/Atom$AtomConfiguration;)V", "getData", "()Lru/ozon/uni/atoms/data/AtomDTO;", "onConfigureView", "Landroid/view/ViewGroup$MarginLayoutParams;", "lp", "onLayoutParamsChanged", "(Landroid/view/ViewGroup$MarginLayoutParams;)V", "", "Lru/ozon/uni/atoms/af/Atom$ConfCondition;", "nestedConfigs", "Lru/ozon/uni/atoms/af/AtomDecorator;", "nestedDecorators", "build", "(Ljava/lang/String;Lru/ozon/uni/atoms/af/Atom$AtomConfiguration;Ljava/util/Map;Ljava/util/Map;)Lru/ozon/uni/atoms/af/Atom;", "item", "bind", "(Lru/ozon/uni/atoms/data/AtomDTO;)V", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "trackingInfo", "sendViewAnalytics", "(Ljava/util/Map;)V", "trackViewAnalytics", "()V", "testId", "setTestId", "(Ljava/lang/String;)V", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "onAction", "setOnAtomAction", "(Lkotlin/jvm/functions/Function1;)V", "action", "handleAction", "(Lru/ozon/uni/atoms/af/AtomAction;)V", "withAction", "(Lkotlin/jvm/functions/Function1;)Lru/ozon/uni/atoms/af/Atom;", "onRecycle", "onBind", "Landroid/view/View;", "getContainerView", "()Landroid/view/View;", "Ljava/lang/String;", "getAtomContext", "()Ljava/lang/String;", "currentConfiguration", "Lru/ozon/uni/atoms/af/Atom$AtomConfiguration;", "getCurrentConfiguration", "()Lru/ozon/uni/atoms/af/Atom$AtomConfiguration;", "setCurrentConfiguration", "Lkotlin/jvm/functions/Function1;", "getOnAction", "()Lkotlin/jvm/functions/Function1;", "setOnAction", "boundData", "Lru/ozon/uni/atoms/data/AtomDTO;", "", "hasTestId", "Z", "getDefaultConfigurations", "()Ljava/util/Map;", "defaultConfigurations", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", "context", "DefaultConfigurator", "AtomConfiguration", "ConfCondition", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes8.dex */
public abstract class Atom<DTO extends AtomDTO, C extends AtomConfiguration> {
    private final String atomContext;
    private DTO boundData;

    @NotNull
    private final View containerView;
    protected C currentConfiguration;
    private boolean hasTestId;
    private Function1<? super AtomAction, Unit> onAction;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u000e\bf\u0018\u00002\u00020\u0001R\u0018\u0010\u0002\u001a\u00020\u0003X¦\u000e¢\u0006\f\u001a\u0004\b\u0004\u0010\u0005\"\u0004\b\u0006\u0010\u0007R\u0018\u0010\b\u001a\u00020\u0003X¦\u000e¢\u0006\f\u001a\u0004\b\t\u0010\u0005\"\u0004\b\n\u0010\u0007R\u0018\u0010\u000b\u001a\u00020\u0003X¦\u000e¢\u0006\f\u001a\u0004\b\f\u0010\u0005\"\u0004\b\r\u0010\u0007R\u0018\u0010\u000e\u001a\u00020\u0003X¦\u000e¢\u0006\f\u001a\u0004\b\u000f\u0010\u0005\"\u0004\b\u0010\u0010\u0007¨\u0006\u0011"}, d2 = {"Lru/ozon/uni/atoms/af/Atom$AtomConfiguration;", "", "paddingStart", "", "getPaddingStart", "()I", "setPaddingStart", "(I)V", "paddingEnd", "getPaddingEnd", "setPaddingEnd", "paddingTop", "getPaddingTop", "setPaddingTop", "paddingBottom", "getPaddingBottom", "setPaddingBottom", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public interface AtomConfiguration {
        int getPaddingBottom();

        int getPaddingEnd();

        int getPaddingStart();

        int getPaddingTop();

        void setPaddingBottom(int i11);

        void setPaddingEnd(int i11);

        void setPaddingStart(int i11);

        void setPaddingTop(int i11);
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0012\b\u0002\u0010\u0004\u001a\f\u0012\u0006\b\u0001\u0012\u00020\u0003\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R!\u0010\u0004\u001a\f\u0012\u0006\b\u0001\u0012\u00020\u0003\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0015\u001a\u0004\b\u0016\u0010\n¨\u0006\u0017"}, d2 = {"Lru/ozon/uni/atoms/af/Atom$ConfCondition;", "", "Ljava/lang/Class;", "Lru/ozon/uni/atoms/data/AtomDTO;", "dtoClass", "", "context", "<init>", "(Ljava/lang/Class;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/Class;", "getDtoClass", "()Ljava/lang/Class;", "Ljava/lang/String;", "getContext", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class ConfCondition {
        private final String context;
        private final Class<? extends AtomDTO> dtoClass;

        /* JADX WARN: Multi-variable type inference failed */
        public ConfCondition() {
            this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ConfCondition)) {
                return false;
            }
            ConfCondition confCondition = (ConfCondition) other;
            return Intrinsics.d(this.dtoClass, confCondition.dtoClass) && Intrinsics.d(this.context, confCondition.context);
        }

        public int hashCode() {
            Class<? extends AtomDTO> cls = this.dtoClass;
            int hashCode = (cls == null ? 0 : cls.hashCode()) * 31;
            String str = this.context;
            return hashCode + (str != null ? str.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            return "ConfCondition(dtoClass=" + this.dtoClass + ", context=" + this.context + ")";
        }

        public ConfCondition(Class<? extends AtomDTO> cls, String str) {
            this.dtoClass = cls;
            this.context = str;
        }

        public /* synthetic */ ConfCondition(Class cls, String str, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this((i11 & 1) != 0 ? null : cls, (i11 & 2) != 0 ? null : str);
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\"\u0010\u0003\u001a\u00020\u00028\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\r\"\u0004\b\u0015\u0010\u0016R\"\u0010\u0004\u001a\u00020\u00028\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0004\u0010\u0013\u001a\u0004\b\u0017\u0010\r\"\u0004\b\u0018\u0010\u0016R\"\u0010\u0005\u001a\u00020\u00028\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u0013\u001a\u0004\b\u0019\u0010\r\"\u0004\b\u001a\u0010\u0016R\"\u0010\u0006\u001a\u00020\u00028\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010\u0013\u001a\u0004\b\u001b\u0010\r\"\u0004\b\u001c\u0010\u0016¨\u0006\u001d"}, d2 = {"Lru/ozon/uni/atoms/af/Atom$DefaultConfigurator;", "Lru/ozon/uni/atoms/af/Atom$AtomConfiguration;", "", "paddingStart", "paddingEnd", "paddingTop", "paddingBottom", "<init>", "(IIII)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "I", "getPaddingStart", "setPaddingStart", "(I)V", "getPaddingEnd", "setPaddingEnd", "getPaddingTop", "setPaddingTop", "getPaddingBottom", "setPaddingBottom", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class DefaultConfigurator implements AtomConfiguration {
        private int paddingBottom;
        private int paddingEnd;
        private int paddingStart;
        private int paddingTop;

        public DefaultConfigurator() {
            this(0, 0, 0, 0, 15, null);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof DefaultConfigurator)) {
                return false;
            }
            DefaultConfigurator defaultConfigurator = (DefaultConfigurator) other;
            return this.paddingStart == defaultConfigurator.paddingStart && this.paddingEnd == defaultConfigurator.paddingEnd && this.paddingTop == defaultConfigurator.paddingTop && this.paddingBottom == defaultConfigurator.paddingBottom;
        }

        @Override // ru.ozon.uni.atoms.af.Atom.AtomConfiguration
        public int getPaddingBottom() {
            return this.paddingBottom;
        }

        @Override // ru.ozon.uni.atoms.af.Atom.AtomConfiguration
        public int getPaddingEnd() {
            return this.paddingEnd;
        }

        @Override // ru.ozon.uni.atoms.af.Atom.AtomConfiguration
        public int getPaddingStart() {
            return this.paddingStart;
        }

        @Override // ru.ozon.uni.atoms.af.Atom.AtomConfiguration
        public int getPaddingTop() {
            return this.paddingTop;
        }

        public int hashCode() {
            return Integer.hashCode(this.paddingBottom) + C2454a.a(this.paddingTop, C2454a.a(this.paddingEnd, Integer.hashCode(this.paddingStart) * 31, 31), 31);
        }

        @Override // ru.ozon.uni.atoms.af.Atom.AtomConfiguration
        public void setPaddingBottom(int i11) {
            this.paddingBottom = i11;
        }

        @Override // ru.ozon.uni.atoms.af.Atom.AtomConfiguration
        public void setPaddingEnd(int i11) {
            this.paddingEnd = i11;
        }

        @Override // ru.ozon.uni.atoms.af.Atom.AtomConfiguration
        public void setPaddingStart(int i11) {
            this.paddingStart = i11;
        }

        @Override // ru.ozon.uni.atoms.af.Atom.AtomConfiguration
        public void setPaddingTop(int i11) {
            this.paddingTop = i11;
        }

        @NotNull
        public String toString() {
            return P.a(this.paddingTop, this.paddingBottom, ", paddingBottom=", ")", C2438a.a("DefaultConfigurator(paddingStart=", this.paddingStart, ", paddingEnd=", ", paddingTop=", this.paddingEnd));
        }

        public DefaultConfigurator(int i11, int i12, int i13, int i14) {
            this.paddingStart = i11;
            this.paddingEnd = i12;
            this.paddingTop = i13;
            this.paddingBottom = i14;
        }

        public /* synthetic */ DefaultConfigurator(int i11, int i12, int i13, int i14, int i15, DefaultConstructorMarker defaultConstructorMarker) {
            this((i15 & 1) != 0 ? 0 : i11, (i15 & 2) != 0 ? 0 : i12, (i15 & 4) != 0 ? 0 : i13, (i15 & 8) != 0 ? 0 : i14);
        }
    }

    public Atom(@NotNull View containerView, String str) {
        Intrinsics.checkNotNullParameter(containerView, "containerView");
        this.containerView = containerView;
        this.atomContext = str;
    }

    private final void configure(C configuration) {
        setCurrentConfiguration(configuration);
        onConfigureView(configuration);
    }

    public final void bind(@NotNull DTO item) {
        TestInfo testInfo;
        String automatizationId;
        Intrinsics.checkNotNullParameter(item, "item");
        OzTrace.beginTrace(null, new Pair[]{new Pair("atom", item)});
        this.boundData = item;
        CharSequence contentDescription = getContainerView().getContentDescription();
        if (getContainerView() instanceof AtomLocatableView) {
            this.hasTestId = true;
        }
        if ((contentDescription == null || h.K(contentDescription) || this.hasTestId) && (testInfo = item.getTestInfo()) != null && (automatizationId = testInfo.getAutomatizationId()) != null) {
            String str = h.K(automatizationId) ? null : automatizationId;
            if (str != null) {
                setTestId(str);
                this.hasTestId = true;
            }
        }
        onBind(item);
        Unit unit = Unit.f71690a;
        OzTrace.endTrace();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public final Atom<DTO, C> build(String atomContext, @NotNull C configuration, Map<ConfCondition, ? extends Map<ConfCondition, ? extends AtomConfiguration>> nestedConfigs, Map<ConfCondition, ? extends AtomDecorator> nestedDecorators) {
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        if (this instanceof HasNested) {
            HasNested hasNested = (HasNested) this;
            if (nestedConfigs == null) {
                nestedConfigs = U.c();
            }
            hasNested.setNestedConfigs(atomContext, nestedConfigs, nestedDecorators);
        }
        configure(configuration);
        return this;
    }

    public final String getAtomContext() {
        return this.atomContext;
    }

    @NotNull
    public View getContainerView() {
        return this.containerView;
    }

    @NotNull
    protected final Context getContext() {
        Context context = getContainerView().getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        return context;
    }

    @NotNull
    protected final C getCurrentConfiguration() {
        C c11 = this.currentConfiguration;
        if (c11 != null) {
            return c11;
        }
        Intrinsics.n("currentConfiguration");
        throw null;
    }

    @NotNull
    public final DTO getData() {
        DTO dto = this.boundData;
        if (dto != null) {
            return dto;
        }
        throw new IllegalArgumentException("Required value was null.");
    }

    @NotNull
    public abstract Map<ConfCondition, C> getDefaultConfigurations();

    protected final Function1<AtomAction, Unit> getOnAction() {
        return this.onAction;
    }

    public final void handleAction(@NotNull AtomAction action) {
        Intrinsics.checkNotNullParameter(action, "action");
        Function1<? super AtomAction, Unit> function1 = this.onAction;
        if (function1 != null) {
            function1.invoke(action);
        }
    }

    protected abstract void onBind(@NotNull DTO item);

    public void onConfigureView(@NotNull C configuration) {
        Intrinsics.checkNotNullParameter(configuration, "configuration");
    }

    public void onLayoutParamsChanged(@NotNull ViewGroup.MarginLayoutParams lp) {
        Intrinsics.checkNotNullParameter(lp, "lp");
    }

    public void onRecycle() {
        setOnAtomAction(null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void sendViewAnalytics(@NotNull Map<String, TokenizedTrackingInfo> trackingInfo) {
        Intrinsics.checkNotNullParameter(trackingInfo, "trackingInfo");
        handleAction(new AtomAction.ViewAction(trackingInfo, null, 2, 0 == true ? 1 : 0));
    }

    protected final void setCurrentConfiguration(@NotNull C c11) {
        Intrinsics.checkNotNullParameter(c11, "<set-?>");
        this.currentConfiguration = c11;
    }

    public final void setOnAtomAction(Function1<? super AtomAction, Unit> onAction) {
        this.onAction = onAction;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void setTestId(@NotNull String testId) {
        Intrinsics.checkNotNullParameter(testId, "testId");
        View containerView = getContainerView();
        if (!(containerView instanceof AtomLocatableView)) {
            containerView.setContentDescription(testId);
            return;
        }
        AtomLocatableView atomLocatableView = (AtomLocatableView) containerView;
        if (h.K(testId)) {
            testId = atomLocatableView.getLocatorTag();
        }
        atomLocatableView.setLocatorTag(testId);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void trackViewAnalytics() {
        Map<String, TokenizedTrackingInfo> trackingInfo = getData().getTrackingInfo();
        String str = null;
        Object[] objArr = 0;
        if (AtomFeatures.INSTANCE.getSendViewActionIfNotNull()) {
            if ((trackingInfo != null ? trackingInfo.get("view") : null) == null) {
                return;
            }
        }
        handleAction(new AtomAction.ViewAction(trackingInfo, str, 2, objArr == true ? 1 : 0));
    }

    @NotNull
    public Atom<DTO, C> withAction(Function1<? super AtomAction, Unit> onAction) {
        if (onAction == null) {
            onAction = Atom$withAction$1.INSTANCE;
        }
        setOnAtomAction(onAction);
        return this;
    }
}
