package defpackage;

import java.io.Serializable;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Field;
import java.security.PrivilegedAction;
import java.util.ArrayList;

/* loaded from: classes7.dex */
public final class i02 implements PrivilegedAction {
    public final /* synthetic */ int a;
    public final /* synthetic */ Serializable b;

    public /* synthetic */ i02(int i, Serializable serializable) {
        this.a = i;
        this.b = serializable;
    }

    @Override // java.security.PrivilegedAction
    public final Object run() {
        String str;
        String str2;
        int i = this.a;
        Serializable serializable = this.b;
        switch (i) {
            case 0:
                l02 l02Var = (l02) serializable;
                l02.d("org.bouncycastle.jcajce.provider.digest.", l02.i);
                l02.d("org.bouncycastle.jcajce.provider.symmetric.", l02.d);
                l02.d("org.bouncycastle.jcajce.provider.symmetric.", l02.e);
                k02[] k02VarArr = l02.f;
                for (int i2 = 0; i2 != k02VarArr.length; i2++) {
                    k02 k02Var = k02VarArr[i2];
                    ((f74) g74.a.get()).getClass();
                    l02.e("org.bouncycastle.jcajce.provider.symmetric.", k02Var.a);
                }
                l02.d("org.bouncycastle.jcajce.provider.asymmetric.", l02.g);
                l02.d("org.bouncycastle.jcajce.provider.asymmetric.", l02.h);
                l02.d("org.bouncycastle.jcajce.provider.keystore.", l02.j);
                l02.d("org.bouncycastle.jcajce.provider.drbg.", l02.k);
                if (l02.c != null) {
                    str = "org.bouncycastle.jce.provider.PKIXCertPathValidatorSpi_8";
                    l02Var.put("CertPathValidator.RFC5280", "org.bouncycastle.jce.provider.PKIXCertPathValidatorSpi_8");
                    str2 = "org.bouncycastle.jce.provider.PKIXCertPathBuilderSpi_8";
                } else {
                    str = "org.bouncycastle.jce.provider.PKIXCertPathValidatorSpi";
                    l02Var.put("CertPathValidator.RFC5280", "org.bouncycastle.jce.provider.PKIXCertPathValidatorSpi");
                    str2 = "org.bouncycastle.jce.provider.PKIXCertPathBuilderSpi";
                }
                l02Var.put("CertPathBuilder.RFC5280", str2);
                l02Var.put("CertPathValidator.RFC3280", str);
                l02Var.put("CertPathBuilder.RFC3280", str2);
                l02Var.put("CertPathValidator.PKIX", str);
                l02Var.put("CertPathBuilder.PKIX", str2);
                l02Var.put("CertStore.Collection", "org.bouncycastle.jce.provider.CertStoreCollectionSpi");
                l02Var.put("CertStore.LDAP", "org.bouncycastle.jce.provider.X509LDAPCertStoreSpi");
                l02Var.put("CertStore.Multi", "org.bouncycastle.jce.provider.MultiCertStoreSpi");
                l02Var.put("Alg.Alias.CertStore.X509LDAP", "LDAP");
                l02Var.getService("SecureRandom", "DEFAULT");
                return null;
            default:
                Field[] declaredFields = ((Class) serializable).getDeclaredFields();
                ArrayList arrayList = new ArrayList(declaredFields.length);
                for (Field field : declaredFields) {
                    if (field.isEnumConstant()) {
                        arrayList.add(field);
                    }
                }
                Field[] fieldArr = (Field[]) arrayList.toArray(new Field[0]);
                AccessibleObject.setAccessible(fieldArr, true);
                return fieldArr;
        }
    }
}
