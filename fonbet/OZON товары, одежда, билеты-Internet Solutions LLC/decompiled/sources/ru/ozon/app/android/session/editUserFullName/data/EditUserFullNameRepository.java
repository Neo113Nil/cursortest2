package ru.ozon.app.android.session.editUserFullName.data;

import Bc.r;
import Cw.c;
import io.reactivex.y;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.session.editUserFullName.data.EditUserFullNameResponse;
import ru.ozon.app.android.session.editUserFullName.presentation.EditUserFullNameResult;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ/\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\b0\u00142\u0006\u0010\u0011\u001a\u00020\u00102\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00100\u0012¢\u0006\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0017¨\u0006\u0018"}, d2 = {"Lru/ozon/app/android/session/editUserFullName/data/EditUserFullNameRepository;", "", "Lru/ozon/app/android/session/editUserFullName/data/EditUserFullNameApi;", "api", "<init>", "(Lru/ozon/app/android/session/editUserFullName/data/EditUserFullNameApi;)V", "Lru/ozon/app/android/session/editUserFullName/data/EditUserFullNameResponse;", "response", "Lru/ozon/app/android/session/editUserFullName/presentation/EditUserFullNameResult;", "toResult", "(Lru/ozon/app/android/session/editUserFullName/data/EditUserFullNameResponse;)Lru/ozon/app/android/session/editUserFullName/presentation/EditUserFullNameResult;", "Lru/ozon/app/android/session/editUserFullName/data/EditUserFullNameResponse$FieldViolation;", "fieldViolation", "Lru/ozon/app/android/session/editUserFullName/presentation/EditUserFullNameResult$Failure$Field;", "toField", "(Lru/ozon/app/android/session/editUserFullName/data/EditUserFullNameResponse$FieldViolation;)Lru/ozon/app/android/session/editUserFullName/presentation/EditUserFullNameResult$Failure$Field;", "", "actionName", "", "userData", "Lio/reactivex/y;", "editUserFullName", "(Ljava/lang/String;Ljava/util/Map;)Lio/reactivex/y;", "Lru/ozon/app/android/session/editUserFullName/data/EditUserFullNameApi;", "session_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class EditUserFullNameRepository {

    @NotNull
    private final EditUserFullNameApi api;

    public EditUserFullNameRepository(@NotNull EditUserFullNameApi api) {
        Intrinsics.checkNotNullParameter(api, "api");
        this.api = api;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final EditUserFullNameResult editUserFullName$lambda$0(Function1 function1, Object p02) {
        Intrinsics.checkNotNullParameter(p02, "p0");
        return (EditUserFullNameResult) function1.invoke(p02);
    }

    private final EditUserFullNameResult.Failure.Field toField(EditUserFullNameResponse.FieldViolation fieldViolation) {
        return new EditUserFullNameResult.Failure.Field(fieldViolation.getName(), fieldViolation.getMessage());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final EditUserFullNameResult toResult(EditUserFullNameResponse response) {
        if (response.getFieldViolations() == null) {
            return EditUserFullNameResult.Success.INSTANCE;
        }
        List<EditUserFullNameResponse.FieldViolation> fieldViolations = response.getFieldViolations();
        ArrayList arrayList = new ArrayList(C7714v.z(fieldViolations, 10));
        Iterator<T> it = fieldViolations.iterator();
        while (it.hasNext()) {
            arrayList.add(toField((EditUserFullNameResponse.FieldViolation) it.next()));
        }
        return new EditUserFullNameResult.Failure(arrayList);
    }

    @NotNull
    public final y<EditUserFullNameResult> editUserFullName(@NotNull String actionName, @NotNull Map<String, String> userData) {
        Intrinsics.checkNotNullParameter(actionName, "actionName");
        Intrinsics.checkNotNullParameter(userData, "userData");
        y<EditUserFullNameResponse> editUserFullName = this.api.editUserFullName(actionName, userData);
        c cVar = new c(new EditUserFullNameRepository$editUserFullName$1(this), 19);
        editUserFullName.getClass();
        r rVar = new r(editUserFullName, cVar);
        Intrinsics.checkNotNullExpressionValue(rVar, "map(...)");
        return rVar;
    }
}
