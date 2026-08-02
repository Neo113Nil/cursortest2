package com.vk.attachpicker.screen;

import android.net.Uri;
import com.vk.mediastore.system.MediaStoreEntry;
import java.io.File;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import xsna.b6l;
import xsna.r4p;
import xsna.s3q0;
import xsna.spj;
import xsna.wzs;
import xsna.yvj;

/* compiled from: CollageEditorScreen.kt */
@b6l(c = "com.vk.attachpicker.screen.CollageEditorScreen$renderAndFinish$2$3$1", f = "CollageEditorScreen.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes15.dex */
public final class c extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
    final /* synthetic */ Uri $editedFileContentUri;
    final /* synthetic */ MediaStoreEntry $entry;
    final /* synthetic */ File $file;
    final /* synthetic */ r4p $stateToSave;
    int label;
    final /* synthetic */ f this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(f fVar, MediaStoreEntry mediaStoreEntry, r4p r4pVar, File file, Uri uri, spj<? super c> spjVar) {
        super(2, spjVar);
        this.this$0 = fVar;
        this.$entry = mediaStoreEntry;
        this.$stateToSave = r4pVar;
        this.$file = file;
        this.$editedFileContentUri = uri;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        return new c(this.this$0, this.$entry, this.$stateToSave, this.$file, this.$editedFileContentUri, spjVar);
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
        return ((c) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.a.a(obj);
        this.this$0.m(this.$entry, this.$stateToSave, this.$file, this.$editedFileContentUri);
        return s3q0.a;
    }
}
