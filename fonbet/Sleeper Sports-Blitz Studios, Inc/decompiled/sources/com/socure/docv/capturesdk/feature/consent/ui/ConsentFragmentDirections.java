package com.socure.docv.capturesdk.feature.consent.ui;

import android.os.Bundle;
import androidx.navigation.NavDirections;
import com.socure.docv.capturesdk.NavOrchGraphDirections;
import com.socure.docv.capturesdk.R;
import java.util.HashMap;

/* loaded from: classes8.dex */
public class ConsentFragmentDirections {
    private ConsentFragmentDirections() {
    }

    public static ActionConsentPrivacyDialog actionConsentPrivacyDialog(String str, String str2) {
        return new ActionConsentPrivacyDialog(str, str2);
    }

    public static NavDirections socureActionConsent() {
        return NavOrchGraphDirections.socureActionConsent();
    }

    public static NavDirections socureActionDocSelection() {
        return NavOrchGraphDirections.socureActionDocSelection();
    }

    public static NavDirections socureActionFront() {
        return NavOrchGraphDirections.socureActionFront();
    }

    public static NavDirections socureActionBack() {
        return NavOrchGraphDirections.socureActionBack();
    }

    public static NavDirections socureActionPassport() {
        return NavOrchGraphDirections.socureActionPassport();
    }

    public static NavDirections socureActionSelfie() {
        return NavOrchGraphDirections.socureActionSelfie();
    }

    public static NavDirections actionPopToConsent() {
        return NavOrchGraphDirections.actionPopToConsent();
    }

    public static NavDirections socureActionTransition() {
        return NavOrchGraphDirections.socureActionTransition();
    }

    public static class ActionConsentPrivacyDialog implements NavDirections {
        private final HashMap arguments;

        private ActionConsentPrivacyDialog(String str, String str2) {
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

        public ActionConsentPrivacyDialog setPrivacyPolicyLink(String str) {
            if (str == null) {
                throw new IllegalArgumentException("Argument \"privacyPolicyLink\" is marked as non-null but was passed a null value.");
            }
            this.arguments.put("privacyPolicyLink", str);
            return this;
        }

        public ActionConsentPrivacyDialog setCloseContentDescription(String str) {
            if (str == null) {
                throw new IllegalArgumentException("Argument \"closeContentDescription\" is marked as non-null but was passed a null value.");
            }
            this.arguments.put("closeContentDescription", str);
            return this;
        }

        @Override // androidx.navigation.NavDirections
        public Bundle getArguments() {
            Bundle bundle = new Bundle();
            if (this.arguments.containsKey("privacyPolicyLink")) {
                bundle.putString("privacyPolicyLink", (String) this.arguments.get("privacyPolicyLink"));
            }
            if (this.arguments.containsKey("closeContentDescription")) {
                bundle.putString("closeContentDescription", (String) this.arguments.get("closeContentDescription"));
            }
            return bundle;
        }

        @Override // androidx.navigation.NavDirections
        public int getActionId() {
            return R.id.action_consent_privacy_dialog;
        }

        public String getPrivacyPolicyLink() {
            return (String) this.arguments.get("privacyPolicyLink");
        }

        public String getCloseContentDescription() {
            return (String) this.arguments.get("closeContentDescription");
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            ActionConsentPrivacyDialog actionConsentPrivacyDialog = (ActionConsentPrivacyDialog) obj;
            if (this.arguments.containsKey("privacyPolicyLink") != actionConsentPrivacyDialog.arguments.containsKey("privacyPolicyLink")) {
                return false;
            }
            if (getPrivacyPolicyLink() == null ? actionConsentPrivacyDialog.getPrivacyPolicyLink() != null : !getPrivacyPolicyLink().equals(actionConsentPrivacyDialog.getPrivacyPolicyLink())) {
                return false;
            }
            if (this.arguments.containsKey("closeContentDescription") != actionConsentPrivacyDialog.arguments.containsKey("closeContentDescription")) {
                return false;
            }
            if (getCloseContentDescription() == null ? actionConsentPrivacyDialog.getCloseContentDescription() == null : getCloseContentDescription().equals(actionConsentPrivacyDialog.getCloseContentDescription())) {
                return getActionId() == actionConsentPrivacyDialog.getActionId();
            }
            return false;
        }

        public int hashCode() {
            return (((((getPrivacyPolicyLink() != null ? getPrivacyPolicyLink().hashCode() : 0) + 31) * 31) + (getCloseContentDescription() != null ? getCloseContentDescription().hashCode() : 0)) * 31) + getActionId();
        }

        public String toString() {
            return "ActionConsentPrivacyDialog(actionId=" + getActionId() + "){privacyPolicyLink=" + getPrivacyPolicyLink() + ", closeContentDescription=" + getCloseContentDescription() + "}";
        }
    }
}
