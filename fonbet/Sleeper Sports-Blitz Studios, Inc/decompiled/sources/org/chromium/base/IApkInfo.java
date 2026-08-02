package org.chromium.base;

import android.os.BadParcelableException;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes10.dex */
public class IApkInfo implements Parcelable {
    public static final Parcelable.Creator<IApkInfo> CREATOR = new Parcelable.Creator<IApkInfo>() { // from class: org.chromium.base.IApkInfo.1
        @Override // android.os.Parcelable.Creator
        public IApkInfo createFromParcel(Parcel _aidl_source) {
            IApkInfo iApkInfo = new IApkInfo();
            iApkInfo.readFromParcel(_aidl_source);
            return iApkInfo;
        }

        @Override // android.os.Parcelable.Creator
        public IApkInfo[] newArray(int _aidl_size) {
            return new IApkInfo[_aidl_size];
        }
    };
    public String hostPackageLabel;
    public String hostPackageName;
    public String hostVersionCode;
    public String installerPackageName;
    public String packageName;
    public String packageVersionCode;
    public String packageVersionName;
    public String resourcesVersion;
    public boolean isDebugApp = false;
    public int targetSdkVersion = 0;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int dataPosition = parcel.dataPosition();
        parcel.writeInt(0);
        parcel.writeString(this.hostPackageLabel);
        parcel.writeString(this.hostPackageName);
        parcel.writeString(this.hostVersionCode);
        parcel.writeString(this.installerPackageName);
        parcel.writeInt(this.isDebugApp ? 1 : 0);
        parcel.writeString(this.packageName);
        parcel.writeString(this.packageVersionCode);
        parcel.writeString(this.packageVersionName);
        parcel.writeString(this.resourcesVersion);
        parcel.writeInt(this.targetSdkVersion);
        int dataPosition2 = parcel.dataPosition();
        parcel.setDataPosition(dataPosition);
        parcel.writeInt(dataPosition2 - dataPosition);
        parcel.setDataPosition(dataPosition2);
    }

    public final void readFromParcel(Parcel _aidl_parcel) {
        int dataPosition = _aidl_parcel.dataPosition();
        int readInt = _aidl_parcel.readInt();
        try {
            if (readInt < 4) {
                throw new BadParcelableException("Parcelable too small");
            }
            if (_aidl_parcel.dataPosition() - dataPosition < readInt) {
                this.hostPackageLabel = _aidl_parcel.readString();
                if (_aidl_parcel.dataPosition() - dataPosition < readInt) {
                    this.hostPackageName = _aidl_parcel.readString();
                    if (_aidl_parcel.dataPosition() - dataPosition < readInt) {
                        this.hostVersionCode = _aidl_parcel.readString();
                        if (_aidl_parcel.dataPosition() - dataPosition < readInt) {
                            this.installerPackageName = _aidl_parcel.readString();
                            if (_aidl_parcel.dataPosition() - dataPosition < readInt) {
                                this.isDebugApp = _aidl_parcel.readInt() != 0;
                                if (_aidl_parcel.dataPosition() - dataPosition < readInt) {
                                    this.packageName = _aidl_parcel.readString();
                                    if (_aidl_parcel.dataPosition() - dataPosition < readInt) {
                                        this.packageVersionCode = _aidl_parcel.readString();
                                        if (_aidl_parcel.dataPosition() - dataPosition < readInt) {
                                            this.packageVersionName = _aidl_parcel.readString();
                                            if (_aidl_parcel.dataPosition() - dataPosition < readInt) {
                                                this.resourcesVersion = _aidl_parcel.readString();
                                                if (_aidl_parcel.dataPosition() - dataPosition < readInt) {
                                                    this.targetSdkVersion = _aidl_parcel.readInt();
                                                    if (dataPosition > Integer.MAX_VALUE - readInt) {
                                                        throw new BadParcelableException("Overflow in the size of parcelable");
                                                    }
                                                } else if (dataPosition > Integer.MAX_VALUE - readInt) {
                                                    throw new BadParcelableException("Overflow in the size of parcelable");
                                                }
                                            } else if (dataPosition > Integer.MAX_VALUE - readInt) {
                                                throw new BadParcelableException("Overflow in the size of parcelable");
                                            }
                                        } else if (dataPosition > Integer.MAX_VALUE - readInt) {
                                            throw new BadParcelableException("Overflow in the size of parcelable");
                                        }
                                    } else if (dataPosition > Integer.MAX_VALUE - readInt) {
                                        throw new BadParcelableException("Overflow in the size of parcelable");
                                    }
                                } else if (dataPosition > Integer.MAX_VALUE - readInt) {
                                    throw new BadParcelableException("Overflow in the size of parcelable");
                                }
                            } else if (dataPosition > Integer.MAX_VALUE - readInt) {
                                throw new BadParcelableException("Overflow in the size of parcelable");
                            }
                        } else if (dataPosition > Integer.MAX_VALUE - readInt) {
                            throw new BadParcelableException("Overflow in the size of parcelable");
                        }
                    } else if (dataPosition > Integer.MAX_VALUE - readInt) {
                        throw new BadParcelableException("Overflow in the size of parcelable");
                    }
                } else if (dataPosition > Integer.MAX_VALUE - readInt) {
                    throw new BadParcelableException("Overflow in the size of parcelable");
                }
            } else if (dataPosition > Integer.MAX_VALUE - readInt) {
                throw new BadParcelableException("Overflow in the size of parcelable");
            }
            _aidl_parcel.setDataPosition(dataPosition + readInt);
        } catch (Throwable th) {
            if (dataPosition > Integer.MAX_VALUE - readInt) {
                throw new BadParcelableException("Overflow in the size of parcelable");
            }
            _aidl_parcel.setDataPosition(dataPosition + readInt);
            throw th;
        }
    }
}
