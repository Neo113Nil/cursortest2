package com.vk.folders.api.di;

import android.content.Context;
import com.vk.di.component.DiScopedComponent;
import com.vk.im.engine.models.dialogs.FolderType;
import io.reactivex.rxjava3.internal.operators.completable.i;
import kotlin.NotImplementedError;
import xsna.a2s;
import xsna.byr;
import xsna.l2s;
import xsna.pwj0;
import xsna.rxr;

/* compiled from: FoldersComponent.kt */
/* loaded from: classes.dex */
public interface FoldersComponent extends DiScopedComponent<pwj0> {
    public static final Companion Companion = Companion.a;

    /* compiled from: FoldersComponent.kt */
    /* loaded from: classes18.dex */
    public static final class Companion {
        public static final /* synthetic */ Companion a = new Companion();
        private static final FoldersComponent$Companion$STUB$1 STUB = new FoldersComponent() { // from class: com.vk.folders.api.di.FoldersComponent$Companion$STUB$1
            public final b a = new b();
            public final a b = new a();
            public final c c = new c();

            /* compiled from: FoldersComponent.kt */
            public static final class a implements rxr {
                @Override // xsna.rxr
                public final io.reactivex.rxjava3.core.a a() {
                    return i.b;
                }
            }

            /* compiled from: FoldersComponent.kt */
            public static final class b implements byr {
                @Override // xsna.byr
                public final io.reactivex.rxjava3.core.a b(FolderType folderType, boolean z) {
                    return io.reactivex.rxjava3.core.a.k(new NotImplementedError("Stub module"));
                }
            }

            @Override // com.vk.folders.api.di.FoldersComponent
            public final byr D3() {
                return this.a;
            }

            @Override // com.vk.folders.api.di.FoldersComponent
            public final a2s R2() {
                return this.c;
            }

            @Override // com.vk.folders.api.di.FoldersComponent
            public final rxr r3() {
                return this.b;
            }

            /* compiled from: FoldersComponent.kt */
            public static final class c implements a2s {
                @Override // xsna.a2s
                public final void a(Context context, l2s l2sVar) {
                }
            }
        };
    }

    byr D3();

    a2s R2();

    rxr r3();
}
