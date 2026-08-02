package androidx.camera.core.impl.utils;

import androidx.camera.core.impl.utils.ExifData;
import java.util.Collections;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;
import xsna.o4q;

/* compiled from: ExifData.java */
/* loaded from: classes11.dex */
public final class a implements Enumeration<Map<String, o4q>> {
    public final Enumeration<Map<String, o4q>> a;

    public a(ExifData.b bVar) {
        this.a = Collections.enumeration(bVar.a);
    }

    @Override // java.util.Enumeration
    public final boolean hasMoreElements() {
        return this.a.hasMoreElements();
    }

    @Override // java.util.Enumeration
    public final Map<String, o4q> nextElement() {
        return new HashMap(this.a.nextElement());
    }
}
