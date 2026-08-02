package org.bouncycastle.pqc.asn1;

import java.util.Vector;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Integer;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DEROctetString;
import org.bouncycastle.asn1.DERSequence;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;
import org.bouncycastle.pqc.crypto.gmss.GMSSLeaf;
import org.bouncycastle.pqc.crypto.gmss.GMSSParameters;
import org.bouncycastle.pqc.crypto.gmss.GMSSRootCalc;
import org.bouncycastle.pqc.crypto.gmss.GMSSRootSig;
import org.bouncycastle.pqc.crypto.gmss.Treehash;

/* loaded from: classes5.dex */
public class GMSSPrivateKey extends ASN1Object {
    private ASN1Primitive primitive;

    private GMSSPrivateKey(ASN1Sequence aSN1Sequence) {
        ASN1Sequence aSN1Sequence2 = (ASN1Sequence) aSN1Sequence.getObjectAt(0);
        int[] iArr = new int[aSN1Sequence2.size()];
        for (int i10 = 0; i10 < aSN1Sequence2.size(); i10++) {
            iArr[i10] = checkBigIntegerInIntRange(aSN1Sequence2.getObjectAt(i10));
        }
        ASN1Sequence aSN1Sequence3 = (ASN1Sequence) aSN1Sequence.getObjectAt(1);
        int size = aSN1Sequence3.size();
        byte[][] bArr = new byte[size][];
        for (int i11 = 0; i11 < size; i11++) {
            bArr[i11] = ((DEROctetString) aSN1Sequence3.getObjectAt(i11)).getOctets();
        }
        ASN1Sequence aSN1Sequence4 = (ASN1Sequence) aSN1Sequence.getObjectAt(2);
        int size2 = aSN1Sequence4.size();
        byte[][] bArr2 = new byte[size2][];
        for (int i12 = 0; i12 < size2; i12++) {
            bArr2[i12] = ((DEROctetString) aSN1Sequence4.getObjectAt(i12)).getOctets();
        }
        ASN1Sequence aSN1Sequence5 = (ASN1Sequence) aSN1Sequence.getObjectAt(3);
        int size3 = aSN1Sequence5.size();
        byte[][][] bArr3 = new byte[size3][][];
        for (int i13 = 0; i13 < size3; i13++) {
            ASN1Sequence aSN1Sequence6 = (ASN1Sequence) aSN1Sequence5.getObjectAt(i13);
            bArr3[i13] = new byte[aSN1Sequence6.size()][];
            int i14 = 0;
            while (true) {
                byte[][] bArr4 = bArr3[i13];
                if (i14 < bArr4.length) {
                    bArr4[i14] = ((DEROctetString) aSN1Sequence6.getObjectAt(i14)).getOctets();
                    i14++;
                }
            }
        }
        ASN1Sequence aSN1Sequence7 = (ASN1Sequence) aSN1Sequence.getObjectAt(4);
        int size4 = aSN1Sequence7.size();
        byte[][][] bArr5 = new byte[size4][][];
        for (int i15 = 0; i15 < size4; i15++) {
            ASN1Sequence aSN1Sequence8 = (ASN1Sequence) aSN1Sequence7.getObjectAt(i15);
            bArr5[i15] = new byte[aSN1Sequence8.size()][];
            int i16 = 0;
            while (true) {
                byte[][] bArr6 = bArr5[i15];
                if (i16 < bArr6.length) {
                    bArr6[i16] = ((DEROctetString) aSN1Sequence8.getObjectAt(i16)).getOctets();
                    i16++;
                }
            }
        }
        Treehash[][] treehashArr = new Treehash[((ASN1Sequence) aSN1Sequence.getObjectAt(5)).size()][];
    }

    private static int checkBigIntegerInIntRange(ASN1Encodable aSN1Encodable) {
        return ((ASN1Integer) aSN1Encodable).intValueExact();
    }

    private ASN1Primitive encode(int[] iArr, byte[][] bArr, byte[][] bArr2, byte[][][] bArr3, byte[][][] bArr4, byte[][][] bArr5, Treehash[][] treehashArr, Treehash[][] treehashArr2, Vector[] vectorArr, Vector[] vectorArr2, Vector[][] vectorArr3, Vector[][] vectorArr4, GMSSLeaf[] gMSSLeafArr, GMSSLeaf[] gMSSLeafArr2, GMSSLeaf[] gMSSLeafArr3, int[] iArr2, byte[][] bArr6, GMSSRootCalc[] gMSSRootCalcArr, byte[][] bArr7, GMSSRootSig[] gMSSRootSigArr, GMSSParameters gMSSParameters, AlgorithmIdentifier[] algorithmIdentifierArr) {
        int[] iArr3 = iArr;
        Treehash[][] treehashArr3 = treehashArr;
        Treehash[][] treehashArr4 = treehashArr2;
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector();
        ASN1EncodableVector aSN1EncodableVector2 = new ASN1EncodableVector();
        int i10 = 0;
        while (i10 < iArr3.length) {
            aSN1EncodableVector2.add(new ASN1Integer(iArr[i10]));
            i10++;
            iArr3 = iArr;
        }
        aSN1EncodableVector.add(new DERSequence(aSN1EncodableVector2));
        ASN1EncodableVector aSN1EncodableVector3 = new ASN1EncodableVector();
        for (byte[] bArr8 : bArr) {
            aSN1EncodableVector3.add(new DEROctetString(bArr8));
        }
        aSN1EncodableVector.add(new DERSequence(aSN1EncodableVector3));
        ASN1EncodableVector aSN1EncodableVector4 = new ASN1EncodableVector();
        for (byte[] bArr9 : bArr2) {
            aSN1EncodableVector4.add(new DEROctetString(bArr9));
        }
        aSN1EncodableVector.add(new DERSequence(aSN1EncodableVector4));
        ASN1EncodableVector aSN1EncodableVector5 = new ASN1EncodableVector();
        ASN1EncodableVector aSN1EncodableVector6 = new ASN1EncodableVector();
        for (byte[][] bArr10 : bArr3) {
            int i11 = 0;
            while (true) {
                if (i11 < bArr10.length) {
                    aSN1EncodableVector5.add(new DEROctetString(bArr10[i11]));
                    i11++;
                }
            }
            aSN1EncodableVector6.add(new DERSequence(aSN1EncodableVector5));
            aSN1EncodableVector5 = new ASN1EncodableVector();
        }
        aSN1EncodableVector.add(new DERSequence(aSN1EncodableVector6));
        ASN1EncodableVector aSN1EncodableVector7 = new ASN1EncodableVector();
        ASN1EncodableVector aSN1EncodableVector8 = new ASN1EncodableVector();
        for (byte[][] bArr11 : bArr4) {
            int i12 = 0;
            while (true) {
                if (i12 < bArr11.length) {
                    aSN1EncodableVector7.add(new DEROctetString(bArr11[i12]));
                    i12++;
                }
            }
            aSN1EncodableVector8.add(new DERSequence(aSN1EncodableVector7));
            aSN1EncodableVector7 = new ASN1EncodableVector();
        }
        aSN1EncodableVector.add(new DERSequence(aSN1EncodableVector8));
        ASN1EncodableVector aSN1EncodableVector9 = new ASN1EncodableVector();
        ASN1EncodableVector aSN1EncodableVector10 = new ASN1EncodableVector();
        ASN1EncodableVector aSN1EncodableVector11 = new ASN1EncodableVector();
        ASN1EncodableVector aSN1EncodableVector12 = new ASN1EncodableVector();
        ASN1EncodableVector aSN1EncodableVector13 = new ASN1EncodableVector();
        int i13 = 0;
        while (i13 < treehashArr3.length) {
            int i14 = 0;
            while (i14 < treehashArr3[i13].length) {
                aSN1EncodableVector11.add(new DERSequence(algorithmIdentifierArr[0]));
                int i15 = treehashArr3[i13][i14].getStatInt()[1];
                aSN1EncodableVector12.add(new DEROctetString(treehashArr3[i13][i14].getStatByte()[0]));
                aSN1EncodableVector12.add(new DEROctetString(treehashArr3[i13][i14].getStatByte()[1]));
                aSN1EncodableVector12.add(new DEROctetString(treehashArr3[i13][i14].getStatByte()[2]));
                int i16 = 0;
                while (i16 < i15) {
                    aSN1EncodableVector12.add(new DEROctetString(treehashArr3[i13][i14].getStatByte()[i16 + 3]));
                    i16++;
                    treehashArr3 = treehashArr;
                }
                aSN1EncodableVector11.add(new DERSequence(aSN1EncodableVector12));
                aSN1EncodableVector12 = new ASN1EncodableVector();
                aSN1EncodableVector13.add(new ASN1Integer(treehashArr[i13][i14].getStatInt()[0]));
                aSN1EncodableVector13.add(new ASN1Integer(i15));
                aSN1EncodableVector13.add(new ASN1Integer(treehashArr[i13][i14].getStatInt()[2]));
                aSN1EncodableVector13.add(new ASN1Integer(treehashArr[i13][i14].getStatInt()[3]));
                aSN1EncodableVector13.add(new ASN1Integer(treehashArr[i13][i14].getStatInt()[4]));
                aSN1EncodableVector13.add(new ASN1Integer(treehashArr[i13][i14].getStatInt()[5]));
                int i17 = 0;
                while (i17 < i15) {
                    aSN1EncodableVector13.add(new ASN1Integer(treehashArr[i13][i14].getStatInt()[i17 + 6]));
                    i17++;
                    i13 = i13;
                    i14 = i14;
                }
                aSN1EncodableVector11.add(new DERSequence(aSN1EncodableVector13));
                aSN1EncodableVector13 = new ASN1EncodableVector();
                aSN1EncodableVector10.add(new DERSequence(aSN1EncodableVector11));
                aSN1EncodableVector11 = new ASN1EncodableVector();
                i14++;
                treehashArr3 = treehashArr;
            }
            aSN1EncodableVector9.add(new DERSequence(aSN1EncodableVector10));
            aSN1EncodableVector10 = new ASN1EncodableVector();
            i13++;
            treehashArr3 = treehashArr;
        }
        aSN1EncodableVector.add(new DERSequence(aSN1EncodableVector9));
        ASN1EncodableVector aSN1EncodableVector14 = new ASN1EncodableVector();
        ASN1EncodableVector aSN1EncodableVector15 = new ASN1EncodableVector();
        ASN1EncodableVector aSN1EncodableVector16 = new ASN1EncodableVector();
        ASN1EncodableVector aSN1EncodableVector17 = new ASN1EncodableVector();
        ASN1EncodableVector aSN1EncodableVector18 = new ASN1EncodableVector();
        int i18 = 0;
        while (i18 < treehashArr4.length) {
            int i19 = 0;
            while (i19 < treehashArr4[i18].length) {
                aSN1EncodableVector16.add(new DERSequence(algorithmIdentifierArr[0]));
                int i20 = treehashArr4[i18][i19].getStatInt()[1];
                aSN1EncodableVector17.add(new DEROctetString(treehashArr4[i18][i19].getStatByte()[0]));
                aSN1EncodableVector17.add(new DEROctetString(treehashArr4[i18][i19].getStatByte()[1]));
                aSN1EncodableVector17.add(new DEROctetString(treehashArr4[i18][i19].getStatByte()[2]));
                for (int i21 = 0; i21 < i20; i21++) {
                    aSN1EncodableVector17.add(new DEROctetString(treehashArr4[i18][i19].getStatByte()[i21 + 3]));
                }
                aSN1EncodableVector16.add(new DERSequence(aSN1EncodableVector17));
                aSN1EncodableVector17 = new ASN1EncodableVector();
                aSN1EncodableVector18.add(new ASN1Integer(treehashArr4[i18][i19].getStatInt()[0]));
                aSN1EncodableVector18.add(new ASN1Integer(i20));
                aSN1EncodableVector18.add(new ASN1Integer(treehashArr4[i18][i19].getStatInt()[2]));
                aSN1EncodableVector18.add(new ASN1Integer(treehashArr4[i18][i19].getStatInt()[3]));
                aSN1EncodableVector18.add(new ASN1Integer(treehashArr4[i18][i19].getStatInt()[4]));
                aSN1EncodableVector18.add(new ASN1Integer(treehashArr4[i18][i19].getStatInt()[5]));
                int i22 = 0;
                while (i22 < i20) {
                    aSN1EncodableVector18.add(new ASN1Integer(treehashArr4[i18][i19].getStatInt()[i22 + 6]));
                    i22++;
                    treehashArr4 = treehashArr2;
                    i18 = i18;
                }
                aSN1EncodableVector16.add(new DERSequence(aSN1EncodableVector18));
                aSN1EncodableVector18 = new ASN1EncodableVector();
                aSN1EncodableVector15.add(new DERSequence(aSN1EncodableVector16));
                aSN1EncodableVector16 = new ASN1EncodableVector();
                i19++;
                treehashArr4 = treehashArr2;
                i18 = i18;
            }
            aSN1EncodableVector14.add(new DERSequence(new DERSequence(aSN1EncodableVector15)));
            aSN1EncodableVector15 = new ASN1EncodableVector();
            i18++;
            treehashArr4 = treehashArr2;
        }
        aSN1EncodableVector.add(new DERSequence(aSN1EncodableVector14));
        ASN1EncodableVector aSN1EncodableVector19 = new ASN1EncodableVector();
        ASN1EncodableVector aSN1EncodableVector20 = new ASN1EncodableVector();
        for (byte[][] bArr12 : bArr5) {
            int i23 = 0;
            while (true) {
                if (i23 < bArr12.length) {
                    aSN1EncodableVector19.add(new DEROctetString(bArr12[i23]));
                    i23++;
                }
            }
            aSN1EncodableVector20.add(new DERSequence(aSN1EncodableVector19));
            aSN1EncodableVector19 = new ASN1EncodableVector();
        }
        aSN1EncodableVector.add(new DERSequence(aSN1EncodableVector20));
        ASN1EncodableVector aSN1EncodableVector21 = new ASN1EncodableVector();
        ASN1EncodableVector aSN1EncodableVector22 = new ASN1EncodableVector();
        for (int i24 = 0; i24 < vectorArr.length; i24++) {
            for (int i25 = 0; i25 < vectorArr[i24].size(); i25++) {
                aSN1EncodableVector21.add(new DEROctetString((byte[]) vectorArr[i24].elementAt(i25)));
            }
            aSN1EncodableVector22.add(new DERSequence(aSN1EncodableVector21));
            aSN1EncodableVector21 = new ASN1EncodableVector();
        }
        aSN1EncodableVector.add(new DERSequence(aSN1EncodableVector22));
        ASN1EncodableVector aSN1EncodableVector23 = new ASN1EncodableVector();
        ASN1EncodableVector aSN1EncodableVector24 = new ASN1EncodableVector();
        for (int i26 = 0; i26 < vectorArr2.length; i26++) {
            for (int i27 = 0; i27 < vectorArr2[i26].size(); i27++) {
                aSN1EncodableVector23.add(new DEROctetString((byte[]) vectorArr2[i26].elementAt(i27)));
            }
            aSN1EncodableVector24.add(new DERSequence(aSN1EncodableVector23));
            aSN1EncodableVector23 = new ASN1EncodableVector();
        }
        aSN1EncodableVector.add(new DERSequence(aSN1EncodableVector24));
        ASN1EncodableVector aSN1EncodableVector25 = new ASN1EncodableVector();
        ASN1EncodableVector aSN1EncodableVector26 = new ASN1EncodableVector();
        ASN1EncodableVector aSN1EncodableVector27 = new ASN1EncodableVector();
        for (int i28 = 0; i28 < vectorArr3.length; i28++) {
            for (int i29 = 0; i29 < vectorArr3[i28].length; i29++) {
                for (int i30 = 0; i30 < vectorArr3[i28][i29].size(); i30++) {
                    aSN1EncodableVector25.add(new DEROctetString((byte[]) vectorArr3[i28][i29].elementAt(i30)));
                }
                aSN1EncodableVector26.add(new DERSequence(aSN1EncodableVector25));
                aSN1EncodableVector25 = new ASN1EncodableVector();
            }
            aSN1EncodableVector27.add(new DERSequence(aSN1EncodableVector26));
            aSN1EncodableVector26 = new ASN1EncodableVector();
        }
        aSN1EncodableVector.add(new DERSequence(aSN1EncodableVector27));
        ASN1EncodableVector aSN1EncodableVector28 = new ASN1EncodableVector();
        ASN1EncodableVector aSN1EncodableVector29 = new ASN1EncodableVector();
        ASN1EncodableVector aSN1EncodableVector30 = new ASN1EncodableVector();
        for (int i31 = 0; i31 < vectorArr4.length; i31++) {
            for (int i32 = 0; i32 < vectorArr4[i31].length; i32++) {
                for (int i33 = 0; i33 < vectorArr4[i31][i32].size(); i33++) {
                    aSN1EncodableVector28.add(new DEROctetString((byte[]) vectorArr4[i31][i32].elementAt(i33)));
                }
                aSN1EncodableVector29.add(new DERSequence(aSN1EncodableVector28));
                aSN1EncodableVector28 = new ASN1EncodableVector();
            }
            aSN1EncodableVector30.add(new DERSequence(aSN1EncodableVector29));
            aSN1EncodableVector29 = new ASN1EncodableVector();
        }
        aSN1EncodableVector.add(new DERSequence(aSN1EncodableVector30));
        ASN1EncodableVector aSN1EncodableVector31 = new ASN1EncodableVector();
        ASN1EncodableVector aSN1EncodableVector32 = new ASN1EncodableVector();
        ASN1EncodableVector aSN1EncodableVector33 = new ASN1EncodableVector();
        ASN1EncodableVector aSN1EncodableVector34 = new ASN1EncodableVector();
        for (int i34 = 0; i34 < gMSSLeafArr.length; i34++) {
            aSN1EncodableVector32.add(new DERSequence(algorithmIdentifierArr[0]));
            byte[][] statByte = gMSSLeafArr[i34].getStatByte();
            aSN1EncodableVector33.add(new DEROctetString(statByte[0]));
            aSN1EncodableVector33.add(new DEROctetString(statByte[1]));
            aSN1EncodableVector33.add(new DEROctetString(statByte[2]));
            aSN1EncodableVector33.add(new DEROctetString(statByte[3]));
            aSN1EncodableVector32.add(new DERSequence(aSN1EncodableVector33));
            aSN1EncodableVector33 = new ASN1EncodableVector();
            int[] statInt = gMSSLeafArr[i34].getStatInt();
            aSN1EncodableVector34.add(new ASN1Integer(statInt[0]));
            aSN1EncodableVector34.add(new ASN1Integer(statInt[1]));
            aSN1EncodableVector34.add(new ASN1Integer(statInt[2]));
            aSN1EncodableVector34.add(new ASN1Integer(statInt[3]));
            aSN1EncodableVector32.add(new DERSequence(aSN1EncodableVector34));
            aSN1EncodableVector34 = new ASN1EncodableVector();
            aSN1EncodableVector31.add(new DERSequence(aSN1EncodableVector32));
            aSN1EncodableVector32 = new ASN1EncodableVector();
        }
        aSN1EncodableVector.add(new DERSequence(aSN1EncodableVector31));
        ASN1EncodableVector aSN1EncodableVector35 = new ASN1EncodableVector();
        ASN1EncodableVector aSN1EncodableVector36 = new ASN1EncodableVector();
        ASN1EncodableVector aSN1EncodableVector37 = new ASN1EncodableVector();
        ASN1EncodableVector aSN1EncodableVector38 = new ASN1EncodableVector();
        for (int i35 = 0; i35 < gMSSLeafArr2.length; i35++) {
            aSN1EncodableVector36.add(new DERSequence(algorithmIdentifierArr[0]));
            byte[][] statByte2 = gMSSLeafArr2[i35].getStatByte();
            aSN1EncodableVector37.add(new DEROctetString(statByte2[0]));
            aSN1EncodableVector37.add(new DEROctetString(statByte2[1]));
            aSN1EncodableVector37.add(new DEROctetString(statByte2[2]));
            aSN1EncodableVector37.add(new DEROctetString(statByte2[3]));
            aSN1EncodableVector36.add(new DERSequence(aSN1EncodableVector37));
            aSN1EncodableVector37 = new ASN1EncodableVector();
            int[] statInt2 = gMSSLeafArr2[i35].getStatInt();
            aSN1EncodableVector38.add(new ASN1Integer(statInt2[0]));
            aSN1EncodableVector38.add(new ASN1Integer(statInt2[1]));
            aSN1EncodableVector38.add(new ASN1Integer(statInt2[2]));
            aSN1EncodableVector38.add(new ASN1Integer(statInt2[3]));
            aSN1EncodableVector36.add(new DERSequence(aSN1EncodableVector38));
            aSN1EncodableVector38 = new ASN1EncodableVector();
            aSN1EncodableVector35.add(new DERSequence(aSN1EncodableVector36));
            aSN1EncodableVector36 = new ASN1EncodableVector();
        }
        aSN1EncodableVector.add(new DERSequence(aSN1EncodableVector35));
        ASN1EncodableVector aSN1EncodableVector39 = new ASN1EncodableVector();
        ASN1EncodableVector aSN1EncodableVector40 = new ASN1EncodableVector();
        ASN1EncodableVector aSN1EncodableVector41 = new ASN1EncodableVector();
        ASN1EncodableVector aSN1EncodableVector42 = new ASN1EncodableVector();
        for (int i36 = 0; i36 < gMSSLeafArr3.length; i36++) {
            aSN1EncodableVector40.add(new DERSequence(algorithmIdentifierArr[0]));
            byte[][] statByte3 = gMSSLeafArr3[i36].getStatByte();
            aSN1EncodableVector41.add(new DEROctetString(statByte3[0]));
            aSN1EncodableVector41.add(new DEROctetString(statByte3[1]));
            aSN1EncodableVector41.add(new DEROctetString(statByte3[2]));
            aSN1EncodableVector41.add(new DEROctetString(statByte3[3]));
            aSN1EncodableVector40.add(new DERSequence(aSN1EncodableVector41));
            aSN1EncodableVector41 = new ASN1EncodableVector();
            int[] statInt3 = gMSSLeafArr3[i36].getStatInt();
            aSN1EncodableVector42.add(new ASN1Integer(statInt3[0]));
            aSN1EncodableVector42.add(new ASN1Integer(statInt3[1]));
            aSN1EncodableVector42.add(new ASN1Integer(statInt3[2]));
            aSN1EncodableVector42.add(new ASN1Integer(statInt3[3]));
            aSN1EncodableVector40.add(new DERSequence(aSN1EncodableVector42));
            aSN1EncodableVector42 = new ASN1EncodableVector();
            aSN1EncodableVector39.add(new DERSequence(aSN1EncodableVector40));
            aSN1EncodableVector40 = new ASN1EncodableVector();
        }
        aSN1EncodableVector.add(new DERSequence(aSN1EncodableVector39));
        ASN1EncodableVector aSN1EncodableVector43 = new ASN1EncodableVector();
        for (int i37 : iArr2) {
            aSN1EncodableVector43.add(new ASN1Integer(i37));
        }
        aSN1EncodableVector.add(new DERSequence(aSN1EncodableVector43));
        ASN1EncodableVector aSN1EncodableVector44 = new ASN1EncodableVector();
        for (byte[] bArr13 : bArr6) {
            aSN1EncodableVector44.add(new DEROctetString(bArr13));
        }
        aSN1EncodableVector.add(new DERSequence(aSN1EncodableVector44));
        ASN1EncodableVector aSN1EncodableVector45 = new ASN1EncodableVector();
        ASN1EncodableVector aSN1EncodableVector46 = new ASN1EncodableVector();
        new ASN1EncodableVector();
        ASN1EncodableVector aSN1EncodableVector47 = new ASN1EncodableVector();
        ASN1EncodableVector aSN1EncodableVector48 = new ASN1EncodableVector();
        ASN1EncodableVector aSN1EncodableVector49 = new ASN1EncodableVector();
        ASN1EncodableVector aSN1EncodableVector50 = new ASN1EncodableVector();
        int i38 = 0;
        while (i38 < gMSSRootCalcArr.length) {
            aSN1EncodableVector46.add(new DERSequence(algorithmIdentifierArr[0]));
            new ASN1EncodableVector();
            int i39 = gMSSRootCalcArr[i38].getStatInt()[0];
            int i40 = gMSSRootCalcArr[i38].getStatInt()[7];
            aSN1EncodableVector47.add(new DEROctetString(gMSSRootCalcArr[i38].getStatByte()[0]));
            int i41 = 0;
            while (i41 < i39) {
                i41++;
                aSN1EncodableVector47.add(new DEROctetString(gMSSRootCalcArr[i38].getStatByte()[i41]));
            }
            for (int i42 = 0; i42 < i40; i42++) {
                aSN1EncodableVector47.add(new DEROctetString(gMSSRootCalcArr[i38].getStatByte()[i39 + 1 + i42]));
            }
            aSN1EncodableVector46.add(new DERSequence(aSN1EncodableVector47));
            ASN1EncodableVector aSN1EncodableVector51 = new ASN1EncodableVector();
            aSN1EncodableVector48.add(new ASN1Integer(i39));
            aSN1EncodableVector48.add(new ASN1Integer(gMSSRootCalcArr[i38].getStatInt()[1]));
            aSN1EncodableVector48.add(new ASN1Integer(gMSSRootCalcArr[i38].getStatInt()[2]));
            aSN1EncodableVector48.add(new ASN1Integer(gMSSRootCalcArr[i38].getStatInt()[3]));
            aSN1EncodableVector48.add(new ASN1Integer(gMSSRootCalcArr[i38].getStatInt()[4]));
            aSN1EncodableVector48.add(new ASN1Integer(gMSSRootCalcArr[i38].getStatInt()[5]));
            aSN1EncodableVector48.add(new ASN1Integer(gMSSRootCalcArr[i38].getStatInt()[6]));
            aSN1EncodableVector48.add(new ASN1Integer(i40));
            for (int i43 = 0; i43 < i39; i43++) {
                aSN1EncodableVector48.add(new ASN1Integer(gMSSRootCalcArr[i38].getStatInt()[i43 + 8]));
            }
            for (int i44 = 0; i44 < i40; i44++) {
                aSN1EncodableVector48.add(new ASN1Integer(gMSSRootCalcArr[i38].getStatInt()[i39 + 8 + i44]));
            }
            aSN1EncodableVector46.add(new DERSequence(aSN1EncodableVector48));
            ASN1EncodableVector aSN1EncodableVector52 = new ASN1EncodableVector();
            ASN1EncodableVector aSN1EncodableVector53 = new ASN1EncodableVector();
            ASN1EncodableVector aSN1EncodableVector54 = new ASN1EncodableVector();
            ASN1EncodableVector aSN1EncodableVector55 = new ASN1EncodableVector();
            if (gMSSRootCalcArr[i38].getTreehash() != null) {
                int i45 = 0;
                while (i45 < gMSSRootCalcArr[i38].getTreehash().length) {
                    aSN1EncodableVector53.add(new DERSequence(algorithmIdentifierArr[0]));
                    int i46 = gMSSRootCalcArr[i38].getTreehash()[i45].getStatInt()[1];
                    aSN1EncodableVector54.add(new DEROctetString(gMSSRootCalcArr[i38].getTreehash()[i45].getStatByte()[0]));
                    aSN1EncodableVector54.add(new DEROctetString(gMSSRootCalcArr[i38].getTreehash()[i45].getStatByte()[1]));
                    aSN1EncodableVector54.add(new DEROctetString(gMSSRootCalcArr[i38].getTreehash()[i45].getStatByte()[2]));
                    int i47 = 0;
                    while (i47 < i46) {
                        aSN1EncodableVector54.add(new DEROctetString(gMSSRootCalcArr[i38].getTreehash()[i45].getStatByte()[i47 + 3]));
                        i47++;
                        aSN1EncodableVector51 = aSN1EncodableVector51;
                    }
                    ASN1EncodableVector aSN1EncodableVector56 = aSN1EncodableVector51;
                    aSN1EncodableVector53.add(new DERSequence(aSN1EncodableVector54));
                    aSN1EncodableVector54 = new ASN1EncodableVector();
                    aSN1EncodableVector55.add(new ASN1Integer(gMSSRootCalcArr[i38].getTreehash()[i45].getStatInt()[0]));
                    aSN1EncodableVector55.add(new ASN1Integer(i46));
                    aSN1EncodableVector55.add(new ASN1Integer(gMSSRootCalcArr[i38].getTreehash()[i45].getStatInt()[2]));
                    aSN1EncodableVector55.add(new ASN1Integer(gMSSRootCalcArr[i38].getTreehash()[i45].getStatInt()[3]));
                    aSN1EncodableVector55.add(new ASN1Integer(gMSSRootCalcArr[i38].getTreehash()[i45].getStatInt()[4]));
                    aSN1EncodableVector55.add(new ASN1Integer(gMSSRootCalcArr[i38].getTreehash()[i45].getStatInt()[5]));
                    int i48 = 0;
                    while (i48 < i46) {
                        aSN1EncodableVector55.add(new ASN1Integer(gMSSRootCalcArr[i38].getTreehash()[i45].getStatInt()[i48 + 6]));
                        i48++;
                        aSN1EncodableVector52 = aSN1EncodableVector52;
                    }
                    aSN1EncodableVector53.add(new DERSequence(aSN1EncodableVector55));
                    aSN1EncodableVector55 = new ASN1EncodableVector();
                    aSN1EncodableVector49.add(new DERSequence(aSN1EncodableVector53));
                    aSN1EncodableVector53 = new ASN1EncodableVector();
                    i45++;
                    aSN1EncodableVector51 = aSN1EncodableVector56;
                }
            }
            ASN1EncodableVector aSN1EncodableVector57 = aSN1EncodableVector51;
            ASN1EncodableVector aSN1EncodableVector58 = aSN1EncodableVector52;
            aSN1EncodableVector46.add(new DERSequence(aSN1EncodableVector49));
            aSN1EncodableVector49 = new ASN1EncodableVector();
            ASN1EncodableVector aSN1EncodableVector59 = new ASN1EncodableVector();
            if (gMSSRootCalcArr[i38].getRetain() != null) {
                for (int i49 = 0; i49 < gMSSRootCalcArr[i38].getRetain().length; i49++) {
                    for (int i50 = 0; i50 < gMSSRootCalcArr[i38].getRetain()[i49].size(); i50++) {
                        aSN1EncodableVector59.add(new DEROctetString((byte[]) gMSSRootCalcArr[i38].getRetain()[i49].elementAt(i50)));
                    }
                    aSN1EncodableVector50.add(new DERSequence(aSN1EncodableVector59));
                    aSN1EncodableVector59 = new ASN1EncodableVector();
                }
            }
            aSN1EncodableVector46.add(new DERSequence(aSN1EncodableVector50));
            aSN1EncodableVector50 = new ASN1EncodableVector();
            aSN1EncodableVector45.add(new DERSequence(aSN1EncodableVector46));
            aSN1EncodableVector46 = new ASN1EncodableVector();
            i38++;
            aSN1EncodableVector47 = aSN1EncodableVector57;
            aSN1EncodableVector48 = aSN1EncodableVector58;
        }
        aSN1EncodableVector.add(new DERSequence(aSN1EncodableVector45));
        ASN1EncodableVector aSN1EncodableVector60 = new ASN1EncodableVector();
        for (byte[] bArr14 : bArr7) {
            aSN1EncodableVector60.add(new DEROctetString(bArr14));
        }
        aSN1EncodableVector.add(new DERSequence(aSN1EncodableVector60));
        ASN1EncodableVector aSN1EncodableVector61 = new ASN1EncodableVector();
        ASN1EncodableVector aSN1EncodableVector62 = new ASN1EncodableVector();
        new ASN1EncodableVector();
        ASN1EncodableVector aSN1EncodableVector63 = new ASN1EncodableVector();
        ASN1EncodableVector aSN1EncodableVector64 = new ASN1EncodableVector();
        for (int i51 = 0; i51 < gMSSRootSigArr.length; i51++) {
            aSN1EncodableVector62.add(new DERSequence(algorithmIdentifierArr[0]));
            new ASN1EncodableVector();
            aSN1EncodableVector63.add(new DEROctetString(gMSSRootSigArr[i51].getStatByte()[0]));
            aSN1EncodableVector63.add(new DEROctetString(gMSSRootSigArr[i51].getStatByte()[1]));
            aSN1EncodableVector63.add(new DEROctetString(gMSSRootSigArr[i51].getStatByte()[2]));
            aSN1EncodableVector63.add(new DEROctetString(gMSSRootSigArr[i51].getStatByte()[3]));
            aSN1EncodableVector63.add(new DEROctetString(gMSSRootSigArr[i51].getStatByte()[4]));
            aSN1EncodableVector62.add(new DERSequence(aSN1EncodableVector63));
            aSN1EncodableVector63 = new ASN1EncodableVector();
            aSN1EncodableVector64.add(new ASN1Integer(gMSSRootSigArr[i51].getStatInt()[0]));
            aSN1EncodableVector64.add(new ASN1Integer(gMSSRootSigArr[i51].getStatInt()[1]));
            aSN1EncodableVector64.add(new ASN1Integer(gMSSRootSigArr[i51].getStatInt()[2]));
            aSN1EncodableVector64.add(new ASN1Integer(gMSSRootSigArr[i51].getStatInt()[3]));
            aSN1EncodableVector64.add(new ASN1Integer(gMSSRootSigArr[i51].getStatInt()[4]));
            aSN1EncodableVector64.add(new ASN1Integer(gMSSRootSigArr[i51].getStatInt()[5]));
            aSN1EncodableVector64.add(new ASN1Integer(gMSSRootSigArr[i51].getStatInt()[6]));
            aSN1EncodableVector64.add(new ASN1Integer(gMSSRootSigArr[i51].getStatInt()[7]));
            aSN1EncodableVector64.add(new ASN1Integer(gMSSRootSigArr[i51].getStatInt()[8]));
            aSN1EncodableVector62.add(new DERSequence(aSN1EncodableVector64));
            aSN1EncodableVector64 = new ASN1EncodableVector();
            aSN1EncodableVector61.add(new DERSequence(aSN1EncodableVector62));
            aSN1EncodableVector62 = new ASN1EncodableVector();
        }
        aSN1EncodableVector.add(new DERSequence(aSN1EncodableVector61));
        ASN1EncodableVector aSN1EncodableVector65 = new ASN1EncodableVector();
        ASN1EncodableVector aSN1EncodableVector66 = new ASN1EncodableVector();
        ASN1EncodableVector aSN1EncodableVector67 = new ASN1EncodableVector();
        ASN1EncodableVector aSN1EncodableVector68 = new ASN1EncodableVector();
        for (int i52 = 0; i52 < gMSSParameters.getHeightOfTrees().length; i52++) {
            aSN1EncodableVector66.add(new ASN1Integer(gMSSParameters.getHeightOfTrees()[i52]));
            aSN1EncodableVector67.add(new ASN1Integer(gMSSParameters.getWinternitzParameter()[i52]));
            aSN1EncodableVector68.add(new ASN1Integer(gMSSParameters.getK()[i52]));
        }
        aSN1EncodableVector65.add(new ASN1Integer(gMSSParameters.getNumOfLayers()));
        aSN1EncodableVector65.add(new DERSequence(aSN1EncodableVector66));
        aSN1EncodableVector65.add(new DERSequence(aSN1EncodableVector67));
        aSN1EncodableVector65.add(new DERSequence(aSN1EncodableVector68));
        aSN1EncodableVector.add(new DERSequence(aSN1EncodableVector65));
        ASN1EncodableVector aSN1EncodableVector69 = new ASN1EncodableVector();
        for (AlgorithmIdentifier algorithmIdentifier : algorithmIdentifierArr) {
            aSN1EncodableVector69.add(algorithmIdentifier);
        }
        aSN1EncodableVector.add(new DERSequence(aSN1EncodableVector69));
        return new DERSequence(aSN1EncodableVector);
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        return this.primitive;
    }

    public GMSSPrivateKey(int[] iArr, byte[][] bArr, byte[][] bArr2, byte[][][] bArr3, byte[][][] bArr4, Treehash[][] treehashArr, Treehash[][] treehashArr2, Vector[] vectorArr, Vector[] vectorArr2, Vector[][] vectorArr3, Vector[][] vectorArr4, byte[][][] bArr5, GMSSLeaf[] gMSSLeafArr, GMSSLeaf[] gMSSLeafArr2, GMSSLeaf[] gMSSLeafArr3, int[] iArr2, byte[][] bArr6, GMSSRootCalc[] gMSSRootCalcArr, byte[][] bArr7, GMSSRootSig[] gMSSRootSigArr, GMSSParameters gMSSParameters, AlgorithmIdentifier algorithmIdentifier) {
        this.primitive = encode(iArr, bArr, bArr2, bArr3, bArr4, bArr5, treehashArr, treehashArr2, vectorArr, vectorArr2, vectorArr3, vectorArr4, gMSSLeafArr, gMSSLeafArr2, gMSSLeafArr3, iArr2, bArr6, gMSSRootCalcArr, bArr7, gMSSRootSigArr, gMSSParameters, new AlgorithmIdentifier[]{algorithmIdentifier});
    }
}
