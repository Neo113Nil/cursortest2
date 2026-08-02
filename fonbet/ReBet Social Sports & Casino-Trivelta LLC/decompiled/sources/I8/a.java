package I8;

import kotlin.text.StringsKt;

/* loaded from: classes2.dex */
public abstract class a {
    public static final String a(String str) {
        return StringsKt.trimIndent("\n            =================================================================\n            ====================== VERIFICATION MODE ========================\n\n            YOUR ANALYTICS ID IS: " + str + "\n\n            1. Go to developers.giphy.com and start the verification process to\n            get your production API key.\n            2. You will be asked to enter a verification code during this process.\n            Copy and paste the code from above into the field provided\n            3. IMPORTANT: Remember to set \"enableVerificationMode = false\" once the\n            verification is done.\n            =================================================================\n            =================================================================\n        ");
    }
}
