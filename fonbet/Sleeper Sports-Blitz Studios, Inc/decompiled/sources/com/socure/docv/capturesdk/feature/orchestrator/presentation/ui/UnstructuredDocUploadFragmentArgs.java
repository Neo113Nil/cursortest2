package com.socure.docv.capturesdk.feature.orchestrator.presentation.ui;

import android.os.Bundle;
import android.os.Parcelable;
import androidx.lifecycle.SavedStateHandle;
import androidx.navigation.NavArgs;
import com.socure.docv.capturesdk.models.UnstructuredModuleModel;
import java.io.Serializable;
import java.util.HashMap;

/* loaded from: classes8.dex */
public class UnstructuredDocUploadFragmentArgs implements NavArgs {
    private final HashMap arguments;

    private UnstructuredDocUploadFragmentArgs() {
        this.arguments = new HashMap();
    }

    private UnstructuredDocUploadFragmentArgs(HashMap hashMap) {
        HashMap hashMap2 = new HashMap();
        this.arguments = hashMap2;
        hashMap2.putAll(hashMap);
    }

    public static UnstructuredDocUploadFragmentArgs fromBundle(Bundle bundle) {
        UnstructuredDocUploadFragmentArgs unstructuredDocUploadFragmentArgs = new UnstructuredDocUploadFragmentArgs();
        bundle.setClassLoader(UnstructuredDocUploadFragmentArgs.class.getClassLoader());
        if (bundle.containsKey("model")) {
            if (Parcelable.class.isAssignableFrom(UnstructuredModuleModel.class) || Serializable.class.isAssignableFrom(UnstructuredModuleModel.class)) {
                UnstructuredModuleModel unstructuredModuleModel = (UnstructuredModuleModel) bundle.get("model");
                if (unstructuredModuleModel != null) {
                    unstructuredDocUploadFragmentArgs.arguments.put("model", unstructuredModuleModel);
                    return unstructuredDocUploadFragmentArgs;
                }
                throw new IllegalArgumentException("Argument \"model\" is marked as non-null but was passed a null value.");
            }
            throw new UnsupportedOperationException(UnstructuredModuleModel.class.getName() + " must implement Parcelable or Serializable or must be an Enum.");
        }
        throw new IllegalArgumentException("Required argument \"model\" is missing and does not have an android:defaultValue");
    }

    public static UnstructuredDocUploadFragmentArgs fromSavedStateHandle(SavedStateHandle savedStateHandle) {
        UnstructuredDocUploadFragmentArgs unstructuredDocUploadFragmentArgs = new UnstructuredDocUploadFragmentArgs();
        if (savedStateHandle.contains("model")) {
            UnstructuredModuleModel unstructuredModuleModel = (UnstructuredModuleModel) savedStateHandle.get("model");
            if (unstructuredModuleModel != null) {
                unstructuredDocUploadFragmentArgs.arguments.put("model", unstructuredModuleModel);
                return unstructuredDocUploadFragmentArgs;
            }
            throw new IllegalArgumentException("Argument \"model\" is marked as non-null but was passed a null value.");
        }
        throw new IllegalArgumentException("Required argument \"model\" is missing and does not have an android:defaultValue");
    }

    public UnstructuredModuleModel getModel() {
        return (UnstructuredModuleModel) this.arguments.get("model");
    }

    public Bundle toBundle() {
        Bundle bundle = new Bundle();
        if (this.arguments.containsKey("model")) {
            UnstructuredModuleModel unstructuredModuleModel = (UnstructuredModuleModel) this.arguments.get("model");
            if (Parcelable.class.isAssignableFrom(UnstructuredModuleModel.class) || unstructuredModuleModel == null) {
                bundle.putParcelable("model", (Parcelable) Parcelable.class.cast(unstructuredModuleModel));
            } else {
                if (Serializable.class.isAssignableFrom(UnstructuredModuleModel.class)) {
                    bundle.putSerializable("model", (Serializable) Serializable.class.cast(unstructuredModuleModel));
                    return bundle;
                }
                throw new UnsupportedOperationException(UnstructuredModuleModel.class.getName() + " must implement Parcelable or Serializable or must be an Enum.");
            }
        }
        return bundle;
    }

    public SavedStateHandle toSavedStateHandle() {
        SavedStateHandle savedStateHandle = new SavedStateHandle();
        if (this.arguments.containsKey("model")) {
            UnstructuredModuleModel unstructuredModuleModel = (UnstructuredModuleModel) this.arguments.get("model");
            if (Parcelable.class.isAssignableFrom(UnstructuredModuleModel.class) || unstructuredModuleModel == null) {
                savedStateHandle.set("model", (Parcelable) Parcelable.class.cast(unstructuredModuleModel));
            } else {
                if (Serializable.class.isAssignableFrom(UnstructuredModuleModel.class)) {
                    savedStateHandle.set("model", (Serializable) Serializable.class.cast(unstructuredModuleModel));
                    return savedStateHandle;
                }
                throw new UnsupportedOperationException(UnstructuredModuleModel.class.getName() + " must implement Parcelable or Serializable or must be an Enum.");
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
        UnstructuredDocUploadFragmentArgs unstructuredDocUploadFragmentArgs = (UnstructuredDocUploadFragmentArgs) obj;
        if (this.arguments.containsKey("model") != unstructuredDocUploadFragmentArgs.arguments.containsKey("model")) {
            return false;
        }
        return getModel() == null ? unstructuredDocUploadFragmentArgs.getModel() == null : getModel().equals(unstructuredDocUploadFragmentArgs.getModel());
    }

    public int hashCode() {
        return 31 + (getModel() != null ? getModel().hashCode() : 0);
    }

    public String toString() {
        return "UnstructuredDocUploadFragmentArgs{model=" + getModel() + "}";
    }

    public static final class Builder {
        private final HashMap arguments;

        public Builder(UnstructuredDocUploadFragmentArgs unstructuredDocUploadFragmentArgs) {
            HashMap hashMap = new HashMap();
            this.arguments = hashMap;
            hashMap.putAll(unstructuredDocUploadFragmentArgs.arguments);
        }

        public Builder(UnstructuredModuleModel unstructuredModuleModel) {
            HashMap hashMap = new HashMap();
            this.arguments = hashMap;
            if (unstructuredModuleModel == null) {
                throw new IllegalArgumentException("Argument \"model\" is marked as non-null but was passed a null value.");
            }
            hashMap.put("model", unstructuredModuleModel);
        }

        public UnstructuredDocUploadFragmentArgs build() {
            return new UnstructuredDocUploadFragmentArgs(this.arguments);
        }

        public Builder setModel(UnstructuredModuleModel unstructuredModuleModel) {
            if (unstructuredModuleModel == null) {
                throw new IllegalArgumentException("Argument \"model\" is marked as non-null but was passed a null value.");
            }
            this.arguments.put("model", unstructuredModuleModel);
            return this;
        }

        public UnstructuredModuleModel getModel() {
            return (UnstructuredModuleModel) this.arguments.get("model");
        }
    }
}
