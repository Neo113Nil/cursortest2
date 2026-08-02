package com.vk.articleeditor.impl.di;

import com.vk.articleeditor.api.di.ArticleComponent;
import com.vk.di.component.DiUnscopedComponent;
import kotlin.jvm.internal.PropertyReference1Impl;
import xsna.b7m;
import xsna.e7m;
import xsna.fp;
import xsna.fpf0;
import xsna.jb;
import xsna.nwy;
import xsna.pu;
import xsna.qcy;
import xsna.vn3;

/* compiled from: ArticleComponentImpl.kt */
/* loaded from: classes15.dex */
public final class ArticleComponentImpl implements ArticleComponent {
    public static final /* synthetic */ qcy<Object>[] c = {new PropertyReference1Impl(ArticleComponentImpl.class, "articleEditorInteractor", "getArticleEditorInteractor()Lcom/vk/articleeditor/impl/ArticleEditorUpdateInteractorImpl;", 0), fp.c(0, ArticleComponentImpl.class, "articleRepository", "getArticleRepository()Lcom/vk/articleeditor/impl/ArticleRepositoryImpl;", fpf0.a)};
    public final nwy a = new nwy(new jb(2));
    public final nwy b = new nwy(new pu(this, 7));

    /* compiled from: ArticleComponentImpl.kt */
    public static final class a implements b7m<ArticleComponent> {
        @Override // xsna.b7m
        public final DiUnscopedComponent a(e7m e7mVar) {
            return new ArticleComponentImpl();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.vk.articleeditor.api.di.ArticleComponent
    public final vn3 O7() {
        qcy<Object> qcyVar = c[0];
        return (vn3) this.a.c();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.vk.articleeditor.api.di.ArticleComponent
    public final com.vk.articleeditor.impl.a d0() {
        qcy<Object> qcyVar = c[1];
        return (com.vk.articleeditor.impl.a) this.b.c();
    }
}
