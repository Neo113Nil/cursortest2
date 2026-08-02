package ru.ozon.app.android.universalwidgets.widgets.uw.old.uobject.gridone.rv;

import Sc.o;
import android.content.Context;
import android.view.ViewGroup;
import androidx.lifecycle.J;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.K;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.uikit.view.recycler.adapter.lifecycle.LifecycleAdapter;
import ru.ozon.app.android.universalwidgets.widgets.uw.old.uobject.model.ObjectItemVO;
import ru.ozon.app.android.universalwidgets.widgets.uw.old.uobject.model.ObjectItemsVO;
import ru.ozon.app.android.universalwidgets.widgets.uw.old.uobject.model.TextAlign;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.common.CornerRadius;

@Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\"\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B[\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u000f\u0012\b\b\u0003\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0015\u0010\u0016J\u001f\u0010\u001a\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001d\u001a\u00020\u00112\u0006\u0010\u001c\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u001f\u0010 \u001a\u00020\t2\u0006\u0010\u001f\u001a\u00020\u00022\u0006\u0010\u001c\u001a\u00020\u0011H\u0016¢\u0006\u0004\b \u0010!J\u000f\u0010\"\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\"\u0010#R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010$R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010%R \u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010&R\"\u0010\f\u001a\u00020\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\f\u0010'\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+R\"\u0010\u000e\u001a\u00020\r8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010,\u001a\u0004\b-\u0010.\"\u0004\b/\u00100R\"\u0010\u0010\u001a\u00020\u000f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0010\u00101\u001a\u0004\b2\u00103\"\u0004\b4\u00105R\"\u0010\u0012\u001a\u00020\u00118\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0012\u00106\u001a\u0004\b7\u0010#\"\u0004\b8\u00109R$\u0010;\u001a\u0004\u0018\u00010:8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b;\u0010<\u001a\u0004\b=\u0010>\"\u0004\b?\u0010@R*\u0010C\u001a\n\u0018\u00010Aj\u0004\u0018\u0001`B8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bC\u0010D\u001a\u0004\bE\u0010F\"\u0004\bG\u0010HR6\u0010L\u001a\b\u0012\u0004\u0012\u00020J0I2\f\u0010K\u001a\b\u0012\u0004\u0012\u00020J0I8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\bL\u0010M\u001a\u0004\bN\u0010O\"\u0004\bP\u0010Q¨\u0006R"}, d2 = {"Lru/ozon/app/android/universalwidgets/widgets/uw/old/uobject/gridone/rv/UwGridOneAdapter;", "Lru/ozon/app/android/uikit/view/recycler/adapter/lifecycle/LifecycleAdapter;", "Lru/ozon/app/android/universalwidgets/widgets/uw/old/uobject/gridone/rv/BindableUwViewHolder;", "Lru/ozon/app/android/composer/ComposerReferences;", "ref", "", "needCorners", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "", "onAction", "", "ratio", "Lru/ozon/uni/atoms/data/common/CornerRadius;", "cornerRadius", "Lru/ozon/app/android/universalwidgets/widgets/uw/old/uobject/model/TextAlign;", "textAlign", "", "textColor", "Landroidx/lifecycle/J;", "lifecycleOwner", "<init>", "(Lru/ozon/app/android/composer/ComposerReferences;ZLkotlin/jvm/functions/Function1;FLru/ozon/uni/atoms/data/common/CornerRadius;Lru/ozon/app/android/universalwidgets/widgets/uw/old/uobject/model/TextAlign;ILandroidx/lifecycle/J;)V", "Landroid/view/ViewGroup;", "parent", "viewType", "onCreateViewHolder", "(Landroid/view/ViewGroup;I)Lru/ozon/app/android/universalwidgets/widgets/uw/old/uobject/gridone/rv/BindableUwViewHolder;", "position", "getItemViewType", "(I)I", "holder", "onBindViewHolder", "(Lru/ozon/app/android/universalwidgets/widgets/uw/old/uobject/gridone/rv/BindableUwViewHolder;I)V", "getItemCount", "()I", "Lru/ozon/app/android/composer/ComposerReferences;", "Z", "Lkotlin/jvm/functions/Function1;", "F", "getRatio", "()F", "setRatio", "(F)V", "Lru/ozon/uni/atoms/data/common/CornerRadius;", "getCornerRadius", "()Lru/ozon/uni/atoms/data/common/CornerRadius;", "setCornerRadius", "(Lru/ozon/uni/atoms/data/common/CornerRadius;)V", "Lru/ozon/app/android/universalwidgets/widgets/uw/old/uobject/model/TextAlign;", "getTextAlign", "()Lru/ozon/app/android/universalwidgets/widgets/uw/old/uobject/model/TextAlign;", "setTextAlign", "(Lru/ozon/app/android/universalwidgets/widgets/uw/old/uobject/model/TextAlign;)V", "I", "getTextColor", "setTextColor", "(I)V", "Lru/ozon/app/android/universalwidgets/widgets/uw/old/uobject/model/ObjectItemsVO$Paddings;", "paddings", "Lru/ozon/app/android/universalwidgets/widgets/uw/old/uobject/model/ObjectItemsVO$Paddings;", "getPaddings", "()Lru/ozon/app/android/universalwidgets/widgets/uw/old/uobject/model/ObjectItemsVO$Paddings;", "setPaddings", "(Lru/ozon/app/android/universalwidgets/widgets/uw/old/uobject/model/ObjectItemsVO$Paddings;)V", "Ll20/d;", "Lru/ozon/app/android/composer/view/WidgetInfo;", "info", "Ll20/d;", "getInfo", "()Ll20/d;", "setInfo", "(Ll20/d;)V", "", "Lru/ozon/app/android/universalwidgets/widgets/uw/old/uobject/model/ObjectItemVO;", AppMeasurementSdk.ConditionalUserProperty.VALUE, "items", "Ljava/util/List;", "getItems", "()Ljava/util/List;", "setItems", "(Ljava/util/List;)V", "universalwidgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class UwGridOneAdapter extends LifecycleAdapter<BindableUwViewHolder> {

    @NotNull
    private CornerRadius cornerRadius;
    private d info;

    @NotNull
    private List<ObjectItemVO> items;
    private final boolean needCorners;

    @NotNull
    private final Function1<AtomAction, Unit> onAction;
    private ObjectItemsVO.Paddings paddings;
    private float ratio;

    @NotNull
    private final ComposerReferences ref;

    @NotNull
    private TextAlign textAlign;
    private int textColor;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[TextAlign.values().length];
            try {
                iArr[TextAlign.CENTER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[TextAlign.LEFT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public /* synthetic */ UwGridOneAdapter(ComposerReferences composerReferences, boolean z11, Function1 function1, float f7, CornerRadius cornerRadius, TextAlign textAlign, int i11, J j11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(composerReferences, z11, function1, (i12 & 8) != 0 ? 1.0f : f7, (i12 & 16) != 0 ? CornerRadius.RADIUS_500 : cornerRadius, (i12 & 32) != 0 ? TextAlign.LEFT : textAlign, (i12 & 64) != 0 ? 1 : i11, j11);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    /* renamed from: getItemCount */
    public int getShimmersCount() {
        return this.items.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public int getItemViewType(int position) {
        int i11 = WhenMappings.$EnumSwitchMapping$0[this.textAlign.ordinal()];
        if (i11 == 1) {
            return UwGridOneCenterTextViewHolder.INSTANCE.getVIEW_TYPE();
        }
        if (i11 == 2) {
            return UwGridOneStartTextViewHolder.INSTANCE.getVIEW_TYPE();
        }
        throw new o();
    }

    public final void setCornerRadius(@NotNull CornerRadius cornerRadius) {
        Intrinsics.checkNotNullParameter(cornerRadius, "<set-?>");
        this.cornerRadius = cornerRadius;
    }

    public final void setInfo(d dVar) {
        this.info = dVar;
    }

    public final void setItems(@NotNull List<ObjectItemVO> value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.items = value;
        notifyDataSetChanged();
    }

    public final void setPaddings(ObjectItemsVO.Paddings paddings) {
        this.paddings = paddings;
    }

    public final void setRatio(float f7) {
        this.ratio = f7;
    }

    public final void setTextAlign(@NotNull TextAlign textAlign) {
        Intrinsics.checkNotNullParameter(textAlign, "<set-?>");
        this.textAlign = textAlign;
    }

    public final void setTextColor(int i11) {
        this.textColor = i11;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public void onBindViewHolder(@NotNull BindableUwViewHolder holder, int position) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        holder.bind(this.items.get(position), position, new UwAdapterData(this.info, this.ratio, this.textColor, this.paddings, this.cornerRadius));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    @NotNull
    public BindableUwViewHolder onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        UwGridOneVhFactory uwGridOneVhFactory = UwGridOneVhFactory.INSTANCE;
        ComposerReferences composerReferences = this.ref;
        boolean z11 = this.needCorners;
        Function1<AtomAction, Unit> function1 = this.onAction;
        Context context = parent.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        return uwGridOneVhFactory.createVH(composerReferences, viewType, z11, function1, context);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public UwGridOneAdapter(@NotNull ComposerReferences ref, boolean z11, @NotNull Function1<? super AtomAction, Unit> onAction, float f7, @NotNull CornerRadius cornerRadius, @NotNull TextAlign textAlign, int i11, @NotNull J lifecycleOwner) {
        super(lifecycleOwner, null, 2, null);
        Intrinsics.checkNotNullParameter(ref, "ref");
        Intrinsics.checkNotNullParameter(onAction, "onAction");
        Intrinsics.checkNotNullParameter(cornerRadius, "cornerRadius");
        Intrinsics.checkNotNullParameter(textAlign, "textAlign");
        Intrinsics.checkNotNullParameter(lifecycleOwner, "lifecycleOwner");
        this.ref = ref;
        this.needCorners = z11;
        this.onAction = onAction;
        this.ratio = f7;
        this.cornerRadius = cornerRadius;
        this.textAlign = textAlign;
        this.textColor = i11;
        this.items = K.f71697a;
    }
}
