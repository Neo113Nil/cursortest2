package com.socure.docv.capturesdk.feature.consent.data;

import android.content.res.ColorStateList;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatCheckBox;
import androidx.core.view.ViewCompat;
import androidx.core.widget.CompoundButtonCompat;
import androidx.recyclerview.widget.DiffUtil;
import androidx.recyclerview.widget.ListAdapter;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.appevents.iap.InAppPurchaseConstants;
import com.facebook.react.uimanager.ViewProps;
import com.henninghall.date_picker.props.TextColorProp;
import com.socure.docv.capturesdk.R;
import com.socure.docv.capturesdk.common.analytics.AnalyticsConstantsKt;
import com.socure.docv.capturesdk.common.logger.LoggerKt;
import com.socure.docv.capturesdk.common.utils.AnnounceAccessibilityMessageUseCase;
import com.socure.docv.capturesdk.common.utils.AnnounceAccessibilityMessageUseCaseKt;
import com.socure.docv.capturesdk.common.utils.Markdown;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ConsentAdapter.kt */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0007\u001a\u001b\u001c\u001d\u001e\u001f B\u0015\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0010\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0012H\u0016J\u0018\u0010\u0014\u001a\u00020\f2\u0006\u0010\u0015\u001a\u00020\u00032\u0006\u0010\u0013\u001a\u00020\u0012H\u0016J\u0018\u0010\u0016\u001a\u00020\u00032\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u0012H\u0016R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R4\u0010\t\u001a\u001c\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f\u0018\u00010\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006!"}, d2 = {"Lcom/socure/docv/capturesdk/feature/consent/data/ConsentAdapter;", "Landroidx/recyclerview/widget/ListAdapter;", "Lcom/socure/docv/capturesdk/feature/consent/data/ConsentAdapter$Item;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", AnalyticsConstantsKt.KEY_CONFIG, "Lcom/socure/docv/capturesdk/feature/consent/data/ConsentAdapter$Config;", "accessibilityMessageUseCase", "Lcom/socure/docv/capturesdk/common/utils/AnnounceAccessibilityMessageUseCase;", "(Lcom/socure/docv/capturesdk/feature/consent/data/ConsentAdapter$Config;Lcom/socure/docv/capturesdk/common/utils/AnnounceAccessibilityMessageUseCase;)V", "checkboxClicked", "Lkotlin/Function3;", "", "", "getCheckboxClicked", "()Lkotlin/jvm/functions/Function3;", "setCheckboxClicked", "(Lkotlin/jvm/functions/Function3;)V", "getItemViewType", "", ViewProps.POSITION, "onBindViewHolder", "holder", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "CheckBoxViewHolder", "Config", "DiffItemCallback", "Item", "TextViewHolder", "ViewHolder", "ViewType", "capturesdk_productionRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class ConsentAdapter extends ListAdapter<Item, RecyclerView.ViewHolder> {
    private final AnnounceAccessibilityMessageUseCase accessibilityMessageUseCase;
    private Function3<? super Item, ? super Boolean, ? super Boolean, Unit> checkboxClicked;
    private final Config config;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConsentAdapter(Config config, AnnounceAccessibilityMessageUseCase accessibilityMessageUseCase) {
        super(DiffItemCallback.INSTANCE);
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(accessibilityMessageUseCase, "accessibilityMessageUseCase");
        this.config = config;
        this.accessibilityMessageUseCase = accessibilityMessageUseCase;
    }

    public final Function3<Item, Boolean, Boolean, Unit> getCheckboxClicked() {
        return this.checkboxClicked;
    }

    public final void setCheckboxClicked(Function3<? super Item, ? super Boolean, ? super Boolean, Unit> function3) {
        this.checkboxClicked = function3;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        LayoutInflater from = LayoutInflater.from(parent.getContext());
        if (viewType == 1) {
            View inflate = from.inflate(R.layout.socure_consent_checkbox_item, parent, false);
            Intrinsics.checkNotNullExpressionValue(inflate, "inflater.inflate(\n      …      false\n            )");
            return new CheckBoxViewHolder(this, inflate);
        }
        View inflate2 = from.inflate(R.layout.socure_consent_text_item, parent, false);
        Intrinsics.checkNotNullExpressionValue(inflate2, "inflater.inflate(R.layou…text_item, parent, false)");
        return new TextViewHolder(this, inflate2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(RecyclerView.ViewHolder holder, final int position) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        final Item item = getItem(position);
        if (item instanceof Item.Checkbox) {
            CheckBoxViewHolder checkBoxViewHolder = (CheckBoxViewHolder) holder;
            checkBoxViewHolder.getCheckbox().setTextColor(Color.parseColor(this.config.getCheckboxTextColor()));
            Item.Checkbox checkbox = (Item.Checkbox) item;
            checkBoxViewHolder.getCheckbox().setText(checkbox.getContent());
            checkBoxViewHolder.getCheckbox().setChecked(checkbox.getValue());
            checkBoxViewHolder.getCheckbox().setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: com.socure.docv.capturesdk.feature.consent.data.ConsentAdapter$$ExternalSyntheticLambda0
                @Override // android.widget.CompoundButton.OnCheckedChangeListener
                public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                    ConsentAdapter.onBindViewHolder$lambda$0(position, item, this, compoundButton, z);
                }
            });
            return;
        }
        if (item instanceof Item.Text) {
            TextViewHolder textViewHolder = (TextViewHolder) holder;
            textViewHolder.getText().setTextColor(Color.parseColor(this.config.getTextColor()));
            Item.Text text = (Item.Text) item;
            Markdown.INSTANCE.renderMarkdown$capturesdk_productionRelease(textViewHolder.getText(), text.getValue());
            AnnounceAccessibilityMessageUseCaseKt.queue$default(this.accessibilityMessageUseCase, textViewHolder.getText(), text.getValue(), false, 4, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onBindViewHolder$lambda$0(int i, Item item, ConsentAdapter this$0, CompoundButton compoundButton, boolean z) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Item.Checkbox checkbox = (Item.Checkbox) item;
        LoggerKt.logD("SDLT_CA", "position: " + i + " | mandatory: " + checkbox.getMandatory() + " | isChecked: " + z);
        Function3<? super Item, ? super Boolean, ? super Boolean, Unit> function3 = this$0.checkboxClicked;
        if (function3 != null) {
            Intrinsics.checkNotNullExpressionValue(item, "item");
            function3.invoke(item, Boolean.valueOf(z), Boolean.valueOf(checkbox.getMandatory()));
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int position) {
        Item item = getItem(position);
        if (item instanceof Item.Checkbox) {
            return 1;
        }
        if (item instanceof Item.Text) {
            return 2;
        }
        throw new NoWhenBranchMatchedException();
    }

    /* compiled from: ConsentAdapter.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b'\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/socure/docv/capturesdk/feature/consent/data/ConsentAdapter$ViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "itemView", "Landroid/view/View;", "(Landroid/view/View;)V", "capturesdk_productionRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static abstract class ViewHolder extends RecyclerView.ViewHolder {
        public static final int $stable = 0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ViewHolder(View itemView) {
            super(itemView);
            Intrinsics.checkNotNullParameter(itemView, "itemView");
        }
    }

    /* compiled from: ConsentAdapter.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0004\u0018\u00002\u00020\u0001B\u000f\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/socure/docv/capturesdk/feature/consent/data/ConsentAdapter$TextViewHolder;", "Lcom/socure/docv/capturesdk/feature/consent/data/ConsentAdapter$ViewHolder;", "itemView", "Landroid/view/View;", "(Lcom/socure/docv/capturesdk/feature/consent/data/ConsentAdapter;Landroid/view/View;)V", "text", "Landroid/widget/TextView;", "getText", "()Landroid/widget/TextView;", "setText", "(Landroid/widget/TextView;)V", "capturesdk_productionRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public final class TextViewHolder extends ViewHolder {
        private TextView text;
        final /* synthetic */ ConsentAdapter this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public TextViewHolder(ConsentAdapter consentAdapter, View itemView) {
            super(itemView);
            Intrinsics.checkNotNullParameter(itemView, "itemView");
            this.this$0 = consentAdapter;
            View findViewById = itemView.findViewById(R.id.tv_consent_text);
            Intrinsics.checkNotNullExpressionValue(findViewById, "itemView.findViewById(R.id.tv_consent_text)");
            TextView textView = (TextView) findViewById;
            this.text = textView;
            ViewCompat.enableAccessibleClickableSpanSupport(textView);
        }

        public final TextView getText() {
            return this.text;
        }

        public final void setText(TextView textView) {
            Intrinsics.checkNotNullParameter(textView, "<set-?>");
            this.text = textView;
        }
    }

    /* compiled from: ConsentAdapter.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0004\u0018\u00002\u00020\u0001B\u000f\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/socure/docv/capturesdk/feature/consent/data/ConsentAdapter$CheckBoxViewHolder;", "Lcom/socure/docv/capturesdk/feature/consent/data/ConsentAdapter$ViewHolder;", "itemView", "Landroid/view/View;", "(Lcom/socure/docv/capturesdk/feature/consent/data/ConsentAdapter;Landroid/view/View;)V", AnalyticsConstantsKt.CHECKBOX, "Landroidx/appcompat/widget/AppCompatCheckBox;", "getCheckbox", "()Landroidx/appcompat/widget/AppCompatCheckBox;", "setCheckbox", "(Landroidx/appcompat/widget/AppCompatCheckBox;)V", "capturesdk_productionRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public final class CheckBoxViewHolder extends ViewHolder {
        private AppCompatCheckBox checkbox;
        final /* synthetic */ ConsentAdapter this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public CheckBoxViewHolder(ConsentAdapter consentAdapter, View itemView) {
            super(itemView);
            Intrinsics.checkNotNullParameter(itemView, "itemView");
            this.this$0 = consentAdapter;
            View findViewById = itemView.findViewById(R.id.cb_consent);
            Intrinsics.checkNotNullExpressionValue(findViewById, "itemView.findViewById(R.id.cb_consent)");
            AppCompatCheckBox appCompatCheckBox = (AppCompatCheckBox) findViewById;
            this.checkbox = appCompatCheckBox;
            ViewCompat.enableAccessibleClickableSpanSupport(appCompatCheckBox);
            CompoundButtonCompat.setButtonTintList(this.checkbox, new ColorStateList(new int[][]{new int[]{android.R.attr.state_checked}, new int[0]}, new int[]{Color.parseColor(consentAdapter.config.getCheckboxCheckedColor()), Color.parseColor(consentAdapter.config.getCheckboxUncheckedColor())}));
        }

        public final AppCompatCheckBox getCheckbox() {
            return this.checkbox;
        }

        public final void setCheckbox(AppCompatCheckBox appCompatCheckBox) {
            Intrinsics.checkNotNullParameter(appCompatCheckBox, "<set-?>");
            this.checkbox = appCompatCheckBox;
        }
    }

    /* compiled from: ConsentAdapter.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0007\bB\u000f\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u0082\u0001\u0002\t\n¨\u0006\u000b"}, d2 = {"Lcom/socure/docv/capturesdk/feature/consent/data/ConsentAdapter$Item;", "", "id", "", "(Ljava/lang/String;)V", "getId", "()Ljava/lang/String;", "Checkbox", "Text", "Lcom/socure/docv/capturesdk/feature/consent/data/ConsentAdapter$Item$Checkbox;", "Lcom/socure/docv/capturesdk/feature/consent/data/ConsentAdapter$Item$Text;", "capturesdk_productionRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static abstract class Item {
        public static final int $stable = 0;
        private final String id;

        public /* synthetic */ Item(String str, DefaultConstructorMarker defaultConstructorMarker) {
            this(str);
        }

        private Item(String str) {
            this.id = str;
        }

        public String getId() {
            return this.id;
        }

        /* compiled from: ConsentAdapter.kt */
        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0010\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0005¢\u0006\u0002\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0005HÆ\u0003J1\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00052\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0007\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\r¨\u0006\u001a"}, d2 = {"Lcom/socure/docv/capturesdk/feature/consent/data/ConsentAdapter$Item$Checkbox;", "Lcom/socure/docv/capturesdk/feature/consent/data/ConsentAdapter$Item;", "id", "", AnalyticsConstantsKt.MANDATORY, "", "content", "value", "(Ljava/lang/String;ZLjava/lang/String;Z)V", "getContent", "()Ljava/lang/String;", "getId", "getMandatory", "()Z", "getValue", "component1", "component2", "component3", "component4", "copy", "equals", "other", "", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "capturesdk_productionRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final /* data */ class Checkbox extends Item {
            public static final int $stable = 0;
            private final String content;
            private final String id;
            private final boolean mandatory;
            private final boolean value;

            public static /* synthetic */ Checkbox copy$default(Checkbox checkbox, String str, boolean z, String str2, boolean z2, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = checkbox.getId();
                }
                if ((i & 2) != 0) {
                    z = checkbox.mandatory;
                }
                if ((i & 4) != 0) {
                    str2 = checkbox.content;
                }
                if ((i & 8) != 0) {
                    z2 = checkbox.value;
                }
                return checkbox.copy(str, z, str2, z2);
            }

            public final String component1() {
                return getId();
            }

            /* renamed from: component2, reason: from getter */
            public final boolean getMandatory() {
                return this.mandatory;
            }

            /* renamed from: component3, reason: from getter */
            public final String getContent() {
                return this.content;
            }

            /* renamed from: component4, reason: from getter */
            public final boolean getValue() {
                return this.value;
            }

            public final Checkbox copy(String id, boolean mandatory, String content, boolean value) {
                Intrinsics.checkNotNullParameter(id, "id");
                Intrinsics.checkNotNullParameter(content, "content");
                return new Checkbox(id, mandatory, content, value);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Checkbox)) {
                    return false;
                }
                Checkbox checkbox = (Checkbox) other;
                return Intrinsics.areEqual(getId(), checkbox.getId()) && this.mandatory == checkbox.mandatory && Intrinsics.areEqual(this.content, checkbox.content) && this.value == checkbox.value;
            }

            /* JADX WARN: Multi-variable type inference failed */
            public int hashCode() {
                int hashCode = getId().hashCode() * 31;
                boolean z = this.mandatory;
                int i = z;
                if (z != 0) {
                    i = 1;
                }
                int hashCode2 = (((hashCode + i) * 31) + this.content.hashCode()) * 31;
                boolean z2 = this.value;
                return hashCode2 + (z2 ? 1 : z2 ? 1 : 0);
            }

            public String toString() {
                return "Checkbox(id=" + getId() + ", mandatory=" + this.mandatory + ", content=" + this.content + ", value=" + this.value + ")";
            }

            @Override // com.socure.docv.capturesdk.feature.consent.data.ConsentAdapter.Item
            public String getId() {
                return this.id;
            }

            public final boolean getMandatory() {
                return this.mandatory;
            }

            public final String getContent() {
                return this.content;
            }

            public final boolean getValue() {
                return this.value;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Checkbox(String id, boolean z, String content, boolean z2) {
                super(id, null);
                Intrinsics.checkNotNullParameter(id, "id");
                Intrinsics.checkNotNullParameter(content, "content");
                this.id = id;
                this.mandatory = z;
                this.content = content;
                this.value = z2;
            }
        }

        /* compiled from: ConsentAdapter.kt */
        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0013"}, d2 = {"Lcom/socure/docv/capturesdk/feature/consent/data/ConsentAdapter$Item$Text;", "Lcom/socure/docv/capturesdk/feature/consent/data/ConsentAdapter$Item;", "id", "", "value", "(Ljava/lang/String;Ljava/lang/String;)V", "getId", "()Ljava/lang/String;", "getValue", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "capturesdk_productionRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final /* data */ class Text extends Item {
            public static final int $stable = 0;
            private final String id;
            private final String value;

            public static /* synthetic */ Text copy$default(Text text, String str, String str2, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = text.getId();
                }
                if ((i & 2) != 0) {
                    str2 = text.value;
                }
                return text.copy(str, str2);
            }

            public final String component1() {
                return getId();
            }

            /* renamed from: component2, reason: from getter */
            public final String getValue() {
                return this.value;
            }

            public final Text copy(String id, String value) {
                Intrinsics.checkNotNullParameter(id, "id");
                Intrinsics.checkNotNullParameter(value, "value");
                return new Text(id, value);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Text)) {
                    return false;
                }
                Text text = (Text) other;
                return Intrinsics.areEqual(getId(), text.getId()) && Intrinsics.areEqual(this.value, text.value);
            }

            public int hashCode() {
                return (getId().hashCode() * 31) + this.value.hashCode();
            }

            public String toString() {
                return "Text(id=" + getId() + ", value=" + this.value + ")";
            }

            @Override // com.socure.docv.capturesdk.feature.consent.data.ConsentAdapter.Item
            public String getId() {
                return this.id;
            }

            public final String getValue() {
                return this.value;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Text(String id, String value) {
                super(id, null);
                Intrinsics.checkNotNullParameter(id, "id");
                Intrinsics.checkNotNullParameter(value, "value");
                this.id = id;
                this.value = value;
            }
        }
    }

    /* compiled from: ConsentAdapter.kt */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J1\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\tR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\t¨\u0006\u0018"}, d2 = {"Lcom/socure/docv/capturesdk/feature/consent/data/ConsentAdapter$Config;", "", "checkboxTextColor", "", "checkboxCheckedColor", "checkboxUncheckedColor", TextColorProp.name, "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getCheckboxCheckedColor", "()Ljava/lang/String;", "getCheckboxTextColor", "getCheckboxUncheckedColor", "getTextColor", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "capturesdk_productionRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class Config {
        public static final int $stable = 0;
        private final String checkboxCheckedColor;
        private final String checkboxTextColor;
        private final String checkboxUncheckedColor;
        private final String textColor;

        public static /* synthetic */ Config copy$default(Config config, String str, String str2, String str3, String str4, int i, Object obj) {
            if ((i & 1) != 0) {
                str = config.checkboxTextColor;
            }
            if ((i & 2) != 0) {
                str2 = config.checkboxCheckedColor;
            }
            if ((i & 4) != 0) {
                str3 = config.checkboxUncheckedColor;
            }
            if ((i & 8) != 0) {
                str4 = config.textColor;
            }
            return config.copy(str, str2, str3, str4);
        }

        /* renamed from: component1, reason: from getter */
        public final String getCheckboxTextColor() {
            return this.checkboxTextColor;
        }

        /* renamed from: component2, reason: from getter */
        public final String getCheckboxCheckedColor() {
            return this.checkboxCheckedColor;
        }

        /* renamed from: component3, reason: from getter */
        public final String getCheckboxUncheckedColor() {
            return this.checkboxUncheckedColor;
        }

        /* renamed from: component4, reason: from getter */
        public final String getTextColor() {
            return this.textColor;
        }

        public final Config copy(String checkboxTextColor, String checkboxCheckedColor, String checkboxUncheckedColor, String textColor) {
            Intrinsics.checkNotNullParameter(checkboxTextColor, "checkboxTextColor");
            Intrinsics.checkNotNullParameter(checkboxCheckedColor, "checkboxCheckedColor");
            Intrinsics.checkNotNullParameter(checkboxUncheckedColor, "checkboxUncheckedColor");
            Intrinsics.checkNotNullParameter(textColor, "textColor");
            return new Config(checkboxTextColor, checkboxCheckedColor, checkboxUncheckedColor, textColor);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Config)) {
                return false;
            }
            Config config = (Config) other;
            return Intrinsics.areEqual(this.checkboxTextColor, config.checkboxTextColor) && Intrinsics.areEqual(this.checkboxCheckedColor, config.checkboxCheckedColor) && Intrinsics.areEqual(this.checkboxUncheckedColor, config.checkboxUncheckedColor) && Intrinsics.areEqual(this.textColor, config.textColor);
        }

        public int hashCode() {
            return (((((this.checkboxTextColor.hashCode() * 31) + this.checkboxCheckedColor.hashCode()) * 31) + this.checkboxUncheckedColor.hashCode()) * 31) + this.textColor.hashCode();
        }

        public String toString() {
            return "Config(checkboxTextColor=" + this.checkboxTextColor + ", checkboxCheckedColor=" + this.checkboxCheckedColor + ", checkboxUncheckedColor=" + this.checkboxUncheckedColor + ", textColor=" + this.textColor + ")";
        }

        public Config(String checkboxTextColor, String checkboxCheckedColor, String checkboxUncheckedColor, String textColor) {
            Intrinsics.checkNotNullParameter(checkboxTextColor, "checkboxTextColor");
            Intrinsics.checkNotNullParameter(checkboxCheckedColor, "checkboxCheckedColor");
            Intrinsics.checkNotNullParameter(checkboxUncheckedColor, "checkboxUncheckedColor");
            Intrinsics.checkNotNullParameter(textColor, "textColor");
            this.checkboxTextColor = checkboxTextColor;
            this.checkboxCheckedColor = checkboxCheckedColor;
            this.checkboxUncheckedColor = checkboxUncheckedColor;
            this.textColor = textColor;
        }

        public final String getCheckboxTextColor() {
            return this.checkboxTextColor;
        }

        public final String getCheckboxCheckedColor() {
            return this.checkboxCheckedColor;
        }

        public final String getCheckboxUncheckedColor() {
            return this.checkboxUncheckedColor;
        }

        public final String getTextColor() {
            return this.textColor;
        }
    }

    /* compiled from: ConsentAdapter.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0003J\u0018\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H\u0016J\u0018\u0010\b\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H\u0016¨\u0006\t"}, d2 = {"Lcom/socure/docv/capturesdk/feature/consent/data/ConsentAdapter$DiffItemCallback;", "Landroidx/recyclerview/widget/DiffUtil$ItemCallback;", "Lcom/socure/docv/capturesdk/feature/consent/data/ConsentAdapter$Item;", "()V", "areContentsTheSame", "", "p0", "p1", "areItemsTheSame", "capturesdk_productionRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class DiffItemCallback extends DiffUtil.ItemCallback<Item> {
        public static final int $stable = 0;
        public static final DiffItemCallback INSTANCE = new DiffItemCallback();

        private DiffItemCallback() {
        }

        @Override // androidx.recyclerview.widget.DiffUtil.ItemCallback
        public boolean areItemsTheSame(Item p0, Item p1) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            Intrinsics.checkNotNullParameter(p1, "p1");
            return Intrinsics.areEqual(p0, p1);
        }

        @Override // androidx.recyclerview.widget.DiffUtil.ItemCallback
        public boolean areContentsTheSame(Item p0, Item p1) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            Intrinsics.checkNotNullParameter(p1, "p1");
            return Intrinsics.areEqual(p0, p1);
        }
    }

    /* compiled from: ConsentAdapter.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/socure/docv/capturesdk/feature/consent/data/ConsentAdapter$ViewType;", "", "()V", "CHECKBOX", "", "LABEL", "capturesdk_productionRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class ViewType {
        public static final int $stable = 0;
        public static final int CHECKBOX = 1;
        public static final ViewType INSTANCE = new ViewType();
        public static final int LABEL = 2;

        private ViewType() {
        }
    }
}
