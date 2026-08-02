package ru.ozon.app.android.fresh.feature.b2b.widgets.verificationEdoCheckingUser.presentation;

import Ae.C2399j;
import Ae.M0;
import Ae.O0;
import Ae.x0;
import androidx.lifecycle.w0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.h;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.fresh.feature.b2b.widgets.verificationEdoCheckingUser.presentation.VerificationEdoCheckingUserVO;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J!\u0010\b\u001a\u00020\u0007*\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00050\u0004H\u0002¢\u0006\u0004\b\b\u0010\tJ\u001d\u0010\f\u001a\u00020\u000b2\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005¢\u0006\u0004\b\f\u0010\rJ\u001d\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u0007¢\u0006\u0004\b\u0011\u0010\u0012J!\u0010\u0015\u001a\u00020\u000b2\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u000b0\u0013¢\u0006\u0004\b\u0015\u0010\u0016R\"\u0010\u0018\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00050\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R%\u0010\u001a\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d¨\u0006\u001e"}, d2 = {"Lru/ozon/app/android/fresh/feature/b2b/widgets/verificationEdoCheckingUser/presentation/VerificationEdoCheckingUserViewModel;", "Landroidx/lifecycle/w0;", "<init>", "()V", "LAe/M0;", "", "Lru/ozon/app/android/fresh/feature/b2b/widgets/verificationEdoCheckingUser/presentation/VerificationEdoCheckingUserVO$Field;", "", "createDeeplinkQueryParams", "(LAe/M0;)Ljava/lang/String;", "fields", "", "initFields", "(Ljava/util/List;)V", "", "index", "newText", "onFieldTextChanged", "(ILjava/lang/String;)V", "Lkotlin/Function1;", "successValidate", "validatedFields", "(Lkotlin/jvm/functions/Function1;)V", "LAe/x0;", "_inputFields", "LAe/x0;", "inputFields", "LAe/M0;", "getInputFields", "()LAe/M0;", "b2b_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class VerificationEdoCheckingUserViewModel extends w0 {

    @NotNull
    private final x0<List<VerificationEdoCheckingUserVO.Field>> _inputFields;

    @NotNull
    private final M0<List<VerificationEdoCheckingUserVO.Field>> inputFields;

    public VerificationEdoCheckingUserViewModel() {
        x0<List<VerificationEdoCheckingUserVO.Field>> a11 = O0.a(null);
        this._inputFields = a11;
        this.inputFields = C2399j.b(a11);
    }

    private final String createDeeplinkQueryParams(M0<? extends List<VerificationEdoCheckingUserVO.Field>> m02) {
        ArrayList arrayList;
        StringBuilder sb2 = new StringBuilder();
        List<VerificationEdoCheckingUserVO.Field> value = m02.getValue();
        if (value != null) {
            arrayList = new ArrayList();
            for (Object obj : value) {
                String value2 = ((VerificationEdoCheckingUserVO.Field) obj).getValue();
                if (value2 != null && value2.length() != 0) {
                    arrayList.add(obj);
                }
            }
        } else {
            arrayList = null;
        }
        if (arrayList != null) {
            int i11 = 0;
            for (Object obj2 : arrayList) {
                int i12 = i11 + 1;
                if (i11 < 0) {
                    C7714v.O0();
                    throw null;
                }
                VerificationEdoCheckingUserVO.Field field = (VerificationEdoCheckingUserVO.Field) obj2;
                sb2.append(field.getName() + "=" + field.getValue());
                if (i11 != arrayList.size() - 1) {
                    sb2.append("&");
                }
                i11 = i12;
            }
        }
        String sb3 = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(sb3, "toString(...)");
        return sb3;
    }

    @NotNull
    public final M0<List<VerificationEdoCheckingUserVO.Field>> getInputFields() {
        return this.inputFields;
    }

    public final void initFields(List<VerificationEdoCheckingUserVO.Field> fields) {
        this._inputFields.setValue(fields);
    }

    public final void onFieldTextChanged(int index, @NotNull String newText) {
        ArrayList arrayList;
        ArrayList arrayList2;
        String newText2 = newText;
        Intrinsics.checkNotNullParameter(newText2, "newText");
        x0<List<VerificationEdoCheckingUserVO.Field>> x0Var = this._inputFields;
        while (true) {
            List<VerificationEdoCheckingUserVO.Field> value = x0Var.getValue();
            List<VerificationEdoCheckingUserVO.Field> value2 = this.inputFields.getValue();
            if (value2 != null) {
                List<VerificationEdoCheckingUserVO.Field> list = value2;
                ArrayList arrayList3 = new ArrayList(C7714v.z(list, 10));
                int i11 = 0;
                for (Object obj : list) {
                    int i12 = i11 + 1;
                    if (i11 < 0) {
                        C7714v.O0();
                        throw null;
                    }
                    VerificationEdoCheckingUserVO.Field field = (VerificationEdoCheckingUserVO.Field) obj;
                    if (i11 == index) {
                        arrayList2 = arrayList3;
                        field = VerificationEdoCheckingUserVO.Field.copy$default(field, null, null, newText2, false, null, null, null, null, null, 499, null);
                    } else {
                        arrayList2 = arrayList3;
                    }
                    arrayList2.add(field);
                    newText2 = newText;
                    arrayList3 = arrayList2;
                    i11 = i12;
                }
                arrayList = arrayList3;
            } else {
                arrayList = null;
            }
            if (x0Var.b(value, arrayList)) {
                return;
            } else {
                newText2 = newText;
            }
        }
    }

    public final void validatedFields(@NotNull Function1<? super String, Unit> successValidate) {
        Intrinsics.checkNotNullParameter(successValidate, "successValidate");
        List<VerificationEdoCheckingUserVO.Field> value = this.inputFields.getValue();
        ArrayList arrayList = null;
        if (value != null) {
            List<VerificationEdoCheckingUserVO.Field> list = value;
            ArrayList arrayList2 = new ArrayList(C7714v.z(list, 10));
            for (VerificationEdoCheckingUserVO.Field field : list) {
                if (Intrinsics.d(field.getRequired(), Boolean.TRUE)) {
                    String value2 = field.getValue();
                    String obj = value2 != null ? h.z0(value2).toString() : null;
                    if (obj == null || obj.length() == 0) {
                        field = VerificationEdoCheckingUserVO.Field.copy$default(field, null, null, null, true, null, null, null, null, null, 503, null);
                    }
                }
                arrayList2.add(field);
            }
            arrayList = arrayList2;
        }
        if (arrayList != null && !arrayList.isEmpty()) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                if (((VerificationEdoCheckingUserVO.Field) it.next()).getHasError()) {
                    x0<List<VerificationEdoCheckingUserVO.Field>> x0Var = this._inputFields;
                    while (!x0Var.b(x0Var.getValue(), arrayList)) {
                    }
                    return;
                }
            }
        }
        successValidate.invoke(createDeeplinkQueryParams(this.inputFields));
    }
}
