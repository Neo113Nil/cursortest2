package com.socure.docv.capturesdk.feature.help.presentation.ui;

import android.content.Context;
import android.graphics.Color;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.facebook.react.uimanager.ViewProps;
import com.socure.docv.capturesdk.R;
import com.socure.docv.capturesdk.common.utils.ExtensionsKt;
import com.socure.docv.capturesdk.common.view.ActionCallback;
import com.socure.docv.capturesdk.common.view.model.BsCallbackType;
import com.socure.docv.capturesdk.common.view.model.HelpViewData;
import io.sentry.Session;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: HelpView.kt */
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001:\u0001*B%\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0016\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020'2\u0006\u0010(\u001a\u00020)R#\u0010\t\u001a\n \u000b*\u0004\u0018\u00010\n0\n8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\f\u0010\rR#\u0010\u0010\u001a\n \u000b*\u0004\u0018\u00010\u00110\u00118BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0014\u0010\u000f\u001a\u0004\b\u0012\u0010\u0013R#\u0010\u0015\u001a\n \u000b*\u0004\u0018\u00010\u00160\u00168BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0019\u0010\u000f\u001a\u0004\b\u0017\u0010\u0018R#\u0010\u001a\u001a\n \u000b*\u0004\u0018\u00010\u001b0\u001b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001e\u0010\u000f\u001a\u0004\b\u001c\u0010\u001dR#\u0010\u001f\u001a\n \u000b*\u0004\u0018\u00010 0 8@X\u0080\u0084\u0002¢\u0006\f\n\u0004\b#\u0010\u000f\u001a\u0004\b!\u0010\"¨\u0006+"}, d2 = {"Lcom/socure/docv/capturesdk/feature/help/presentation/ui/HelpView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "context", "Landroid/content/Context;", Session.JsonKeys.ATTRS, "Landroid/util/AttributeSet;", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "btnContinue", "Landroid/widget/Button;", "kotlin.jvm.PlatformType", "getBtnContinue", "()Landroid/widget/Button;", "btnContinue$delegate", "Lkotlin/Lazy;", "helpImageView", "Landroid/widget/ImageView;", "getHelpImageView", "()Landroid/widget/ImageView;", "helpImageView$delegate", "rvInstructions", "Landroidx/recyclerview/widget/RecyclerView;", "getRvInstructions", "()Landroidx/recyclerview/widget/RecyclerView;", "rvInstructions$delegate", "tvPreviewTitle", "Landroid/widget/TextView;", "getTvPreviewTitle", "()Landroid/widget/TextView;", "tvPreviewTitle$delegate", ViewHierarchyConstants.VIEW_KEY, "Landroid/view/View;", "getView$capturesdk_productionRelease", "()Landroid/view/View;", "view$delegate", "setHelpViewData", "", "helpViewData", "Lcom/socure/docv/capturesdk/common/view/model/HelpViewData;", "helpActionCallback", "Lcom/socure/docv/capturesdk/common/view/ActionCallback;", "InstructionAdapter", "capturesdk_productionRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class HelpView extends ConstraintLayout {

    /* renamed from: btnContinue$delegate, reason: from kotlin metadata */
    private final Lazy btnContinue;

    /* renamed from: helpImageView$delegate, reason: from kotlin metadata */
    private final Lazy helpImageView;

    /* renamed from: rvInstructions$delegate, reason: from kotlin metadata */
    private final Lazy rvInstructions;

    /* renamed from: tvPreviewTitle$delegate, reason: from kotlin metadata */
    private final Lazy tvPreviewTitle;

    /* renamed from: view$delegate, reason: from kotlin metadata */
    private final Lazy view;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public HelpView(Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public HelpView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ HelpView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HelpView(final Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        this.view = LazyKt.lazy(new Function0<View>() { // from class: com.socure.docv.capturesdk.feature.help.presentation.ui.HelpView$view$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final View invoke() {
                return LayoutInflater.from(context).inflate(R.layout.socure_help_view, (ViewGroup) this, false);
            }
        });
        this.helpImageView = LazyKt.lazy(new Function0<ImageView>() { // from class: com.socure.docv.capturesdk.feature.help.presentation.ui.HelpView$helpImageView$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ImageView invoke() {
                return (ImageView) HelpView.this.getView$capturesdk_productionRelease().findViewById(R.id.help_image_view);
            }
        });
        this.rvInstructions = LazyKt.lazy(new Function0<RecyclerView>() { // from class: com.socure.docv.capturesdk.feature.help.presentation.ui.HelpView$rvInstructions$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final RecyclerView invoke() {
                return (RecyclerView) HelpView.this.getView$capturesdk_productionRelease().findViewById(R.id.rv_instructions);
            }
        });
        this.btnContinue = LazyKt.lazy(new Function0<Button>() { // from class: com.socure.docv.capturesdk.feature.help.presentation.ui.HelpView$btnContinue$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final Button invoke() {
                return (Button) HelpView.this.getView$capturesdk_productionRelease().findViewById(R.id.btn_continue);
            }
        });
        this.tvPreviewTitle = LazyKt.lazy(new Function0<TextView>() { // from class: com.socure.docv.capturesdk.feature.help.presentation.ui.HelpView$tvPreviewTitle$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final TextView invoke() {
                return (TextView) HelpView.this.getView$capturesdk_productionRelease().findViewById(R.id.tv_preview_title);
            }
        });
        addView(getView$capturesdk_productionRelease());
    }

    public final View getView$capturesdk_productionRelease() {
        return (View) this.view.getValue();
    }

    private final ImageView getHelpImageView() {
        return (ImageView) this.helpImageView.getValue();
    }

    private final RecyclerView getRvInstructions() {
        return (RecyclerView) this.rvInstructions.getValue();
    }

    private final Button getBtnContinue() {
        return (Button) this.btnContinue.getValue();
    }

    private final TextView getTvPreviewTitle() {
        return (TextView) this.tvPreviewTitle.getValue();
    }

    public final void setHelpViewData(HelpViewData helpViewData, final ActionCallback helpActionCallback) {
        Intrinsics.checkNotNullParameter(helpViewData, "helpViewData");
        Intrinsics.checkNotNullParameter(helpActionCallback, "helpActionCallback");
        getTvPreviewTitle().setTextColor(Color.parseColor(helpViewData.getTitle().getLabelColor()));
        getTvPreviewTitle().setText(helpViewData.getTitle().getLabel());
        getHelpImageView().setImageResource(helpViewData.getImageResId());
        getRvInstructions().setAdapter(new InstructionAdapter(this, getContext(), helpViewData.getInstructionList(), helpViewData.getInstrTextColor()));
        getBtnContinue().setText(helpViewData.getContinueButton().getLabel());
        String bgColor = helpViewData.getContinueButton().getBgColor();
        if (bgColor != null) {
            Button btnContinue = getBtnContinue();
            Intrinsics.checkNotNullExpressionValue(btnContinue, "btnContinue");
            ExtensionsKt.setCorner(btnContinue, bgColor, helpViewData.getContinueButton().getBgColor());
        }
        getBtnContinue().setTextColor(Color.parseColor(helpViewData.getContinueButton().getLabelColor()));
        getBtnContinue().setOnClickListener(new View.OnClickListener() { // from class: com.socure.docv.capturesdk.feature.help.presentation.ui.HelpView$$ExternalSyntheticLambda0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                HelpView.setHelpViewData$lambda$2(ActionCallback.this, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setHelpViewData$lambda$2(ActionCallback helpActionCallback, View view) {
        Intrinsics.checkNotNullParameter(helpActionCallback, "$helpActionCallback");
        ActionCallback.DefaultImpls.onClick$default(helpActionCallback, BsCallbackType.CONTINUE, null, 2, null);
    }

    /* compiled from: HelpView.kt */
    @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0004\u0018\u00002\u0010\u0012\f\u0012\n0\u0002R\u00060\u0000R\u00020\u00030\u0001:\u0001\u0017B'\b\u0000\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0002\u0010\nJ\b\u0010\r\u001a\u00020\u000eH\u0016J \u0010\u000f\u001a\u00020\u00102\u000e\u0010\u0011\u001a\n0\u0002R\u00060\u0000R\u00020\u00032\u0006\u0010\u0012\u001a\u00020\u000eH\u0016J \u0010\u0013\u001a\n0\u0002R\u00060\u0000R\u00020\u00032\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u000eH\u0016R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0018"}, d2 = {"Lcom/socure/docv/capturesdk/feature/help/presentation/ui/HelpView$InstructionAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/socure/docv/capturesdk/feature/help/presentation/ui/HelpView$InstructionAdapter$ViewHolder;", "Lcom/socure/docv/capturesdk/feature/help/presentation/ui/HelpView;", "context", "Landroid/content/Context;", "data", "", "", "instructionTextColor", "(Lcom/socure/docv/capturesdk/feature/help/presentation/ui/HelpView;Landroid/content/Context;Ljava/util/List;Ljava/lang/String;)V", "mInflater", "Landroid/view/LayoutInflater;", "getItemCount", "", "onBindViewHolder", "", "holder", ViewProps.POSITION, "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "ViewHolder", "capturesdk_productionRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public final class InstructionAdapter extends RecyclerView.Adapter<ViewHolder> {
        private final List<String> data;
        private final String instructionTextColor;
        private final LayoutInflater mInflater;
        final /* synthetic */ HelpView this$0;

        public InstructionAdapter(HelpView helpView, Context context, List<String> data, String instructionTextColor) {
            Intrinsics.checkNotNullParameter(data, "data");
            Intrinsics.checkNotNullParameter(instructionTextColor, "instructionTextColor");
            this.this$0 = helpView;
            this.data = data;
            this.instructionTextColor = instructionTextColor;
            LayoutInflater from = LayoutInflater.from(context);
            Intrinsics.checkNotNullExpressionValue(from, "from(context)");
            this.mInflater = from;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
            Intrinsics.checkNotNullParameter(parent, "parent");
            View inflate = this.mInflater.inflate(R.layout.socure_instruction_item, parent, false);
            Intrinsics.checkNotNullExpressionValue(inflate, "mInflater.inflate(R.layo…tion_item, parent, false)");
            return new ViewHolder(this, inflate);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public void onBindViewHolder(ViewHolder holder, int position) {
            Intrinsics.checkNotNullParameter(holder, "holder");
            holder.getTvInstruction().setText(this.data.get(position));
            holder.getTvInstruction().setTextColor(Color.parseColor(this.instructionTextColor));
            holder.getTvPointer().setTextColor(Color.parseColor(this.instructionTextColor));
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemCount() {
            return this.data.size();
        }

        /* compiled from: HelpView.kt */
        @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0086\u0004\u0018\u00002\u00020\u0001B\u000f\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001a\u0010\u000b\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\b\"\u0004\b\r\u0010\n¨\u0006\u000e"}, d2 = {"Lcom/socure/docv/capturesdk/feature/help/presentation/ui/HelpView$InstructionAdapter$ViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "itemView", "Landroid/view/View;", "(Lcom/socure/docv/capturesdk/feature/help/presentation/ui/HelpView$InstructionAdapter;Landroid/view/View;)V", "tvInstruction", "Landroid/widget/TextView;", "getTvInstruction", "()Landroid/widget/TextView;", "setTvInstruction", "(Landroid/widget/TextView;)V", "tvPointer", "getTvPointer", "setTvPointer", "capturesdk_productionRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public final class ViewHolder extends RecyclerView.ViewHolder {
            final /* synthetic */ InstructionAdapter this$0;
            private TextView tvInstruction;
            private TextView tvPointer;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public ViewHolder(InstructionAdapter instructionAdapter, View itemView) {
                super(itemView);
                Intrinsics.checkNotNullParameter(itemView, "itemView");
                this.this$0 = instructionAdapter;
                View findViewById = itemView.findViewById(R.id.tv_instruction);
                Intrinsics.checkNotNullExpressionValue(findViewById, "itemView.findViewById(R.id.tv_instruction)");
                this.tvInstruction = (TextView) findViewById;
                View findViewById2 = itemView.findViewById(R.id.tv_pointer);
                Intrinsics.checkNotNullExpressionValue(findViewById2, "itemView.findViewById(R.id.tv_pointer)");
                this.tvPointer = (TextView) findViewById2;
            }

            public final TextView getTvInstruction() {
                return this.tvInstruction;
            }

            public final void setTvInstruction(TextView textView) {
                Intrinsics.checkNotNullParameter(textView, "<set-?>");
                this.tvInstruction = textView;
            }

            public final TextView getTvPointer() {
                return this.tvPointer;
            }

            public final void setTvPointer(TextView textView) {
                Intrinsics.checkNotNullParameter(textView, "<set-?>");
                this.tvPointer = textView;
            }
        }
    }
}
