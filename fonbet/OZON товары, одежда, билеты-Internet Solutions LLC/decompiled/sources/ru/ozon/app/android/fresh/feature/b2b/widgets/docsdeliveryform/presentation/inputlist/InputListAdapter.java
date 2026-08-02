package ru.ozon.app.android.fresh.feature.b2b.widgets.docsdeliveryform.presentation.inputlist;

import Sc.o;
import Ve.C4636t5;
import Xc.a;
import Xc.b;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.t;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.fresh.feature.b2b.databinding.CheckboxInputItemBinding;
import ru.ozon.app.android.fresh.feature.b2b.databinding.TextInputWithErrorBinding;
import ru.ozon.app.android.fresh.feature.b2b.widgets.docsdeliveryform.presentation.DocsDeliveryFormVO;
import ru.ozon.app.android.fresh.feature.b2b.widgets.docsdeliveryform.view.B2BTextWithErrorInputLayout;

@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010!\n\u0002\u0010\u0000\n\u0002\b\t\b\u0001\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001)B=\u0012\u001a\u0010\u0007\u001a\u0016\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0012\u0004\u0012\u00020\u00060\u0004\u0012\u0018\u0010\t\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0004\b\n\u0010\u000bJ-\u0010\u0012\u001a\u00020\u00062\b\u0010\r\u001a\u0004\u0018\u00010\f2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J-\u0010\u0017\u001a\u00020\u00062\b\u0010\r\u001a\u0004\u0018\u00010\u00142\b\u0010\u000f\u001a\u0004\u0018\u00010\u00152\b\u0010\u0011\u001a\u0004\u0018\u00010\u0016H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u001f\u0010\u001d\u001a\u00020\u00032\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u001bH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ-\u0010#\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u001f\u001a\u00020\u001b2\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020!0 H\u0016¢\u0006\u0004\b#\u0010$J\u001f\u0010#\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u001f\u001a\u00020\u001bH\u0016¢\u0006\u0004\b#\u0010%J\u0017\u0010&\u001a\u00020\u001b2\u0006\u0010\u001f\u001a\u00020\u001bH\u0016¢\u0006\u0004\b&\u0010'R(\u0010\u0007\u001a\u0016\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0012\u0004\u0012\u00020\u00060\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010(R&\u0010\t\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00060\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010(¨\u0006*"}, d2 = {"Lru/ozon/app/android/fresh/feature/b2b/widgets/docsdeliveryform/presentation/inputlist/InputListAdapter;", "Landroidx/recyclerview/widget/t;", "Lru/ozon/app/android/fresh/feature/b2b/widgets/docsdeliveryform/presentation/DocsDeliveryFormVO$Input;", "Lru/ozon/app/android/fresh/feature/b2b/widgets/docsdeliveryform/presentation/inputlist/InputViewHolder;", "Lkotlin/Function2;", "", "", "onTextInputChanged", "", "onCheckedChanged", "<init>", "(Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;)V", "Lru/ozon/app/android/fresh/feature/b2b/widgets/docsdeliveryform/presentation/inputlist/TextInputPayload;", "payload", "Lru/ozon/app/android/fresh/feature/b2b/widgets/docsdeliveryform/presentation/DocsDeliveryFormVO$Input$TextInput;", "item", "Lru/ozon/app/android/fresh/feature/b2b/widgets/docsdeliveryform/presentation/inputlist/TextInputViewHolder;", "holder", "handleTextInputPayload", "(Lru/ozon/app/android/fresh/feature/b2b/widgets/docsdeliveryform/presentation/inputlist/TextInputPayload;Lru/ozon/app/android/fresh/feature/b2b/widgets/docsdeliveryform/presentation/DocsDeliveryFormVO$Input$TextInput;Lru/ozon/app/android/fresh/feature/b2b/widgets/docsdeliveryform/presentation/inputlist/TextInputViewHolder;)V", "Lru/ozon/app/android/fresh/feature/b2b/widgets/docsdeliveryform/presentation/inputlist/CheckBoxInputPayload;", "Lru/ozon/app/android/fresh/feature/b2b/widgets/docsdeliveryform/presentation/DocsDeliveryFormVO$Input$CheckBoxInput;", "Lru/ozon/app/android/fresh/feature/b2b/widgets/docsdeliveryform/presentation/inputlist/CheckBoxViewHolder;", "handleCheckBoxInputPayload", "(Lru/ozon/app/android/fresh/feature/b2b/widgets/docsdeliveryform/presentation/inputlist/CheckBoxInputPayload;Lru/ozon/app/android/fresh/feature/b2b/widgets/docsdeliveryform/presentation/DocsDeliveryFormVO$Input$CheckBoxInput;Lru/ozon/app/android/fresh/feature/b2b/widgets/docsdeliveryform/presentation/inputlist/CheckBoxViewHolder;)V", "Landroid/view/ViewGroup;", "parent", "", "viewType", "onCreateViewHolder", "(Landroid/view/ViewGroup;I)Lru/ozon/app/android/fresh/feature/b2b/widgets/docsdeliveryform/presentation/inputlist/InputViewHolder;", "position", "", "", "payloads", "onBindViewHolder", "(Lru/ozon/app/android/fresh/feature/b2b/widgets/docsdeliveryform/presentation/inputlist/InputViewHolder;ILjava/util/List;)V", "(Lru/ozon/app/android/fresh/feature/b2b/widgets/docsdeliveryform/presentation/inputlist/InputViewHolder;I)V", "getItemViewType", "(I)I", "Lkotlin/jvm/functions/Function2;", "Type", "b2b_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class InputListAdapter extends t<DocsDeliveryFormVO.Input, InputViewHolder> {

    @NotNull
    private final Function2<String, Boolean, Unit> onCheckedChanged;

    @NotNull
    private final Function2<String, String, Unit> onTextInputChanged;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"Lru/ozon/app/android/fresh/feature/b2b/widgets/docsdeliveryform/presentation/inputlist/InputListAdapter$Type;", "", "type", "", "<init>", "(Ljava/lang/String;II)V", "getType", "()I", "CHECKBOX", "TEXT", "b2b_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Type {
        private static final /* synthetic */ a $ENTRIES;
        private static final /* synthetic */ Type[] $VALUES;
        public static final Type CHECKBOX = new Type("CHECKBOX", 0, 0);
        public static final Type TEXT = new Type("TEXT", 1, 1);
        private final int type;

        private static final /* synthetic */ Type[] $values() {
            return new Type[]{CHECKBOX, TEXT};
        }

        static {
            Type[] $values = $values();
            $VALUES = $values;
            $ENTRIES = b.a($values);
        }

        private Type(String str, int i11, int i12) {
            this.type = i12;
        }

        public static Type valueOf(String str) {
            return (Type) Enum.valueOf(Type.class, str);
        }

        public static Type[] values() {
            return (Type[]) $VALUES.clone();
        }

        public final int getType() {
            return this.type;
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[TextInputPayload.values().length];
            try {
                iArr[TextInputPayload.ERROR.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[TextInputPayload.VALUE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[TextInputPayload.ENABLED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[CheckBoxInputPayload.values().length];
            try {
                iArr2[CheckBoxInputPayload.CHECKED.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[CheckBoxInputPayload.LABEL.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public InputListAdapter(@NotNull Function2<? super String, ? super String, Unit> onTextInputChanged, @NotNull Function2<? super String, ? super Boolean, Unit> onCheckedChanged) {
        super(new InputDiffCallback());
        Intrinsics.checkNotNullParameter(onTextInputChanged, "onTextInputChanged");
        Intrinsics.checkNotNullParameter(onCheckedChanged, "onCheckedChanged");
        this.onTextInputChanged = onTextInputChanged;
        this.onCheckedChanged = onCheckedChanged;
    }

    private final void handleCheckBoxInputPayload(CheckBoxInputPayload payload, DocsDeliveryFormVO.Input.CheckBoxInput item, CheckBoxViewHolder holder) {
        int i11 = payload == null ? -1 : WhenMappings.$EnumSwitchMapping$1[payload.ordinal()];
        if (i11 == 1) {
            if (holder != null) {
                holder.setChecked(item != null ? Boolean.valueOf(item.getChecked()) : null);
            }
        } else if (i11 == 2 && holder != null) {
            holder.setLabel(item != null ? item.getLabel() : null);
        }
    }

    private final void handleTextInputPayload(TextInputPayload payload, DocsDeliveryFormVO.Input.TextInput item, TextInputViewHolder holder) {
        int i11 = payload == null ? -1 : WhenMappings.$EnumSwitchMapping$0[payload.ordinal()];
        if (i11 == 1) {
            if (holder != null) {
                holder.setError(item != null ? item.getError() : null);
            }
        } else if (i11 == 2) {
            if (holder != null) {
                holder.setValue(item != null ? item.getValue() : null);
            }
        } else if (i11 == 3 && holder != null) {
            holder.setEnabled(item != null ? Boolean.valueOf(item.getIsEnabled()) : null);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public int getItemViewType(int position) {
        DocsDeliveryFormVO.Input item = getItem(position);
        if (item instanceof DocsDeliveryFormVO.Input.CheckBoxInput) {
            return Type.CHECKBOX.getType();
        }
        if (item instanceof DocsDeliveryFormVO.Input.TextInput) {
            return Type.TEXT.getType();
        }
        throw new o();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    @NotNull
    public InputViewHolder onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
        LayoutInflater a11 = C4636t5.a(parent, "parent");
        if (viewType == Type.CHECKBOX.getType()) {
            CheckboxInputItemBinding inflate = CheckboxInputItemBinding.inflate(a11, parent, false);
            Intrinsics.checkNotNullExpressionValue(inflate, "inflate(...)");
            return new CheckBoxViewHolder(inflate, this.onCheckedChanged);
        }
        Context context = parent.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        TextInputWithErrorBinding bind = TextInputWithErrorBinding.bind(new B2BTextWithErrorInputLayout(context, null, 0, 6, null));
        Intrinsics.checkNotNullExpressionValue(bind, "bind(...)");
        return new TextInputViewHolder(bind, this.onTextInputChanged);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public /* bridge */ /* synthetic */ void onBindViewHolder(RecyclerView.C c11, int i11, List list) {
        onBindViewHolder((InputViewHolder) c11, i11, (List<Object>) list);
    }

    public void onBindViewHolder(@NotNull InputViewHolder holder, int position, @NotNull List<Object> payloads) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(payloads, "payloads");
        Object M11 = C7714v.M(payloads);
        List list = M11 instanceof List ? (List) M11 : null;
        if (list == null) {
            super.onBindViewHolder((InputListAdapter) holder, position, payloads);
            return;
        }
        DocsDeliveryFormVO.Input item = getItem(position);
        for (Object obj : list) {
            if (obj instanceof TextInputPayload) {
                handleTextInputPayload((TextInputPayload) obj, item instanceof DocsDeliveryFormVO.Input.TextInput ? (DocsDeliveryFormVO.Input.TextInput) item : null, holder instanceof TextInputViewHolder ? (TextInputViewHolder) holder : null);
            } else if (obj instanceof CheckBoxInputPayload) {
                handleCheckBoxInputPayload((CheckBoxInputPayload) obj, item instanceof DocsDeliveryFormVO.Input.CheckBoxInput ? (DocsDeliveryFormVO.Input.CheckBoxInput) item : null, holder instanceof CheckBoxViewHolder ? (CheckBoxViewHolder) holder : null);
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public void onBindViewHolder(@NotNull InputViewHolder holder, int position) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        DocsDeliveryFormVO.Input input = getCurrentList().get(position);
        Intrinsics.checkNotNullExpressionValue(input, "get(...)");
        holder.bindItem(input);
    }
}
