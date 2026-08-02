package com.socure.docv.capturesdk.feature.orchestrator.presentation.ui;

import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.lifecycle.SavedStateHandle;
import androidx.navigation.NavArgs;
import java.io.Serializable;
import java.util.HashMap;

/* loaded from: classes8.dex */
public class UnstructuredDocPreviewFragmentArgs implements NavArgs {
    private final HashMap arguments;

    private UnstructuredDocPreviewFragmentArgs() {
        this.arguments = new HashMap();
    }

    private UnstructuredDocPreviewFragmentArgs(HashMap hashMap) {
        HashMap hashMap2 = new HashMap();
        this.arguments = hashMap2;
        hashMap2.putAll(hashMap);
    }

    public static UnstructuredDocPreviewFragmentArgs fromBundle(Bundle bundle) {
        UnstructuredDocPreviewFragmentArgs unstructuredDocPreviewFragmentArgs = new UnstructuredDocPreviewFragmentArgs();
        bundle.setClassLoader(UnstructuredDocPreviewFragmentArgs.class.getClassLoader());
        if (bundle.containsKey("uri")) {
            if (Parcelable.class.isAssignableFrom(Uri.class) || Serializable.class.isAssignableFrom(Uri.class)) {
                Uri uri = (Uri) bundle.get("uri");
                if (uri != null) {
                    unstructuredDocPreviewFragmentArgs.arguments.put("uri", uri);
                    return unstructuredDocPreviewFragmentArgs;
                }
                throw new IllegalArgumentException("Argument \"uri\" is marked as non-null but was passed a null value.");
            }
            throw new UnsupportedOperationException(Uri.class.getName() + " must implement Parcelable or Serializable or must be an Enum.");
        }
        throw new IllegalArgumentException("Required argument \"uri\" is missing and does not have an android:defaultValue");
    }

    public static UnstructuredDocPreviewFragmentArgs fromSavedStateHandle(SavedStateHandle savedStateHandle) {
        UnstructuredDocPreviewFragmentArgs unstructuredDocPreviewFragmentArgs = new UnstructuredDocPreviewFragmentArgs();
        if (savedStateHandle.contains("uri")) {
            Uri uri = (Uri) savedStateHandle.get("uri");
            if (uri != null) {
                unstructuredDocPreviewFragmentArgs.arguments.put("uri", uri);
                return unstructuredDocPreviewFragmentArgs;
            }
            throw new IllegalArgumentException("Argument \"uri\" is marked as non-null but was passed a null value.");
        }
        throw new IllegalArgumentException("Required argument \"uri\" is missing and does not have an android:defaultValue");
    }

    public Uri getUri() {
        return (Uri) this.arguments.get("uri");
    }

    public Bundle toBundle() {
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

    public SavedStateHandle toSavedStateHandle() {
        SavedStateHandle savedStateHandle = new SavedStateHandle();
        if (this.arguments.containsKey("uri")) {
            Uri uri = (Uri) this.arguments.get("uri");
            if (Parcelable.class.isAssignableFrom(Uri.class) || uri == null) {
                savedStateHandle.set("uri", (Parcelable) Parcelable.class.cast(uri));
            } else {
                if (Serializable.class.isAssignableFrom(Uri.class)) {
                    savedStateHandle.set("uri", (Serializable) Serializable.class.cast(uri));
                    return savedStateHandle;
                }
                throw new UnsupportedOperationException(Uri.class.getName() + " must implement Parcelable or Serializable or must be an Enum.");
            }
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
        UnstructuredDocPreviewFragmentArgs unstructuredDocPreviewFragmentArgs = (UnstructuredDocPreviewFragmentArgs) obj;
        if (this.arguments.containsKey("uri") != unstructuredDocPreviewFragmentArgs.arguments.containsKey("uri")) {
            return false;
        }
        return getUri() == null ? unstructuredDocPreviewFragmentArgs.getUri() == null : getUri().equals(unstructuredDocPreviewFragmentArgs.getUri());
    }

    public int hashCode() {
        return 31 + (getUri() != null ? getUri().hashCode() : 0);
    }

    public String toString() {
        return "UnstructuredDocPreviewFragmentArgs{uri=" + getUri() + "}";
    }

    public static final class Builder {
        private final HashMap arguments;

        public Builder(UnstructuredDocPreviewFragmentArgs unstructuredDocPreviewFragmentArgs) {
            HashMap hashMap = new HashMap();
            this.arguments = hashMap;
            hashMap.putAll(unstructuredDocPreviewFragmentArgs.arguments);
        }

        public Builder(Uri uri) {
            HashMap hashMap = new HashMap();
            this.arguments = hashMap;
            if (uri == null) {
                throw new IllegalArgumentException("Argument \"uri\" is marked as non-null but was passed a null value.");
            }
            hashMap.put("uri", uri);
        }

        public UnstructuredDocPreviewFragmentArgs build() {
            return new UnstructuredDocPreviewFragmentArgs(this.arguments);
        }

        public Builder setUri(Uri uri) {
            if (uri == null) {
                throw new IllegalArgumentException("Argument \"uri\" is marked as non-null but was passed a null value.");
            }
            this.arguments.put("uri", uri);
            return this;
        }

        public Uri getUri() {
            return (Uri) this.arguments.get("uri");
        }
    }
}
