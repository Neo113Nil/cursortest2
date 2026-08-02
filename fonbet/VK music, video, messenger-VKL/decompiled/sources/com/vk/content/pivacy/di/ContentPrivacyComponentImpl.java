package com.vk.content.pivacy.di;

import com.vk.content.privacy.di.ContentPrivacyComponent;
import com.vk.di.component.DiScopedComponent;
import kotlin.jvm.internal.PropertyReference1Impl;
import xsna.c8m;
import xsna.ewy;
import xsna.fp;
import xsna.fpf0;
import xsna.g8m;
import xsna.pwj0;
import xsna.qcy;
import xsna.sk4;
import xsna.ufd0;
import xsna.uij;
import xsna.w9;

/* compiled from: ContentPrivacyComponentImpl.kt */
/* loaded from: classes17.dex */
public final class ContentPrivacyComponentImpl implements ContentPrivacyComponent {
    public static final /* synthetic */ qcy<Object>[] c = {new PropertyReference1Impl(ContentPrivacyComponentImpl.class, "privacyInteractor", "getPrivacyInteractor()Lcom/vk/content/privacy/di/ContentPrivacyInteractor;", 0), fp.c(0, ContentPrivacyComponentImpl.class, "privacyUtils", "getPrivacyUtils()Lcom/vk/content/privacy/di/PrivacyUtils;", fpf0.a)};
    public final ewy a = new ewy(new w9(10));
    public final ewy b = new ewy(new sk4(8));

    /* compiled from: ContentPrivacyComponentImpl.kt */
    public static final class a implements c8m<ContentPrivacyComponent, pwj0> {
        @Override // xsna.c8m
        public final DiScopedComponent a(g8m g8mVar, pwj0 pwj0Var) {
            return new ContentPrivacyComponentImpl();
        }
    }

    @Override // com.vk.content.privacy.di.ContentPrivacyComponent
    public final ufd0 Z8() {
        qcy<Object> qcyVar = c[1];
        return (ufd0) this.b.c();
    }

    @Override // com.vk.content.privacy.di.ContentPrivacyComponent
    public final uij y3() {
        qcy<Object> qcyVar = c[0];
        return (uij) this.a.c();
    }
}
