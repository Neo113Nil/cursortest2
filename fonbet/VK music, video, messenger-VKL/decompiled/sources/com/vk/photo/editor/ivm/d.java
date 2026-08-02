package com.vk.photo.editor.ivm;

import com.vk.photo.editor.ivm.EditorMessage;
import com.vk.photo.editor.ivm.a;
import kotlin.NoWhenBranchMatchedException;
import xsna.bdn;
import xsna.bpn0;
import xsna.dnh;
import xsna.myc0;
import xsna.owx;
import xsna.p5h;
import xsna.pr6;
import xsna.x3p;
import xsna.yvj;
import xsna.z9;

/* compiled from: EditorStore.kt */
/* loaded from: classes4.dex */
public final class d extends owx<EditorState, EditorMessage, a, x3p> {
    public final dnh e;
    public final p5h f;
    public final bpn0 g;

    public d(dnh dnhVar, p5h p5hVar) {
        super(new b(new EditorState(null, null, null, 255)));
        this.e = dnhVar;
        this.f = p5hVar;
        this.g = new bpn0(new pr6(11));
    }

    public final void a(EditorMessage editorMessage) {
        if (editorMessage instanceof EditorMessage.f) {
            myc0.h((yvj) this.e.invoke(), bdn.b, null, new c(this, (EditorMessage.f) editorMessage, null), 2);
            return;
        }
        boolean z = editorMessage instanceof EditorMessage.h;
        z9 z9Var = this.a;
        if (z) {
            z9Var.d(new a.i(((EditorMessage.h) editorMessage).a));
            return;
        }
        if (editorMessage instanceof EditorMessage.i) {
            EditorMessage.i iVar = (EditorMessage.i) editorMessage;
            z9Var.d(new a.j(iVar.a, iVar.b, iVar.c));
            return;
        }
        if (editorMessage instanceof EditorMessage.j) {
            EditorMessage.j jVar = (EditorMessage.j) editorMessage;
            z9Var.d(new a.k(jVar.a, jVar.b));
            return;
        }
        if (editorMessage instanceof EditorMessage.e) {
            z9Var.d(new a.f(((EditorMessage.e) editorMessage).a));
            return;
        }
        if (editorMessage instanceof EditorMessage.d) {
            z9Var.d(a.e.a);
            return;
        }
        if (editorMessage instanceof EditorMessage.g) {
            z9Var.d(a.h.a);
            return;
        }
        if (editorMessage instanceof EditorMessage.c) {
            z9Var.d(a.c.a);
        } else if (editorMessage instanceof EditorMessage.a) {
            z9Var.d(a.C1466a.a);
        } else {
            if (!(editorMessage instanceof EditorMessage.b)) {
                throw new NoWhenBranchMatchedException();
            }
            z9Var.d(a.b.a);
        }
    }
}
