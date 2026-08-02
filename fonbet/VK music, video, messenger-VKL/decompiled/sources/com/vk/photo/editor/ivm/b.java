package com.vk.photo.editor.ivm;

import com.vk.photo.editor.ivm.EditorMessage;
import com.vk.photo.editor.ivm.EditorState;
import com.vk.photo.editor.ivm.a;
import com.vungle.ads.internal.protos.Sdk;
import kotlin.NoWhenBranchMatchedException;
import xsna.mwx;
import xsna.pn00;
import xsna.srg;
import xsna.utk0;
import xsna.wcj;
import xsna.wik;
import xsna.wzf;
import xsna.z9;

/* compiled from: EditorReducer.kt */
/* loaded from: classes4.dex */
public final class b extends z9 {
    @Override // xsna.z9
    public final void d(mwx mwxVar) {
        Object value;
        Object value2;
        Object value3;
        Object value4;
        EditorState editorState;
        Object value5;
        EditorState editorState2;
        EditorState.b bVar;
        Object value6;
        Object value7;
        a aVar = (a) mwxVar;
        utk0 utk0Var = (utk0) this.a;
        if (aVar instanceof a.g) {
            a.g gVar = (a.g) aVar;
            do {
                value7 = utk0Var.getValue();
            } while (!utk0Var.compareAndSet(value7, gVar.c ? new EditorState(gVar.a, gVar.b, EditorMessage.Source.Synthetic, 236) : EditorState.a((EditorState) value7, gVar.a, gVar.b, null, null, EditorMessage.Source.Synthetic, null, null, 236)));
            return;
        }
        if (aVar instanceof a.i) {
            a.i iVar = (a.i) aVar;
            do {
                value6 = utk0Var.getValue();
            } while (!utk0Var.compareAndSet(value6, EditorState.a((EditorState) value6, iVar.a, null, null, null, EditorMessage.Source.Synthetic, null, null, 238)));
            return;
        }
        if (aVar instanceof a.j) {
            g(new wzf((a.j) aVar, 13));
            return;
        }
        if (aVar instanceof a.k) {
            g(new srg((a.k) aVar, 11));
            return;
        }
        if (aVar instanceof a.f) {
            g(new wcj((a.f) aVar, 9));
            return;
        }
        if (aVar.equals(a.e.a)) {
            do {
                value5 = utk0Var.getValue();
                editorState2 = (EditorState) value5;
                bVar = editorState2.c;
            } while (!utk0Var.compareAndSet(value5, EditorState.a(editorState2, bVar.a, pn00.t(bVar.c), null, null, EditorMessage.Source.Synthetic, null, null, 236)));
            return;
        }
        if (aVar.equals(a.h.a)) {
            g(new wik(this, 4));
            return;
        }
        if (aVar.equals(a.c.a)) {
            do {
                value4 = utk0Var.getValue();
                editorState = (EditorState) value4;
                if (editorState.c()) {
                    EditorState.b bVar2 = editorState.d.get(editorState.b() + 1);
                    editorState = EditorState.a(editorState, bVar2.a, pn00.t(bVar2.c), bVar2, null, EditorMessage.Source.History, new EditorState.a(false, editorState.c, bVar2), null, 200);
                }
            } while (!utk0Var.compareAndSet(value4, editorState));
            return;
        }
        if (aVar.equals(a.C1466a.a)) {
            do {
                value3 = utk0Var.getValue();
            } while (!utk0Var.compareAndSet(value3, EditorState.a((EditorState) value3, null, null, null, null, null, null, null, Sdk.SDKError.Reason.STALE_CACHED_RESPONSE_VALUE)));
        } else if (aVar.equals(a.b.a)) {
            do {
                value2 = utk0Var.getValue();
            } while (!utk0Var.compareAndSet(value2, EditorState.a((EditorState) value2, null, null, null, null, null, null, EditorState.ErrorType.LowMemoryError, 127)));
        } else {
            if (!aVar.equals(a.d.a)) {
                throw new NoWhenBranchMatchedException();
            }
            do {
                value = utk0Var.getValue();
            } while (!utk0Var.compareAndSet(value, EditorState.a((EditorState) value, null, null, null, null, null, null, EditorState.ErrorType.RenderError, 127)));
        }
    }
}
