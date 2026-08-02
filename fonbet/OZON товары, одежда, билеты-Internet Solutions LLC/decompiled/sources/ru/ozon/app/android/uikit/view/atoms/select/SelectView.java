package ru.ozon.app.android.uikit.view.atoms.select;

import DN.b;
import Sc.InterfaceC3999a;
import android.content.Context;
import android.content.DialogInterface;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import androidx.appcompat.app.f;
import androidx.appcompat.widget.AppCompatTextView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.uikit.R$style;
import ru.ozon.app.android.uikit.view.atoms.select.SelectView;
import ru.ozon.app.android.uikit.view.atoms.select.dialog.SelectAtomDialogAdapter;
import ru.ozon.app.android.uikit.view.atoms.select.dialog.SelectModel;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.android.uikit.extensions.view.TextViewExtKt;
import ru.ozon.uni.android.uikit.view.atoms.AtomView;
import ru.ozon.uni.android.uikitsdk.resources.DrawableResource;
import ru.ozon.uni.core.R$drawable;

@InterfaceC3999a
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010!\n\u0002\b\u0006\b\u0007\u0018\u0000 ,2\u00020\u00012\u00020\u0002:\u0001,B'\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u001b\u0010\u0014\u001a\u00020\u000b2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011¢\u0006\u0004\b\u0014\u0010\u0015J\u0015\u0010\u0017\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u0016¢\u0006\u0004\b\u0017\u0010\u0018R0\u0010\u001a\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u00198\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR*\u0010!\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010 8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R\u001a\u0010(\u001a\b\u0012\u0004\u0012\u00020\u00120'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u0018\u0010*\u001a\u0004\u0018\u00010\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b*\u0010+¨\u0006-"}, d2 = {"Lru/ozon/app/android/uikit/view/atoms/select/SelectView;", "Landroidx/appcompat/widget/AppCompatTextView;", "Lru/ozon/uni/android/uikit/view/atoms/AtomView;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "", "showDialog", "()V", "icon", "setDrawableEnd", "(I)V", "", "Lru/ozon/app/android/uikit/view/atoms/select/dialog/SelectModel;", "models", "bind", "(Ljava/util/List;)V", "", "setIcon", "(Ljava/lang/String;)V", "Lkotlin/Function1;", "onDialogItemClick", "Lkotlin/jvm/functions/Function1;", "getOnDialogItemClick", "()Lkotlin/jvm/functions/Function1;", "setOnDialogItemClick", "(Lkotlin/jvm/functions/Function1;)V", "Lkotlin/Function0;", "onClickListenerDecorator", "Lkotlin/jvm/functions/Function0;", "getOnClickListenerDecorator", "()Lkotlin/jvm/functions/Function0;", "setOnClickListenerDecorator", "(Lkotlin/jvm/functions/Function0;)V", "", "dialogItems", "Ljava/util/List;", "currentIcon", "Ljava/lang/Integer;", "Companion", "ui-kit_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class SelectView extends AppCompatTextView implements AtomView {
    private Integer currentIcon;

    @NotNull
    private final List<SelectModel> dialogItems;
    private Function0<Unit> onClickListenerDecorator;
    private Function1<? super Integer, Unit> onDialogItemClick;
    private static final int DROPDOWN_ICON = R$drawable.ic_s_dropdown;
    private static final int SORT_ICON = R$drawable.ic_s_sort;
    private static final int ROLLUP_ICON = R$drawable.ic_s_dropdown_collapse;
    private static final int dp4 = ResourceExtKt.toPx(4);
    private static final int dp8 = ResourceExtKt.toPx(8);
    private static final int dp16 = ResourceExtKt.toPx(16);

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SelectView(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$0(SelectView selectView, View view) {
        Function0<Unit> function0 = selectView.onClickListenerDecorator;
        if (function0 != null) {
            function0.invoke();
        }
        selectView.showDialog();
    }

    private final void setDrawableEnd(int icon) {
        TextViewExtKt.setVectorDrawableEnd(this, icon);
        setCompoundDrawablePadding(icon == SORT_ICON ? dp8 : dp4);
        this.currentIcon = Integer.valueOf(icon);
    }

    private final void showDialog() {
        if (this.dialogItems.isEmpty()) {
            return;
        }
        f.a aVar = new f.a(getContext(), R$style.OzAlertDialog);
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        List<SelectModel> list = this.dialogItems;
        ArrayList arrayList = new ArrayList(C7714v.z(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((SelectModel) it.next()).getLabel());
        }
        SelectAtomDialogAdapter selectAtomDialogAdapter = new SelectAtomDialogAdapter(context, arrayList);
        Iterator<SelectModel> it2 = this.dialogItems.iterator();
        int i11 = 0;
        while (true) {
            if (!it2.hasNext()) {
                i11 = -1;
                break;
            } else if (it2.next().getIsChecked()) {
                break;
            } else {
                i11++;
            }
        }
        aVar.n(selectAtomDialogAdapter, i11, new DialogInterface.OnClickListener() { // from class: vX.a
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i12) {
                SelectView.showDialog$lambda$4(SelectView.this, dialogInterface, i12);
            }
        });
        aVar.k(new DialogInterface.OnDismissListener() { // from class: vX.b
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                SelectView.showDialog$lambda$5(SelectView.this, dialogInterface);
            }
        });
        aVar.j(new DialogInterface.OnCancelListener() { // from class: vX.c
            @Override // android.content.DialogInterface.OnCancelListener
            public final void onCancel(DialogInterface dialogInterface) {
                SelectView.showDialog$lambda$6(SelectView.this, dialogInterface);
            }
        });
        Integer num = this.currentIcon;
        int i12 = DROPDOWN_ICON;
        if (num != null && num.intValue() == i12) {
            setDrawableEnd(ROLLUP_ICON);
        }
        aVar.q();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void showDialog$lambda$4(SelectView selectView, DialogInterface dialogInterface, int i11) {
        Function1<? super Integer, Unit> function1 = selectView.onDialogItemClick;
        if (function1 != null) {
            function1.invoke(Integer.valueOf(i11));
        }
        Integer num = selectView.currentIcon;
        int i12 = ROLLUP_ICON;
        if (num != null && num.intValue() == i12) {
            selectView.setDrawableEnd(DROPDOWN_ICON);
        }
        dialogInterface.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void showDialog$lambda$5(SelectView selectView, DialogInterface dialogInterface) {
        Integer num = selectView.currentIcon;
        int i11 = ROLLUP_ICON;
        if (num != null && num.intValue() == i11) {
            selectView.setDrawableEnd(DROPDOWN_ICON);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void showDialog$lambda$6(SelectView selectView, DialogInterface dialogInterface) {
        Integer num = selectView.currentIcon;
        int i11 = ROLLUP_ICON;
        if (num != null && num.intValue() == i11) {
            selectView.setDrawableEnd(DROPDOWN_ICON);
        }
    }

    public final void bind(@NotNull List<SelectModel> models) {
        Object obj;
        String str;
        Intrinsics.checkNotNullParameter(models, "models");
        this.dialogItems.clear();
        this.dialogItems.addAll(models);
        Iterator<T> it = this.dialogItems.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            } else {
                obj = it.next();
                if (((SelectModel) obj).getIsChecked()) {
                    break;
                }
            }
        }
        SelectModel selectModel = (SelectModel) obj;
        if (selectModel == null || (str = selectModel.getLabel()) == null) {
            str = "";
        }
        setText(str);
    }

    public final void setIcon(@NotNull String icon) {
        int i11;
        Intrinsics.checkNotNullParameter(icon, "icon");
        DrawableResource fromToken = DrawableResource.INSTANCE.fromToken(icon);
        if (fromToken != null) {
            Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            Integer resId = fromToken.getResId(context);
            if (resId != null) {
                i11 = resId.intValue();
                setDrawableEnd(i11);
            }
        }
        i11 = DROPDOWN_ICON;
        setDrawableEnd(i11);
    }

    public final void setOnClickListenerDecorator(Function0<Unit> function0) {
        this.onClickListenerDecorator = function0;
    }

    public final void setOnDialogItemClick(Function1<? super Integer, Unit> function1) {
        this.onDialogItemClick = function1;
    }

    public /* synthetic */ SelectView(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SelectView(@NotNull Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        Intrinsics.checkNotNullParameter(context, "context");
        this.dialogItems = new ArrayList();
        setBackgroundResource(ru.ozon.app.android.uikit.R$drawable.select_atom_view_background);
        setCompoundDrawablePadding(dp4);
        setEllipsize(TextUtils.TruncateAt.END);
        setGravity(16);
        setIncludeFontPadding(false);
        int i12 = dp16;
        int i13 = dp8;
        setPadding(i12, i13, i12, i13);
        setSingleLine(true);
        setTextAppearance(ru.ozon.uni.R$style.TextStyle_Body_L);
        setOnClickListener(new b(this, 19));
        setDrawableEnd(DROPDOWN_ICON);
    }
}
