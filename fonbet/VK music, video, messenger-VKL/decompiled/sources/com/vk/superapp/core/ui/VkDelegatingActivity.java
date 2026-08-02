package com.vk.superapp.core.ui;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.vk.superapp.core.ui.component.VkSdkActivity;
import xsna.ozl;

/* compiled from: VkDelegatingActivity.kt */
/* loaded from: classes6.dex */
public abstract class VkDelegatingActivity extends VkSdkActivity {
    public static final /* synthetic */ int f = 0;

    /* compiled from: VkDelegatingActivity.kt */
    public static final class a {
        @ozl
        public static void a(Fragment fragment, Class cls, Class cls2, Bundle bundle, int i) {
            Context requireContext = fragment.requireContext();
            Intent putExtra = new Intent(requireContext, (Class<?>) cls).putExtra("fragmentClass", cls2).putExtra("args", bundle);
            if (requireContext.getApplicationContext() == requireContext) {
                putExtra.addFlags(268435456);
            }
            fragment.startActivityForResult(putExtra, i);
        }
    }

    public final Fragment O1(int i) {
        Class cls = (Class) getIntent().getSerializableExtra("fragmentClass");
        Bundle bundle = (Bundle) getIntent().getParcelableExtra("args");
        Fragment fragment = (Fragment) cls.newInstance();
        fragment.setArguments(bundle);
        FragmentManager supportFragmentManager = getSupportFragmentManager();
        supportFragmentManager.getClass();
        androidx.fragment.app.a aVar = new androidx.fragment.app.a(supportFragmentManager);
        aVar.f(i, fragment, null, 1);
        aVar.k(false);
        return fragment;
    }
}
