package com.socure.docv.capturesdk.feature.orchestrator.presentation.ui;

import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.navigation.NavDirections;
import com.socure.docv.capturesdk.R;
import java.io.Serializable;
import java.util.HashMap;

/* loaded from: classes8.dex */
public class UnstructuredDocUploadFragmentDirections {
    private UnstructuredDocUploadFragmentDirections() {
    }

    public static ActionUnstructuredDocFragmentToUnstructuredDocPreviewFragment actionUnstructuredDocFragmentToUnstructuredDocPreviewFragment(Uri uri) {
        return new ActionUnstructuredDocFragmentToUnstructuredDocPreviewFragment(uri);
    }

    public static class ActionUnstructuredDocFragmentToUnstructuredDocPreviewFragment implements NavDirections {
        private final HashMap arguments;

        private ActionUnstructuredDocFragmentToUnstructuredDocPreviewFragment(Uri uri) {
            HashMap hashMap = new HashMap();
            this.arguments = hashMap;
            if (uri == null) {
                throw new IllegalArgumentException("Argument \"uri\" is marked as non-null but was passed a null value.");
            }
            hashMap.put("uri", uri);
        }

        public ActionUnstructuredDocFragmentToUnstructuredDocPreviewFragment setUri(Uri uri) {
            if (uri == null) {
                throw new IllegalArgumentException("Argument \"uri\" is marked as non-null but was passed a null value.");
            }
            this.arguments.put("uri", uri);
            return this;
        }

        @Override // androidx.navigation.NavDirections
        public Bundle getArguments() {
            Bundle bundle = new Bundle();
            if (this.arguments.containsKey("uri")) {
                Uri uri = (Uri) this.arguments.get("uri");
                if (Parcelable.class.isAssignableFrom(Uri.class) || uri == null) {
                    bundle.putParcelable("uri", (Parcelable) Parcelable.class.cast(uri));
                } else {
                    if (Serializable.class.isAssignableFrom(Uri.class)) {
                        bundle.putSerializable("uri", (Serializable) Serializable.class.cast(uri));
                        return bundle;
                    }
                    throw new UnsupportedOperationException(Uri.class.getName() + " must implement Parcelable or Serializable or must be an Enum.");
                }
            }
            return bundle;
        }

        @Override // androidx.navigation.NavDirections
        public int getActionId() {
            return R.id.action_unstructuredDocFragment_to_unstructuredDocPreviewFragment;
        }

        public Uri getUri() {
            return (Uri) this.arguments.get("uri");
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            ActionUnstructuredDocFragmentToUnstructuredDocPreviewFragment actionUnstructuredDocFragmentToUnstructuredDocPreviewFragment = (ActionUnstructuredDocFragmentToUnstructuredDocPreviewFragment) obj;
            if (this.arguments.containsKey("uri") != actionUnstructuredDocFragmentToUnstructuredDocPreviewFragment.arguments.containsKey("uri")) {
                return false;
            }
            if (getUri() == null ? actionUnstructuredDocFragmentToUnstructuredDocPreviewFragment.getUri() == null : getUri().equals(actionUnstructuredDocFragmentToUnstructuredDocPreviewFragment.getUri())) {
                return getActionId() == actionUnstructuredDocFragmentToUnstructuredDocPreviewFragment.getActionId();
            }
            return false;
        }

        public int hashCode() {
            return (((getUri() != null ? getUri().hashCode() : 0) + 31) * 31) + getActionId();
        }

        public String toString() {
            return "ActionUnstructuredDocFragmentToUnstructuredDocPreviewFragment(actionId=" + getActionId() + "){uri=" + getUri() + "}";
        }
    }
}
