package lj;

import java.security.AlgorithmParameters;
import java.security.KeyFactory;
import java.security.Provider;

/* renamed from: lj.c, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC5476c implements InterfaceC5475b {

    /* renamed from: a, reason: collision with root package name */
    public final Provider f55873a;

    public AbstractC5476c(Provider provider) {
        this.f55873a = provider;
    }

    @Override // lj.InterfaceC5475b
    public AlgorithmParameters createAlgorithmParameters(String str) {
        return AlgorithmParameters.getInstance(str, this.f55873a);
    }

    @Override // lj.InterfaceC5475b
    public KeyFactory createKeyFactory(String str) {
        return KeyFactory.getInstance(str, this.f55873a);
    }
}
