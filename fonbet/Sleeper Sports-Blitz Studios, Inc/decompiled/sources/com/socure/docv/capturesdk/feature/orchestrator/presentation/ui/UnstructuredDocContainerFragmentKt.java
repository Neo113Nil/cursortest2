package com.socure.docv.capturesdk.feature.orchestrator.presentation.ui;

import android.net.Uri;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: UnstructuredDocContainerFragment.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002\u001a\u0012\u0010\u0003\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0005¨\u0006\u0006"}, d2 = {"navigateBackFromContainer", "", "Landroidx/fragment/app/Fragment;", "navigateToPreview", "uri", "Landroid/net/Uri;", "capturesdk_productionRelease"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class UnstructuredDocContainerFragmentKt {
    public static final void navigateToPreview(Fragment fragment, Uri uri) {
        FragmentManager supportFragmentManager;
        List<Fragment> fragments;
        Intrinsics.checkNotNullParameter(fragment, "<this>");
        Intrinsics.checkNotNullParameter(uri, "uri");
        FragmentActivity requireActivity = fragment.requireActivity();
        UnstructuredDocContainerFragment unstructuredDocContainerFragment = null;
        OrchestratorActivity orchestratorActivity = requireActivity instanceof OrchestratorActivity ? (OrchestratorActivity) requireActivity : null;
        if (orchestratorActivity != null && (supportFragmentManager = orchestratorActivity.getSupportFragmentManager()) != null && (fragments = supportFragmentManager.getFragments()) != null) {
            ArrayList arrayList = new ArrayList();
            for (Object obj : fragments) {
                if (obj instanceof UnstructuredDocContainerFragment) {
                    arrayList.add(obj);
                }
            }
            unstructuredDocContainerFragment = (UnstructuredDocContainerFragment) CollectionsKt.firstOrNull((List) arrayList);
        }
        if (unstructuredDocContainerFragment != null) {
            unstructuredDocContainerFragment.navigateToPreview(uri);
        }
    }

    public static final void navigateBackFromContainer(Fragment fragment) {
        Intrinsics.checkNotNullParameter(fragment, "<this>");
        Fragment parentFragment = fragment.getParentFragment();
        UnstructuredDocContainerFragment unstructuredDocContainerFragment = parentFragment instanceof UnstructuredDocContainerFragment ? (UnstructuredDocContainerFragment) parentFragment : null;
        if (unstructuredDocContainerFragment != null) {
            unstructuredDocContainerFragment.navigateBack();
        }
    }
}
