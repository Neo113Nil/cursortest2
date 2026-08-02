package io.invertase.firebase.app;

import Eb.h;
import Kg.c;
import androidx.annotation.Keep;
import com.google.firebase.components.ComponentRegistrar;
import java.util.Collections;
import java.util.List;
import mb.C5576c;

@Keep
/* loaded from: classes3.dex */
public class ReactNativeFirebaseAppRegistrar implements ComponentRegistrar {
    @Override // com.google.firebase.components.ComponentRegistrar
    public List<C5576c> getComponents() {
        return Collections.singletonList(h.b("react-native-firebase", c.f6647a));
    }
}
