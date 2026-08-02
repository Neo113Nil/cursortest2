package net.time4j.tz.model;

import java.io.Serializable;
import java.util.Collections;
import java.util.List;
import li.InterfaceC5467a;
import li.InterfaceC5472f;
import li.InterfaceC5473g;
import net.time4j.tz.m;
import net.time4j.tz.p;
import net.time4j.tz.q;

/* loaded from: classes5.dex */
public final class e implements m, Serializable {
    private static final long serialVersionUID = 1374714021808040253L;
    private final p offset;

    public e(p pVar) {
        this.offset = pVar;
    }

    @Override // net.time4j.tz.m
    public q a(InterfaceC5467a interfaceC5467a, InterfaceC5473g interfaceC5473g) {
        return null;
    }

    @Override // net.time4j.tz.m
    public boolean b() {
        return false;
    }

    @Override // net.time4j.tz.m
    public List c(InterfaceC5467a interfaceC5467a, InterfaceC5473g interfaceC5473g) {
        return Collections.singletonList(this.offset);
    }

    @Override // net.time4j.tz.m
    public p d() {
        return this.offset;
    }

    @Override // net.time4j.tz.m
    public q e(InterfaceC5472f interfaceC5472f) {
        return null;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof e) {
            return this.offset.equals(((e) obj).offset);
        }
        return false;
    }

    public int hashCode() {
        return this.offset.hashCode();
    }

    @Override // net.time4j.tz.m
    public boolean isEmpty() {
        return true;
    }

    public String toString() {
        return "EmptyTransitionModel=" + this.offset.a();
    }
}
