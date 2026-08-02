package com.socure.docv.capturesdk.feature.consent.ui;

import android.os.Bundle;
import androidx.lifecycle.SavedStateHandle;
import androidx.navigation.NavArgs;
import java.util.HashMap;

/* loaded from: classes8.dex */
public class ConsentDialogArgs implements NavArgs {
    private final HashMap arguments;

    private ConsentDialogArgs() {
        this.arguments = new HashMap();
    }

    private ConsentDialogArgs(HashMap hashMap) {
        HashMap hashMap2 = new HashMap();
        this.arguments = hashMap2;
        hashMap2.putAll(hashMap);
    }

    public static ConsentDialogArgs fromBundle(Bundle bundle) {
        ConsentDialogArgs consentDialogArgs = new ConsentDialogArgs();
        bundle.setClassLoader(ConsentDialogArgs.class.getClassLoader());
        if (bundle.containsKey("privacyPolicyLink")) {
            String string = bundle.getString("privacyPolicyLink");
            if (string != null) {
                consentDialogArgs.arguments.put("privacyPolicyLink", string);
                if (bundle.containsKey("closeContentDescription")) {
                    String string2 = bundle.getString("closeContentDescription");
                    if (string2 != null) {
                        consentDialogArgs.arguments.put("closeContentDescription", string2);
                        return consentDialogArgs;
                    }
                    throw new IllegalArgumentException("Argument \"closeContentDescription\" is marked as non-null but was passed a null value.");
                }
                throw new IllegalArgumentException("Required argument \"closeContentDescription\" is missing and does not have an android:defaultValue");
            }
            throw new IllegalArgumentException("Argument \"privacyPolicyLink\" is marked as non-null but was passed a null value.");
        }
        throw new IllegalArgumentException("Required argument \"privacyPolicyLink\" is missing and does not have an android:defaultValue");
    }

    public static ConsentDialogArgs fromSavedStateHandle(SavedStateHandle savedStateHandle) {
        ConsentDialogArgs consentDialogArgs = new ConsentDialogArgs();
        if (savedStateHandle.contains("privacyPolicyLink")) {
            String str = (String) savedStateHandle.get("privacyPolicyLink");
            if (str != null) {
                consentDialogArgs.arguments.put("privacyPolicyLink", str);
                if (savedStateHandle.contains("closeContentDescription")) {
                    String str2 = (String) savedStateHandle.get("closeContentDescription");
                    if (str2 != null) {
                        consentDialogArgs.arguments.put("closeContentDescription", str2);
                        return consentDialogArgs;
                    }
                    throw new IllegalArgumentException("Argument \"closeContentDescription\" is marked as non-null but was passed a null value.");
                }
                throw new IllegalArgumentException("Required argument \"closeContentDescription\" is missing and does not have an android:defaultValue");
            }
            throw new IllegalArgumentException("Argument \"privacyPolicyLink\" is marked as non-null but was passed a null value.");
        }
        throw new IllegalArgumentException("Required argument \"privacyPolicyLink\" is missing and does not have an android:defaultValue");
    }

    public String getPrivacyPolicyLink() {
        return (String) this.arguments.get("privacyPolicyLink");
    }

    public String getCloseContentDescription() {
        return (String) this.arguments.get("closeContentDescription");
    }

    public Bundle toBundle() {
        Bundle bundle = new Bundle();
        if (this.arguments.containsKey("privacyPolicyLink")) {
            bundle.putString("privacyPolicyLink", (String) this.arguments.get("privacyPolicyLink"));
        }
        if (this.arguments.containsKey("closeContentDescription")) {
            bundle.putString("closeContentDescription", (String) this.arguments.get("closeContentDescription"));
        }
        return bundle;
    }

    public SavedStateHandle toSavedStateHandle() {
        SavedStateHandle savedStateHandle = new SavedStateHandle();
        if (this.arguments.containsKey("privacyPolicyLink")) {
            savedStateHandle.set("privacyPolicyLink", (String) this.arguments.get("privacyPolicyLink"));
        }
        if (this.arguments.containsKey("closeContentDescription")) {
            savedStateHandle.set("closeContentDescription", (String) this.arguments.get("closeContentDescription"));
        }
        return savedStateHandle;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ConsentDialogArgs consentDialogArgs = (ConsentDialogArgs) obj;
        if (this.arguments.containsKey("privacyPolicyLink") != consentDialogArgs.arguments.containsKey("privacyPolicyLink")) {
            return false;
        }
        if (getPrivacyPolicyLink() == null ? consentDialogArgs.getPrivacyPolicyLink() != null : !getPrivacyPolicyLink().equals(consentDialogArgs.getPrivacyPolicyLink())) {
            return false;
        }
        if (this.arguments.containsKey("closeContentDescription") != consentDialogArgs.arguments.containsKey("closeContentDescription")) {
            return false;
        }
        return getCloseContentDescription() == null ? consentDialogArgs.getCloseContentDescription() == null : getCloseContentDescription().equals(consentDialogArgs.getCloseContentDescription());
    }

    public int hashCode() {
        return (((getPrivacyPolicyLink() != null ? getPrivacyPolicyLink().hashCode() : 0) + 31) * 31) + (getCloseContentDescription() != null ? getCloseContentDescription().hashCode() : 0);
    }

    public String toString() {
        return "ConsentDialogArgs{privacyPolicyLink=" + getPrivacyPolicyLink() + ", closeContentDescription=" + getCloseContentDescription() + "}";
    }

    public static final class Builder {
        private final HashMap arguments;

        public Builder(ConsentDialogArgs consentDialogArgs) {
            HashMap hashMap = new HashMap();
            this.arguments = hashMap;
            hashMap.putAll(consentDialogArgs.arguments);
        }

        public Builder(String str, String str2) {
            HashMap hashMap = new HashMap();
            this.arguments = hashMap;
            if (str == null) {
                throw new IllegalArgumentException("Argument \"privacyPolicyLink\" is marked as non-null but was passed a null value.");
            }
            hashMap.put("privacyPolicyLink", str);
            if (str2 == null) {
                throw new IllegalArgumentException("Argument \"closeContentDescription\" is marked as non-null but was passed a null value.");
            }
            hashMap.put("closeContentDescription", str2);
        }

        public ConsentDialogArgs build() {
            return new ConsentDialogArgs(this.arguments);
        }

        public Builder setPrivacyPolicyLink(String str) {
            if (str == null) {
                throw new IllegalArgumentException("Argument \"privacyPolicyLink\" is marked as non-null but was passed a null value.");
            }
            this.arguments.put("privacyPolicyLink", str);
            return this;
        }

        public Builder setCloseContentDescription(String str) {
            if (str == null) {
                throw new IllegalArgumentException("Argument \"closeContentDescription\" is marked as non-null but was passed a null value.");
            }
            this.arguments.put("closeContentDescription", str);
            return this;
        }

        public String getPrivacyPolicyLink() {
            return (String) this.arguments.get("privacyPolicyLink");
        }

        public String getCloseContentDescription() {
            return (String) this.arguments.get("closeContentDescription");
        }
    }
}
