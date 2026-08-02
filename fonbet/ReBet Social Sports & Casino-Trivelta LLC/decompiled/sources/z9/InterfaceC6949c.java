package z9;

import com.google.android.gms.auth.api.identity.BeginSignInRequest;
import com.google.android.gms.auth.api.identity.GetSignInIntentRequest;
import com.google.android.gms.tasks.Task;

/* renamed from: z9.c, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public interface InterfaceC6949c {
    Task beginSignIn(BeginSignInRequest beginSignInRequest);

    Task getSignInIntent(GetSignInIntentRequest getSignInIntentRequest);
}
