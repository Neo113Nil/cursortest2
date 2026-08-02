package ru.ozon.app.android.session.auth.presentation.viewmodel;

import com.google.android.gms.common.Scopes;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.C7705l;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0000\"\u0014\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0003"}, d2 = {"requireNotEmptyFields", "", "", "session_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class AuthViewModelKt {

    @NotNull
    private static final Set<String> requireNotEmptyFields;

    static {
        String[] elements = {Scopes.EMAIL, "phone", "password", "text"};
        Intrinsics.checkNotNullParameter(elements, "elements");
        requireNotEmptyFields = C7705l.j0(elements);
    }
}
