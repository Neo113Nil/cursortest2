package com.socure.docv.capturesdk;

import androidx.navigation.ActionOnlyNavDirections;
import androidx.navigation.NavDirections;

/* loaded from: classes8.dex */
public class NavOrchGraphDirections {
    private NavOrchGraphDirections() {
    }

    public static NavDirections socureActionConsent() {
        return new ActionOnlyNavDirections(R.id.socure_action_consent);
    }

    public static NavDirections socureActionDocSelection() {
        return new ActionOnlyNavDirections(R.id.socure_action_doc_selection);
    }

    public static NavDirections socureActionFront() {
        return new ActionOnlyNavDirections(R.id.socure_action_front);
    }

    public static NavDirections socureActionBack() {
        return new ActionOnlyNavDirections(R.id.socure_action_back);
    }

    public static NavDirections socureActionPassport() {
        return new ActionOnlyNavDirections(R.id.socure_action_passport);
    }

    public static NavDirections socureActionSelfie() {
        return new ActionOnlyNavDirections(R.id.socure_action_selfie);
    }

    public static NavDirections actionPopToConsent() {
        return new ActionOnlyNavDirections(R.id.action_pop_to_consent);
    }

    public static NavDirections socureActionTransition() {
        return new ActionOnlyNavDirections(R.id.socure_action_transition);
    }
}
