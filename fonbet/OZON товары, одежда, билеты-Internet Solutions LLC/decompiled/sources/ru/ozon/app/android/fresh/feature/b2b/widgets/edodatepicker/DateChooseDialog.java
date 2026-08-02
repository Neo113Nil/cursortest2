package ru.ozon.app.android.fresh.feature.b2b.widgets.edodatepicker;

import Ar.d;
import Xc.a;
import Xc.b;
import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.fragment.app.DialogInterfaceOnCancelListenerC5390k;
import java.util.Calendar;
import java.util.Date;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.fresh.feature.b2b.R$string;
import ru.ozon.app.android.fresh.feature.b2b.databinding.ChooseDateDialogFragmentBinding;
import ru.ozon.app.android.fresh.feature.b2b.utils.UtilsKt;
import ru.ozon.app.android.uikit.text.StringProvider;

@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\b\u0001\u0018\u0000 '2\u00020\u0001:\u0002'(B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0003J\u000f\u0010\u0006\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0006\u0010\u0003J\u000f\u0010\u0007\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\u0003J\u001b\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0019\u0010\u000f\u001a\u00020\u00042\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J-\u0010\u0016\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u0012\u001a\u00020\u00112\b\u0010\u0014\u001a\u0004\u0018\u00010\u00132\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0016¢\u0006\u0004\b\u0016\u0010\u0017J!\u0010\u0019\u001a\u00020\u00042\u0006\u0010\u0018\u001a\u00020\u00152\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u001b\u0010\u0003R\u0018\u0010\u001d\u001a\u0004\u0018\u00010\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0018\u0010\t\u001a\u0004\u0018\u00010\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\t\u0010\u001fR\u0018\u0010!\u001a\u0004\u0018\u00010 8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010\"R\u0018\u0010#\u001a\u0004\u0018\u00010 8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010\"R\u0014\u0010&\u001a\u00020\u001c8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b$\u0010%¨\u0006)"}, d2 = {"Lru/ozon/app/android/fresh/feature/b2b/widgets/edodatepicker/DateChooseDialog;", "Landroidx/fragment/app/k;", "<init>", "()V", "", "setupDialog", "initClicks", "passResult", "Lru/ozon/app/android/fresh/feature/b2b/widgets/edodatepicker/DateChooseDialog$Type;", "type", "", "getRequestKey", "(Lru/ozon/app/android/fresh/feature/b2b/widgets/edodatepicker/DateChooseDialog$Type;)Ljava/lang/String;", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "view", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "onDestroyView", "Lru/ozon/app/android/fresh/feature/b2b/databinding/ChooseDateDialogFragmentBinding;", "_binding", "Lru/ozon/app/android/fresh/feature/b2b/databinding/ChooseDateDialogFragmentBinding;", "Lru/ozon/app/android/fresh/feature/b2b/widgets/edodatepicker/DateChooseDialog$Type;", "Ljava/util/Date;", "constraintDate", "Ljava/util/Date;", "currentDate", "getBinding", "()Lru/ozon/app/android/fresh/feature/b2b/databinding/ChooseDateDialogFragmentBinding;", "binding", "Companion", "Type", "b2b_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class DateChooseDialog extends DialogInterfaceOnCancelListenerC5390k {
    private ChooseDateDialogFragmentBinding _binding;
    private Date constraintDate;
    private Date currentDate;
    private Type type;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\"\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lru/ozon/app/android/fresh/feature/b2b/widgets/edodatepicker/DateChooseDialog$Companion;", "", "<init>", "()V", "KEY_CURRENT_DATE", "", "KEY_CONSTRAINT_DATE", "KEY_TYPE", "KEY_DATE", "REQUEST_KEY_START", "REQUEST_KEY_END", "newInstance", "Lru/ozon/app/android/fresh/feature/b2b/widgets/edodatepicker/DateChooseDialog;", "type", "Lru/ozon/app/android/fresh/feature/b2b/widgets/edodatepicker/DateChooseDialog$Type;", "currentDate", "Ljava/util/Date;", "constraintDate", "b2b_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final DateChooseDialog newInstance(@NotNull Type type, Date currentDate, Date constraintDate) {
            Intrinsics.checkNotNullParameter(type, "type");
            DateChooseDialog dateChooseDialog = new DateChooseDialog();
            Bundle bundle = new Bundle();
            bundle.putSerializable("type", type);
            bundle.putSerializable("current_date", currentDate);
            bundle.putSerializable("constraint_date", constraintDate);
            dateChooseDialog.setArguments(bundle);
            return dateChooseDialog;
        }

        private Companion() {
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lru/ozon/app/android/fresh/feature/b2b/widgets/edodatepicker/DateChooseDialog$Type;", "", "<init>", "(Ljava/lang/String;I)V", "START", "END", "b2b_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Type {
        private static final /* synthetic */ a $ENTRIES;
        private static final /* synthetic */ Type[] $VALUES;
        public static final Type START = new Type("START", 0);
        public static final Type END = new Type("END", 1);

        private static final /* synthetic */ Type[] $values() {
            return new Type[]{START, END};
        }

        static {
            Type[] $values = $values();
            $VALUES = $values;
            $ENTRIES = b.a($values);
        }

        private Type(String str, int i11) {
        }

        public static Type valueOf(String str) {
            return (Type) Enum.valueOf(Type.class, str);
        }

        public static Type[] values() {
            return (Type[]) $VALUES.clone();
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Type.values().length];
            try {
                iArr[Type.START.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Type.END.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private final ChooseDateDialogFragmentBinding getBinding() {
        ChooseDateDialogFragmentBinding chooseDateDialogFragmentBinding = this._binding;
        if (chooseDateDialogFragmentBinding != null) {
            return chooseDateDialogFragmentBinding;
        }
        throw new IllegalArgumentException("Required value was null.");
    }

    private final String getRequestKey(Type type) {
        int i11 = type == null ? -1 : WhenMappings.$EnumSwitchMapping$0[type.ordinal()];
        if (i11 == 1) {
            return "request_key_start";
        }
        if (i11 != 2) {
            return null;
        }
        return "request_key_end";
    }

    private final void initClicks() {
        ChooseDateDialogFragmentBinding binding = getBinding();
        binding.okBtn.setOnClickListener(new d(this, 5));
        binding.cancelBtn.setOnClickListener(new DN.a(this, 5));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void passResult() {
        dismiss();
        String requestKey = getRequestKey(this.type);
        if (requestKey != null) {
            ChooseDateDialogFragmentBinding binding = getBinding();
            getParentFragmentManager().m1(androidx.core.os.d.b(new Pair("key_date", UtilsKt.getDate(binding.datePicker.getDayOfMonth(), binding.datePicker.getMonth(), binding.datePicker.getYear(), this.type))), requestKey);
        }
    }

    private final void setupDialog() {
        TextView textView;
        ChooseDateDialogFragmentBinding chooseDateDialogFragmentBinding = this._binding;
        if (chooseDateDialogFragmentBinding != null) {
            Date date = this.currentDate;
            if (date == null) {
                date = this.constraintDate;
            }
            if (date != null) {
                Calendar calendar = Calendar.getInstance();
                calendar.setTime(date);
                chooseDateDialogFragmentBinding.datePicker.updateDate(calendar.get(1), calendar.get(2), calendar.get(5));
            }
            if (this.type == Type.START) {
                chooseDateDialogFragmentBinding.titleTv.setText(StringProvider.getString(R$string.edo_date_picker_start));
                Date date2 = this.constraintDate;
                if (date2 != null) {
                    chooseDateDialogFragmentBinding.datePicker.setMaxDate(date2.getTime());
                    return;
                }
                return;
            }
            ChooseDateDialogFragmentBinding chooseDateDialogFragmentBinding2 = this._binding;
            if (chooseDateDialogFragmentBinding2 != null && (textView = chooseDateDialogFragmentBinding2.titleTv) != null) {
                textView.setText(StringProvider.getString(R$string.edo_date_picker_end));
            }
            Date date3 = this.constraintDate;
            if (date3 != null) {
                chooseDateDialogFragmentBinding.datePicker.setMinDate(date3.getTime());
            }
        }
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC5390k, androidx.fragment.app.ComponentCallbacksC5392m
    public void onCreate(Bundle savedInstanceState) {
        Type type;
        Date date;
        Object obj;
        Object serializable;
        Object obj2;
        Object serializable2;
        Object obj3;
        Object serializable3;
        super.onCreate(savedInstanceState);
        Bundle arguments = getArguments();
        Date date2 = null;
        if (arguments != null) {
            if (Build.VERSION.SDK_INT >= 33) {
                serializable3 = arguments.getSerializable("type", Type.class);
                obj3 = serializable3;
            } else {
                Object serializable4 = arguments.getSerializable("type");
                if (!(serializable4 instanceof Type)) {
                    serializable4 = null;
                }
                obj3 = (Type) serializable4;
            }
            type = (Type) obj3;
        } else {
            type = null;
        }
        this.type = type;
        Bundle arguments2 = getArguments();
        if (arguments2 != null) {
            if (Build.VERSION.SDK_INT >= 33) {
                serializable2 = arguments2.getSerializable("constraint_date", Date.class);
                obj2 = serializable2;
            } else {
                Object serializable5 = arguments2.getSerializable("constraint_date");
                if (!(serializable5 instanceof Date)) {
                    serializable5 = null;
                }
                obj2 = (Date) serializable5;
            }
            date = (Date) obj2;
        } else {
            date = null;
        }
        this.constraintDate = date;
        Bundle arguments3 = getArguments();
        if (arguments3 != null) {
            if (Build.VERSION.SDK_INT >= 33) {
                serializable = arguments3.getSerializable("current_date", Date.class);
                obj = serializable;
            } else {
                Object serializable6 = arguments3.getSerializable("current_date");
                obj = (Date) (serializable6 instanceof Date ? serializable6 : null);
            }
            date2 = (Date) obj;
        }
        this.currentDate = date2;
    }

    @Override // androidx.fragment.app.ComponentCallbacksC5392m
    public View onCreateView(@NotNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        ChooseDateDialogFragmentBinding inflate = ChooseDateDialogFragmentBinding.inflate(inflater, container, false);
        this._binding = inflate;
        if (inflate != null) {
            return inflate.getConstraintLayout();
        }
        return null;
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC5390k, androidx.fragment.app.ComponentCallbacksC5392m
    public void onDestroyView() {
        super.onDestroyView();
        this._binding = null;
    }

    @Override // androidx.fragment.app.ComponentCallbacksC5392m
    public void onViewCreated(@NotNull View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        setupDialog();
        initClicks();
    }
}
