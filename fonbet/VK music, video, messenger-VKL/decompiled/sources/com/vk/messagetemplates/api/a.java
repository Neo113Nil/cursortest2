package com.vk.messagetemplates.api;

import android.view.View;
import android.view.ViewStub;
import androidx.activity.ComponentActivity;
import xsna.b9o0;
import xsna.xla;

/* compiled from: TemplatesKeyboardFactory.kt */
/* loaded from: classes3.dex */
public interface a {

    /* compiled from: TemplatesKeyboardFactory.kt */
    /* renamed from: com.vk.messagetemplates.api.a$a, reason: collision with other inner class name */
    public static final class C1269a {
        public static final /* synthetic */ C1269a a = new C1269a();
        private static final a STUB = new C1270a();

        /* compiled from: TemplatesKeyboardFactory.kt */
        /* renamed from: com.vk.messagetemplates.api.a$a$a, reason: collision with other inner class name */
        public static final class C1270a implements a {
            @Override // com.vk.messagetemplates.api.a
            public final View a(int i, ComponentActivity componentActivity, xla xlaVar, b9o0 b9o0Var) {
                return new ViewStub(componentActivity);
            }
        }

        public final a getSTUB() {
            return STUB;
        }
    }

    View a(int i, ComponentActivity componentActivity, xla xlaVar, b9o0 b9o0Var);
}
